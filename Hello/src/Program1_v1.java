import java.util.Scanner;

public class Program1_v1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Number: ");
        int age = sc.nextInt();
        System.out.println("StTax: ");
        float taxRate = sc.nextFloat();
        System.out.printf("%d %f", age, taxRate);

    }
}
