import java.util.Scanner;
import java.util.Vector;

public class VECTOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector vec = new Vector();
        vec.add("hello");
        vec.add(" junior");
        vec.add(" middle");
        for (int i = 0; i < vec.size(); i++)
            System.out.print(vec.get(i));
        System.out.println();
        int i = 0;
        System.out.print(vec.get(i));
        int i1=2;
        System.out.print(vec.get(i1));


    }
}