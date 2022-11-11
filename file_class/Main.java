package file_class;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("secret.txt");

        if(file.exists()){
            System.out.println("LOL");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }else{
            System.out.println("That file not exist");
        }
    }
}
