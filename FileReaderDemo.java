import java.io.*;
class FileReaderDemo {
    public static void main(String args[]) {
        System.out.println("-----------------------------------");
        try ( FileReader fr = new FileReader("FileReaderDemo.java") ) {
            int c;
            // Read and display the file.
            while((c = fr.read()) != -1) System.out.print((char) c);
        }catch(IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}