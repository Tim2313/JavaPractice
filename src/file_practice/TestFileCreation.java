package file_practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCreation {

    public static void main(String[] args) {

        File file = new File("output.txt");
        try {
            FileWriter fw = new FileWriter(file);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
