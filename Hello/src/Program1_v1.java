import java.util.Scanner;

public class Program1_v1 {
    public int doubleit(int num){
        return num * 2;
    }
    public static void main(String[] args) {
        Program1_v1 hw = new Program1_v1();
        int res = hw.doubleit(5);
        System.out.println(res);
        Student s1 = new Student();
        s1.setlName("Smith");
        s1.setfName("Joe");
        s1.setGpa(4.0f);
        System.out.println(s1.getfName() + " " + s1.getlName());


        //Scanner sc= new Scanner(System.in);
        //System.out.println("Number: ");
        //int num = sc.nextInt();
        //System.out.println("StTax: ");
        //float taxRate = sc.nextFloat();
        //System.out.printf("%d %f", num, taxRate);

    }
}
