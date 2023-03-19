import java.util.Random;

public class PasswordGenerating {

    public static char[] password(int length){

        System.out.print("Your New Password : ");

        String Caps_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String Numbers = "0123456789";
        String Regex = "!@#$%^&*?<>";

        String values = Caps_chars + Small_chars + Numbers + Regex;

        Random  rand = new Random();

        char[] passwords = new char[length];

        for(int i = 0; i < passwords.length; i++){
            passwords[i] = values.charAt(rand.nextInt(values.length()));
        }


        return passwords;

    }
}
