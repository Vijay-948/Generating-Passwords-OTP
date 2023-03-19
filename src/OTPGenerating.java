import java.util.Random;

public class OTPGenerating {
    public static char[] otp_generating(int length){

        System.out.print("Your OneTimePassword(OTP) is : ");

        String numbers = "0123456789";

        Random rand = new Random();

        char[] One_Time_Password = new char[length];

        for(int i = 0; i < length; i++){
            One_Time_Password[i] = numbers.charAt(rand.nextInt(numbers.length()));
        }

        return One_Time_Password;




    }
}
