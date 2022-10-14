import java.util.Scanner;

public class Passphrase2 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is passphrase 2? \n");
        String userInput2 = s.nextLine();
        System.out.println(Password2(userInput2) == 1 ? "You won't ever get to the princess in time!" : "Wrong!\nGame Over\nContinue >");    
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


}
