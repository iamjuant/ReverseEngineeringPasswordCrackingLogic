import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

import javax.sql.rowset.spi.TransactionalWriter;

public class Passwords{
    


  public static int Password1(String userInput){
    return (userInput.equals("It's time for a Bowser Revolution!") ? 1 : 0 );
  }
  

  public static int Password2(String str){  
    StringBuffer 
    num1 = new StringBuffer(), 
    special = new StringBuffer(),
    num2 = new StringBuffer(),
    alpha1 = new StringBuffer(),   
    alpha2 = new StringBuffer();   
    boolean aflag=false;  
    boolean bflag=false;    
      for (int i=0; i<str.length(); i++)  {
        if (Character.isDigit(str.charAt(i))&&aflag==false){  
        num1.append(str.charAt(i));  
        }
        
        else if (Character.isDigit(str.charAt(i))&&aflag==true){  
        num2.append(str.charAt(i));  
        }

        else if(Character.isAlphabetic(str.charAt(i))&&bflag==false){  
        alpha1.append(str.charAt(i));
        aflag=true;
        bflag=true;
      }  
        else if(Character.isAlphabetic(str.charAt(i))&&bflag==true){  
        alpha2.append(str.charAt(i));
        aflag=true;
        // bflag=true;
      }  
        else {
        special.append(str.charAt(i));
        aflag=true;
        }  
    }  
    
    if(alpha1.charAt(0)=='b'){
      if(alpha2.charAt(0)=='d'){
        if(Integer.parseInt(num1.toString())==12){
          if(Integer.parseInt(num2.toString())==2){
            return 1;
          }
          else{
            return 0;
          }
        }
        else if(Integer.parseInt(num1.toString())==234){
          if(Integer.parseInt(num2.toString())==2){
            return 1;
          }
          else{
            return 0;
          }
        }
      }else if(alpha2.charAt(0)=='r'){
        if(Integer.parseInt(num1.toString())==11){

          if(num2.toString().equals("01")){
            return 1;
          }
          else{
            return 0;
          }
        }else if(Integer.parseInt(num1.toString())==21){
          if(Integer.parseInt(num2.toString())==21){
            return 1;
          }
          else{
            return 0;
          }
        }
      }else{
        return 0;
      }
    }else if(alpha1.charAt(0)=='d'){
      if(Integer.parseInt(num1.toString())==2){
        return 0;
      }else if(Integer.parseInt(num1.toString())==5){
         if(alpha2.charAt(0)=='n'){
          if(Integer.parseInt(num2.toString())==15){
            return 1;
          }else{
            return 0;
          }
         }else{
          return 0;
         }
      }else{
        return 0;
      }
    }else{
      return 0;  
      
    }
    return 0;
  }
  
  public static void Password3(){
    
  }
  
  
  
  public static int Password5(){
    Scanner s = new Scanner(System.in);
    String input1 = s.nextLine();
    String data="";
    //then write to file "mama mia"
    try {
    FileWriter myFile = new FileWriter("passwords.txt");
    myFile.write("mama mia");
    myFile.close();
    //  ask for input2 
    String input2=s.nextLine();
    // user can modify file and MUST add word "toadstinks"
    File myObj = new File("passwords.txt");
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


  // 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Dear Mario,");
    System.out.println("Please come to the castle, I've baked a...");
    System.out.println("Just kidding haha!!,");
    System.out.println("This is Bowser and you'll never see the...");
    System.out.println("What is passphrase 1?");
    String userInput = s.nextLine();
    System.out.println(Password1(userInput) == 1 ? "Haha! That was an easy one. Let's see \nWhat is passphrase 2?" : "Wrong!\nGame Over\nContinue >");
    
    // userInput=s.nextLine();
    // System.out.println(Password2(userInput) == 1 ? "Haha! That was an easy one. Let's see \nWhat is passphrase 2?" : "Wrong!\nGame Over\nContinue >");
    String userInput2 = s.nextLine();
    System.out.println(Password2(userInput2) == 1 ? "true" : "false");
    
    System.out.println(Password5() == 1 ? "true" : "false");


    s.close();
  }
}
