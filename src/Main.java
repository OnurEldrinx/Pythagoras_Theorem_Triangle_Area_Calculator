import java.util.Scanner;

public class Main {
    public static void main(String[] arguments){

        String menu = "1.Find the hypotenuse of a right triangle\n2.Find the area of a triangle";
        int choice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println(menu);
        System.out.println("-----------------------------------------");

        System.out.println("--> Please make your choice by entering the number code!");
        System.out.print("Your Choice: ");
        choice = keyboard.nextInt();

        if (choice == 1){

            double leg1,leg2,hypotenuse;

            System.out.print("Enter the length of first leg:");
            leg1 = keyboard.nextDouble();
            System.out.print("Enter the length of second leg:");
            leg2 = keyboard.nextDouble();

            hypotenuse = Math.hypot(leg1,leg2);

            System.out.println("Leg 1      : " + leg1);
            System.out.println("Leg 2      : " + leg2);
            System.out.println("Hypotenuse : " + hypotenuse);


        }else if(choice == 2){

            double a,b,c,perimeter,area,u;

            System.out.print("Side 1:");
            a = keyboard.nextDouble();
            System.out.print("Side 2:");
            b = keyboard.nextDouble();
            System.out.print("Side 3:");
            c = keyboard.nextDouble();

            perimeter = a+b+c;
            u = perimeter/2;

            area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

            System.out.println("------------------");
            System.out.println("Side 1       : " + a);
            System.out.println("Side 2       : " + b);
            System.out.println("Side 3       : " + c);
            System.out.println("Perimeter    : " + perimeter);
            System.out.println("Area         : " + area );
            System.out.println("------------------");

        }else{


            System.out.println("Wrong Input.\nPlease check the menu again.");


        }
    }
}
