import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Passphrase5 {
    public static void main(String[] args) {
        System.out.println(Password5() == 1 ? "You win!!! No! This cannot be. This isn't the end! Until next time, gwa ha ha!" : "Wrong!\nGame Over\nContinue >");
    }


    public static int Password5(){
        Scanner s = new Scanner(System.in);
        System.out.println("What is passphrase 5?");
        String input1 = s.nextLine();
        String data="";
        //then write to file "mama mia"
        try {
        FileWriter myFile = new FileWriter("text.txt");
        myFile.write("mama mia");
        myFile.close();
        //  ask for input2 
        String input2=s.nextLine();
        // user can modify file and MUST add word "toadstinks"
        File myObj = new File("text.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          // reads from file into string variable STR 
          data = data + myReader.nextLine().toString();
          // System.out.println(data);
        }
        //hit enter
        return data.contains("toadstinks") ?  1:  0; 
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        return 0;
      }
    }
}