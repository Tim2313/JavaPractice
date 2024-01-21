package file_practice;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {

        String fileLink = "C:\\Users\\tkisu\\IdeaProjects\\Main\\src\\file\\ultraPng.png";
        File fr = new File(fileLink);
        long sizeOfFile = fr.length();
        System.out.println(sizeOfFile);
        try {
            FileInputStream fis = new FileInputStream(fr);
            int inputByte;
            int counter = 0;
            do {
                inputByte = fis.read();
                System.out.print(inputByte + ", ");
                counter++;
            } while (counter != 109);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
