import java.util.Scanner;

public class percentage_calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("subject1");
        int math = s.nextInt();
        System.out.println("subject2");
        int english = s.nextInt();
        System.out.println("subject3");
        int science = s.nextInt();
        System.out.println("subject4");
        int history = s.nextInt();
        System.out.println("subject5");
        int hindi = s.nextInt();
        System.out.println("total marks obtained");
        int sum = (math + english + science + history + hindi);
        System.out.println(sum);
        System.out.println("total percentage ");
        int totalperc = (sum * 100 / 500);
        System.out.println(totalperc);


    }
}
