package OTP_generator;

import java.io.*;
import java.net.*;

public class SendOTP {
    public static void main(String[] args) throws IOException {
        String apiKey = "SKcdb3b5e5f275a73c693db1db91139a8e";
        String message = "Your OTP is " + OTP.generateOTP();
        String senderId = "FSTSMS";
        String number = "9657160283"; // recipient mobile number

        String url = "https://www.fast2sms.com/dev/bulkV2?authorization=" + apiKey
                + "&sender_id=" + senderId
                + "&message=" + URLEncoder.encode(message, "UTF-8")
                + "&route=v3&numbers=" + number;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("cache-control", "no-cache");

        int responseCode = con.getResponseCode();
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());
    }
}

