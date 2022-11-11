package file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter write = new FileWriter("poem.txt");
            write.write("Roses are bad \n Violets are nice \n I like you as a \n friend \n \n bye");
            write.append("\n (A poem by maya!)");
            write.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
