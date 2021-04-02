import java.util.Scanner;

public class testFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input Path:");
        String path = input.nextLine();

        fileInfo fileName = new fileInfo(path);

        System.out.println("Path: " + fileName.getPath());
        System.out.println("File Name: " + fileName.getFileName());
        System.out.println("Extension: " + fileName.getExtension());
        System.out.println("Disk: " + fileName.getDisk());

        var folders = fileName.getFolders();
        System.out.println("List folders:");
        for (var folder : folders) {
            System.out.println(folder);
        }
        
    }
}