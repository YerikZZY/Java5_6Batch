package day2;
import java.util.Arrays;
public class Assignment1_14 {
    public static void main(String[] args)
        {
            int[] a = { 1, 2, 3, 4};
            int[] b = { 5, 6, 7, 8};
            int a1 = a.length;
            int b1 = b.length;
            int c1 = a1 + b1;
            int[] c = new int[c1];
            System.arraycopy(a, 0, c, 0, a1);
            System.arraycopy(b, 0, c, a1, b1);
            System.out.println(Arrays.toString(c));
        }
}

