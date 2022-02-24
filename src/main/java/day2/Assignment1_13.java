package day2;
import java.util.Scanner;
public class Assignment1_13 {
    public static int doSomething(int a) {
        int sum = 0;

        for (int i = 1; i <= a; ++i) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input");
        String x = myObj.nextLine();
        if(Integer.parseInt(x) <= 0){
            System.out.println("Error, please input again.");
        }else if(Integer.parseInt(x) > 0){
            System.out.println("Sum of 1 to " + x +" is " + doSomething(Integer.parseInt(x)));
        }
    }
}
