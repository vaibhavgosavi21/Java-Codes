package MusicLibrary;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
	private String Playlistname;
	private List<Song> songs;
	
	public MusicLibrary(String playlistname) {
		
		this.Playlistname = playlistname;
		songs=new ArrayList<Song>();
	}
	
	public void addSong(Song song) {
		songs.add(song);
		System.out.println("Song added successfully");
	}

	public String getPlaylistname() {
		return Playlistname;
	}

	public void setPlaylistname(String playlistname) {
		Playlistname = playlistname;
	}
	
	public List<Song> getSongs(){
		return songs;
	}
	
	public void setSongs(List<Song> songs) {
		this.songs=songs;
	}

	public void playSong(Song song) {
		for(Song s: songs) {
			if(s.getTitle().equalsIgnoreCase(song.getTitle())) {
				System.out.println(s.getTitle()+" is playing now...		( "+s.getDuration()+" )");
				try {
					Thread.sleep(5000);
					return;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("Song not found...");
		
	}

	public void removeSong(String removeSong) {

		boolean removed=songs.removeIf(s->s.getTitle().equalsIgnoreCase(removeSong));
		if(removed) {
			System.out.println(removeSong+" removed successfully");
		}else {
			System.out.println("Not found in Playlist.");
		}
		
	}
	
	
	
	
	

}
