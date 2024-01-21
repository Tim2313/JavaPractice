package file_practice;

import java.awt.image.BufferedImage;
import java.io.*;

public class CreatePNG {
    public static void main(String[] args) throws IOException {
        String pngFilepath = "C:\\Users\\tkisu\\IdeaProjects\\Main\\src\\file\\ultraPng1.png";
        File fl = new File(pngFilepath);
        boolean isExist = fl.exists();
        if (isExist) {
            fl.delete();
        } else {
            fl.createNewFile();
        }
        int[] pngSignature = {137, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 100, 0, 0, 0, 100, 8, 2, 0, 0, 0, 255, 128, 2, 3, 0, 0, 0, 52, 73, 68, 65, 84, 120, 94, 237, 193, 1, 13, 0, 0, 0, 194, 160, 247, 79, 109, 14, 55, 160, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 126, 12, 117, 148, 0, 1, 31, 44, 27, 106, 0, 0, 0, 0, 73, 69, 78, 68, 174, 66, 96, 130};

        FileOutputStream fops = new FileOutputStream(pngFilepath);
        for (int i = 0; i < pngSignature.length; i++) {
            fops.write(pngSignature[i]);
        }
        BufferedImage bf = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
//        ImageIO.write(bf, "PNG", fl);;
        FileWriter fw = new FileWriter(fl);
        BufferedWriter bw = new BufferedWriter(fw);
        ObjectOutputStream ob = new ObjectOutputStream(fops);


    }
}
