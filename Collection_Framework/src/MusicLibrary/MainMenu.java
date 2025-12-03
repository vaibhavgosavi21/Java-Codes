package MusicLibrary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainMenu {

	private static Scanner sc = new Scanner(System.in);
	static List<Song> globaLibrary = new ArrayList<Song>();

	public static void initializeGlobalLib() {
		globaLibrary.add(new Song("Sundari      ", "Sanju Rathod  ", 3, "Romantic    ", "Marathi"));
		globaLibrary.add(new Song("Saiyara      ", "Kishore Kumar ", 5, "Romantic    ", "Hindi"));
		globaLibrary.add(new Song("Dhun         ", "Arjit Singh   ", 4, "Romantic    ", "Hindi"));
		globaLibrary.add(new Song("Shaky        ", "Sanju Rathod  ", 5, "Romantic    ", "Marathi"));
		globaLibrary.add(new Song("Shape of you ", "Ed Sheeran    ", 4, "POP         ", "English"));
		globaLibrary.add(new Song("Hambir Tu    ", "Adarsh Shinde ", 4, "Motivational", "Marathi"));

	}

	public static void main(String[] args) {

		initializeGlobalLib();
		System.out.println("       ----------- Music Library  -----------       ");
		System.out.println("Enter Name For your Playlist: ");
		MusicLibrary library = new MusicLibrary(sc.next());
		boolean flag = true;

		System.out.println("Music Libray");
		while (flag) {
			System.out.println("1. Add Song");
			System.out.println("2. View All songs");
			System.out.println("3. Play a Song");
			System.out.println("4. Remove a Song");
			System.out.println("5. Filter by Artist");
			System.out.println("6. Filter by Genre");
			System.out.println("7. Filter by Duration");
			System.out.println("8. View all songs in global library");
			System.out.println("9. Sort Song by Title");
			System.out.println("10. Sort Song by duration");
			System.out.println("11. Exist");
			System.out.println("Enter your Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> { // Add Song
				globaLibrary.forEach(val -> System.out.println(val.getTitle()));
				System.out.println("Enter a song name:");
				sc.nextLine();
				String songname = sc.nextLine();
				Song song = FindSongByName(songname);
				if (song != null) {
					library.addSong(song);
				} else {
					System.out.println("Song Not Present...");
				}

			}
			case 2 -> { // View All song in list
				System.out.println("------- Songs in PlayList -------");

				library.getSongs().forEach(val -> System.out
						.println(val.getTitle() + " By " + val.getArtist() + ": " + val.getDuration() + " Min"));

			}

			case 3 -> { // Play a song
				System.out.println("Enter a song name: ");
				sc.nextLine();
				String songname = sc.nextLine();
				Song song = FindSongByName(songname);
				System.out.println("------- Music Player -------");
				library.playSong(song);
			}

			case 4 -> { // remove from library
				if (library.getSongs().isEmpty()) {
					System.out.println("List is Empty ");
				} else {
					library.getSongs().forEach(val -> System.out.println(val.getTitle()));
					System.out.println("Enter song name to remove: ");
					sc.nextLine();
					String removeSong = sc.next();
					library.removeSong(removeSong);
				}

			}

			case 5 -> {
				System.out.println("Enter Artist Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				List<Song> songs = filterByArtist(name);
				System.out.println("------- Filter by Artist Name -------");

				songs.forEach(val -> System.out.println(val.getTitle() + " , " + val.getArtist()));
			}

			case 6 -> {
				System.out.println("Enter Genre: ");
				sc.nextLine();
				String gname = sc.nextLine();
				List<Song> songs = filterByGenre(gname);
				System.out.println("------- Filter by Genre -------");

				songs.forEach(val -> System.out.println(val.getTitle() + " , " + val.getGenre()));
			}

			case 7 -> {
				System.out.println("Enter MaxTime: ");
				int maxtime = sc.nextInt();
				System.out.println("Enter MinTime: ");
				int mintime = sc.nextInt();

				List<Song> songs = filterByDuration(maxtime, mintime);
				System.out.println("------- Filter by Duration -------");
				songs.forEach(val -> System.out.println(val.getTitle() + ",			 " + val.getDuration() + " Min"));

			}

			case 8 -> {
				System.out.println("		------- List of Songs -------		");
				System.out.println("  Title 			Artist Name	   Genre		Language		Duration");
				globaLibrary.forEach(val -> System.out.println(val.getTitle() + " 		" + val.getArtist() + " 	  "
						+ val.getGenre() + "	  " + val.getLang() + "  	" + val.getDuration() + " min"));
			}

			case 9 -> {
				System.out.println();
				System.out.println("------- Before Sorting -------");
				System.out.println("Title       	       Duration");

				globaLibrary.forEach(val -> System.out.println(val.getTitle() + "		" + val.getDuration()));
				System.out.println();
				sortSongByTitle();
				System.out.println("------- After Sorting -------");
				System.out.println("Title       	       Duration");

				globaLibrary.forEach(val -> System.out.println(val.getTitle() + "		" + val.getDuration()));

			}

			case 10 -> {
				System.out.println();
				System.out.println("1. Sort By Low to High");
				System.out.println("2. Sort By High to Low");
				System.out.println("Select Option: ");
				int ch = sc.nextInt();
				switch (ch) {
				case 1 -> {
					System.out.println();
					System.out.println("   *------ Sort By Low to High ------*   ");
					System.out.println("------- Before Sorting -------");
					System.out.println("Title       	       Duration");
					globaLibrary.forEach(val -> System.out.println(val.getTitle() + "		" + val.getDuration()+" min"));
					sortByDurationLtoH();
					System.out.println("------- After Sorting -------");
					System.out.println("Title       	       Duration");
					globaLibrary.forEach(val -> System.out.println(val.getTitle() + "		" + val.getDuration()+" min"));

				}

				case 2 -> {
					System.out.println();
					System.out.println("   ******* Sort By High to Low *******   ");
					System.out.println("   ---- Before Sorting ----  ");
					System.out.println("Title       	       Duration");
					globaLibrary.forEach(val -> System.out.println(val.getTitle() + "		" + val.getDuration()+" min"));
					sortByDurationHtoL();
					System.out.println("   ******* Sort By High to Low *******   ");
					System.out.println("   ---- After Sorting ----  ");
					System.out.println("Title       	       Duration");
					globaLibrary.forEach(val -> System.out.println(val.getTitle() + "		" + val.getDuration()+" min"));

				}
				}

			}

			case 11 -> {
				flag = false;
				System.out.println("Exited !");
			}
			default -> System.out.println("Invalid Choice");
			}
			System.out.println();
		}

	}

	public static void sortSongByTitle() {
		globaLibrary.sort((s1, s2) -> s1.getTitle().compareToIgnoreCase(s2.getTitle()));
	}

	private static List<Song> filterByDuration(int maxtime, int mintime) {
		// TODO Auto-generated method stub
		return globaLibrary.stream().filter(val -> val.getDuration() >= mintime && val.getDuration() <= maxtime)
				.collect(Collectors.toList());
	}

	private static List<Song> filterByGenre(String gname) {

		return globaLibrary.stream().filter(val -> val.getGenre().equalsIgnoreCase(gname)).collect(Collectors.toList());
	}

	private static List<Song> filterByArtist(String name) {

		return globaLibrary.stream().filter(val -> val.getArtist().equalsIgnoreCase(name)).collect(Collectors.toList());
	}

	private static void sortByDurationLtoH() {
		globaLibrary.sort(Comparator.comparingInt(Song::getDuration));

	}

	private static void sortByDurationHtoL() {
		globaLibrary.sort(Comparator.comparingInt(Song::getDuration).reversed());

	}

	private static Song FindSongByName(String songname) {
		for (Song s : globaLibrary) {
			if (s.getTitle().equalsIgnoreCase(songname)) {
				return s;
			}
		}
		return null;
	}

}
