import java.util.Scanner;

public class inputfromuser {
    public static void main(String[] args){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1");
        int a = sc.nextInt();
        System.out.println("Enter no 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these nos");
        System.out.println(sum);


    }
}
