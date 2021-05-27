package activities;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src/activity14.txt");
            boolean fStatus = file.createactivity14();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            //get the file Object
            File fileUtil = FileUtils.getFile("src/activity14.txt");
            //Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            //Create directory
            File destDir = new File("resources");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            //Get file from new directory
            File activity14 = FileUtils.getFile(destDir, "activity14.txt");
            //Read data from file
            String activity14Data = FileUtils.readFileToString(activity14, "UTF8");
            //Print it
            System.out.println("Data in new file: " + activity14Data);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}