package file_practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// x = create program which


public class FilePractice {
    public static void main(String[] args) throws InterruptedException {

        String resourceDirPath = "C:\\Users\\Asus\\IdeaProjects\\untitled\\src\\file\\resources";
        int filesCount = 100;

        ArrayList<String> filenames = new ArrayList<>();

        for (int i = 0; i < filesCount; i++) {
            String fileNameFormat = "File%d.txt";
            String filename = String.format(fileNameFormat, i);
            filenames.add(filename);
        }

        ArrayList<String> filepaths = new ArrayList<>();
        for (String filename : filenames) {
            String filepathFormat = "%s\\%s";
            String filepath = String.format(filepathFormat, resourceDirPath, filename);
            filepaths.add(filepath);
        }


        for (String filepath : filepaths) {
            createFile(filepath);
        }

        for (String filepath : filepaths) {
            long time = System.nanoTime();
            String formatMassage = "Open the file: First, create a File object that represents the file you want to search in.\nYou can do this by providing the file name and path to the File constructor.\nThen, create a Scanner object and pass the File object as a parameter to the Scanner constructor.";

            String massage = String.format(formatMassage, time);
            fillFile(filepath, massage);
        }

        for (String filepath : filepaths) {
            readFile(filepath);
        }

        for (String filepath : filepaths) {
            countLines(filepath);
        }

        for (String filepath : filepaths) {
            countWords(filepath);
        }

        for (String filepath : filepaths) {
            searchWord(filepath, " can ");
        }


        for (String filepath : filepaths) {
            deleteFile(filepath);
        }

    }


    public static void createFile(String filepath) {
        try {
            File fl = new File(filepath);
            if (fl.createNewFile()) {
                System.out.println("File created: " + fl.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            String message = e.getMessage();
            String errorFormat = "An error occurred on file creation. Filepath: %s. %s";
            String error = String.format(errorFormat, filepath, message);
            System.out.println(error);
        }
    }


    public static void fillFile(String filepath, String massage) {
        try (
                FileWriter myWriter = new FileWriter(filepath);
                BufferedWriter bw = new BufferedWriter(myWriter)
        ) {

            bw.write(massage);
            bw.newLine();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFile(String filepath) {
        File fl = new File(filepath);

        try (Scanner myReader = new Scanner(fl)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(String filepath) {
        File fl = new File(filepath);
        if (fl.delete()) {
            System.out.println("Deleted the file: " + fl.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void getInfoAboutFile(String filepath) {
        File fl = new File(filepath);
        if (fl.exists()) {
            System.out.println("File name: " + fl.getName());
            System.out.println("Absolute path: " + fl.getAbsolutePath());
            System.out.println("Writeable: " + fl.canWrite());
            System.out.println("Readable " + fl.canRead());
            System.out.println("File size in bytes " + fl.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    public static int countLines(String filepath) {
        File fl = new File(filepath);
        int lines = 0;
        try (
                Scanner sc = new Scanner(fl)
        ) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public static void countWords(String filepath) {
        File file = new File(filepath);
        try (
                Scanner sc = new Scanner(file)
        ) {
            int count = 0;
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            System.out.println("Number of words: " + count);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void searchWord(String filepath, String searchWord) {
        int lineCounter = 0;
        File fl = new File(filepath);
        try (Scanner sc = new Scanner(fl)) {
            while (sc.hasNextLine()) {
                lineCounter++;
                String line = sc.nextLine();
                if (line.contains(searchWord)) {
                    System.out.println("Word is in the line number: " + lineCounter + "; " + line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    /*
    Feature: Split
        Scenario: Split one big file into small
            Given: big file
                And content is ("The sun was setting over the mountains, casting a warm golden glow across the valley below. Birds chirped and sang as they flew back to their nests, and a gentle breeze rustled the leaves of the trees. In the distance, a faint sound of laughter and music could be heard as people gathered for a celebration. It was a peaceful and serene evening, filled with the promise of a new day to come.")
                And size of it is '999' symbols
            When Timmy writes a file which size is '1800' symbols
            Then the file splits to two smaller file
                And the size of the first file is '999' symbols
                And the size of the second is '801' symbols
    */
}


