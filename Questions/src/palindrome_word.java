import java.util.Scanner;

public class palindrome_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word");
        String str=sc.nextLine();
        boolean palin=true;
        int lo=0;
        int high=str.length()-1;
        //reversing a string and if at any instance lo!=high return false otherwise we have already initialize it with true;
        while (lo<high){
            if(str.charAt(lo)==str.charAt(high)){
                lo++;
                high--;


            }
            else
            {
                palin=false;
                break;
            }

        }
        System.out.println(palin);
    }
}
