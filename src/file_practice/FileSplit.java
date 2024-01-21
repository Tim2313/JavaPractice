package file_practice;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FileSplit {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\tkisu\\IdeaProjects\\Main\\src\\file\\AliceInWonderland.txt";
        String splitOutputDir = "C:\\Users\\tkisu\\IdeaProjects\\Main\\src\\file\\filesplit";
        File fl = new File(filepath);
        String splitFilename = fl.getName();
        int splitThreshold = 700;

        int numberOfLines = FilePractice.countLines(filepath);
        System.out.println(numberOfLines);
        Queue<String> qe = new LinkedList<>();
        int counter = 0;
        try (Scanner sc = new Scanner(fl)) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                qe.add(line);
                int size = qe.size();
                if (size == splitThreshold) {
                    String outputFilepathFormat = "%s\\%d_split_%s";
                    String outputFilepath = String.format(outputFilepathFormat, splitOutputDir, counter, splitFilename);
                    writeQueueInFile(outputFilepath, qe);
                    counter++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeQueueInFile(String filepath, Queue<String> qe) {
        File f = new File(filepath);
        try {
            f.delete();
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fw = new FileWriter(f)) {
            while (!qe.isEmpty()) {
                String lineToWrite = qe.poll();
                if (lineToWrite != null) {
                    fw.write(lineToWrite);
                    fw.write('\n');
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


