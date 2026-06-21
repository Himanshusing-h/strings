public class passing_to_function {
    public static void main(String[] args) {
        String str="himanshu";
        System.out.println(str);
        change(str);
        System.out.println(str);
    }
    public static String change(String str)
    {
        str="him";

        return str;
    }
}
//string is pass by value and change in function will not change in main method ,it is pass by value and function ka alag dabba bnta hai
