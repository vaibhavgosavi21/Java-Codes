package OTP_generator;
import java.util.Random;

public class OTP {
	public static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000); // 6-digit OTP
        return String.valueOf(otp);
    }
	public static void main(String[] args) {
        System.out.println("Your OTP is: " + generateOTP());

	}

}


