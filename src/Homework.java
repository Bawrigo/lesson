import java.util.Locale;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        String s = "task";
        String c = "number";
        String s1 = new String("TASK");
        System.out.println(s);
        System.out.println(s.trim());          // eki shetindegi praveldi alip beredi
        System.out.println(s.concat("number = 1")); //stringdi qosiw
        System.out.println(s.equalsIgnoreCase(s1)); //manislerin tekseredi DD==dd
        System.out.println(s.equals(s1));           // tekseredi DD != dd
        System.out.println(s == s1);               // adresin tekserediSystem.out.println(s);
        System.out.println(s.length());          // string uzinligin
        System.out.println(s.toLowerCase());     //  hammesin kishi harip penen
        System.out.println(s.toUpperCase());     // hammesin ulken harip penen
        System.out.println(s.indexOf("s"));      // uqsas belginin neshinshi bolip turganin aniqlaydi
        System.out.println("/////////////////////////////////////////////////////////////////////");
        System.out.println(s.toUpperCase(Locale.ROOT)); // ulken harip qiladi
        System.out.println(s.hashCode());      // ????
        System.out.println(s.contains(c)); // salistirip tekseredi
        System.out.println(c.isEmpty());  // stringnin ishi bos ekenin tekseredi
        System.out.println(" // "+c.endsWith(s)); //salistiradi
        System.out.println("//////////////////////////////////////////////////////////////////////");


    }
}