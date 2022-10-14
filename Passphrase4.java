import java.io.*;

class Passphrase4{
    public static void main(String[] args) {
        System.out.println("Checking Passphrase 4...");
        checkPassword4();
        System.out.println("\n\nYou got it, but there's still more! Bow before Bowser, or feel my wrath!");
    }
    
    public static void checkPassword4(){
        try{
            byte[] bytes = new byte[1024];

            RandomAccessFile raFile = new RandomAccessFile("bowsers_junk.bin", "r");
            
            raFile.seek(0x46);                      // Moves file descriptor() like fseek(), but with only 1 param
                                                        // Unlike assembly, file is an object to which seek method belongs, not a parameter
            raFile.read(bytes,0x00,1);         // Handles the file reading
                                                        // Also has offset and len parameters like fseek(),
                                                        // but in Java this is handled by I/O func
            char firstLetter = (char)bytes[0];          // Store character into temporary variable like assembly

            raFile.seek(0x8C);
            raFile.read(bytes,0x00,1);
            char secondLetter = (char)bytes[0];

            raFile.seek(0xAA);
            raFile.read(bytes,0x00,1);
            char thirdLetter = (char)bytes[0];

            raFile.seek(0xA8);
            raFile.read(bytes,0x00,1);
            char fourthLetter = (char)bytes[0];

            raFile.seek(0x3E7);
            raFile.read(bytes,0x00,1);
            char fifthLetter = (char)bytes[0];

           if(firstLetter != 0x70 || secondLetter != 0x65 || thirdLetter != 0x61 || // Not comparisons as in assembly, all jump to same instructions if false
              fourthLetter != 0x63 || fifthLetter != 0x68){
                System.out.println("\n\nWrong!\n\nGame over\n\nContinue >");
                System.exit(-1);
            }
        } catch(Exception e){
            System.out.println("\n\nWrong!\n\nGame over\n\nContinue >");
            System.exit(-1);
        }
    }
}