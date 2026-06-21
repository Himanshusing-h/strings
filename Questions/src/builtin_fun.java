import java.util.*;
public class builtin_fun {
    public static void main(String[] args) {
        String str="raghav garg";
        //will print first occurance
        System.out.println(str.indexOf('r'));
        //will print -1 which means dont exits
        System.out.println(str.indexOf('y'));
        //will convert whole string to lower case
        System.out.println(str.toLowerCase());
        //will convert whole string to upper case
        System.out.println(str.toUpperCase());
        //return true or false,wheather string starts with r or not
        System.out.println(str.startsWith("r"));
        //return true or false,wheather string contain garg or not
        System.out.println(str.contains("garg"));
//immutable
        str.toUpperCase();
        //will not print string in upper case
        System.out.println(str);
        // to do that do
        str=str.toUpperCase();





    }
}
