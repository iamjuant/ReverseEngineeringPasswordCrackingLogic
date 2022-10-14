import java.util.Scanner;

public class Passphrase1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dear Mario,");
        System.out.println("Please come to the castle, I've baked a...");
        System.out.println("Just kidding haha!!,");
        System.out.println("This is Bowser and you'll never see the...");
        System.out.println("What is passphrase 1?");
        String userInput = s.nextLine();
        System.out.println(Password1(userInput) == 1 ? "Haha! That was an easy one. Let's see" : "Wrong!\nGame Over\nContinue >");
    
    }    
    public static int Password1(String userInput){
        return (userInput.equals("It's time for a Bowser Revolution!") ? 1 : 0 );
      }
}
