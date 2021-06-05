import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a new password.");
        String thePassword = scanner.nextLine();
        String rating;
        int charCount = 0;
        int letterCount = 0;
        int numCount = 0;
        int specialCount = 0;
        for(int i = 0; i < thePassword.length(); i++)
        {
            char theOne = thePassword.charAt(i);
            if(Character.isAlphabetic(theOne))
            {
                letterCount++;
            }
            else if(Character.isDigit(theOne))
            {
                numCount++;
            }
            else
            {
                specialCount++;
            }
            charCount++;
        }
        if(charCount >= 8)
        {
            if (numCount == 0)
            {
                rating = ("weak");
            }
            else if(specialCount == 0)
            {
                rating = ("strong");
            }
            else
            {
                rating = ("very strong");
            }
        }
        else
        {
            if(letterCount == 0)
            {
               rating = ("very weak");
            }
            else
            {
                rating = ("weak");
            }
        }
        System.out.println("The password '" + thePassword + "' is a " + rating + " password.");
    }
}
