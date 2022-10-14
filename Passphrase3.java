import java.util.Scanner;

public class Passphrase3 {
  public static int Passphrase3(int[] array){
    if (array[0] != 120) {
      return 0;
    }
    int eax;
    int ecx;
    long edx=0;
    String x;
    for (int i = 1; i < 6; i++) {
      ecx = array[i];
      eax = i;
      eax = eax + 1073741823; // 3FFFF FFFFh
      edx = eax * 4;
      edx = (edx / 4);
      eax = array[(int)edx];
      edx = 3435973837L; // CCCC CCCDh
      edx = (edx * eax);
      x=Long.toHexString(edx);
      edx=Integer.parseInt(x.substring(0,x.length()-8),16);
      edx=edx/4;
      eax=i;
      eax=eax-1;
      eax=eax*(int)edx;
      eax=eax*8;
      eax=eax+35;
      if(ecx!=eax){return 0;}
      
    }
    return 1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is passphrase 3?");
    int[] myArray = new int[6];
    for (int i = 0; i < 6; i++) {
        myArray[i] = sc.nextInt();
    }
    System.out.println(Passphrase3(myArray) == 1 ? "Impressive, but it's time for a real challenge" : "Wrong!\nGame Over\nContinue >");    
  
  }
}

