import java.util.Collections;
public class ReverseSB {
        public static void main(String[] args) {
            String s = "Devesh";
            StringBuilder sb = new StringBuilder(s);
            // Collections.sort(sb); // does not work
            // sb.reverse();
            //delete and insert are very costly process
            sb.deleteCharAt(1);
            sb.insert(1,'e');
            sb.delete(3,6); // 3 to 5 ek extra add krna hota hai second index mai
            System.out.println(sb);
//        String s = "Aditya";
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        s = sb.toString();
//        System.out.println(s);
        }
    }

