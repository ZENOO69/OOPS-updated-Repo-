import java.util.Scanner;

public class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println(extension);
    }
}
