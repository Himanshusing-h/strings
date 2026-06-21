import java.util.Scanner;

public class PrintAllSubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                System.out.print(str.substring(i, j));
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}

