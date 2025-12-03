package OTP;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import java.util.Random;

public class SendOTP {
    // Step 1: Twilio credentials
    public static final String ACCOUNT_SID = "YOUR_TWILIO_ACCOUNT_SID";
    public static final String AUTH_TOKEN = "YOUR_TWILIO_AUTH_TOKEN";
    public static final String FROM_NUMBER = "+1234567890"; // Twilio number

    // Step 2: Generate random 6-digit OTP
    public static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

    public static void main(String[] args) {
        // Initialize Twilio
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        // Generate OTP
        String otp = generateOTP();
        System.out.println("Generated OTP: " + otp);

        // Recipient mobile number (with country code)
        String toNumber = "+91XXXXXXXXXX"; // Replace with actual number

        // Step 3: Send OTP SMS
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(toNumber),
                new com.twilio.type.PhoneNumber(FROM_NUMBER),
                "Your OTP is: " + otp + " (valid for 5 minutes)")
            .create();

        // Step 4: Print message info
        System.out.println("✅ OTP sent successfully!");
        System.out.println("Message SID: " + message.getSid());
    }
}

