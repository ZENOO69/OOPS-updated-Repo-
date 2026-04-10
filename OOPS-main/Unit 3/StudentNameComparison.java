import java.util.Scanner;

public class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        
        if (name1.equals(name2)) {
            System.out.println("Names are exactly the same.");
        } else {
            System.out.println("Names are different (case-sensitive).");
        }

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are the same (case-insensitive).");
        } else {
            System.out.println("Names are completely different.");
        }
    }
}
