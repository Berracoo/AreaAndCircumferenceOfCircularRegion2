import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number for radius : ");
        int r = input.nextInt();
        System.out.println();
        System.out.print("Please enter a central angle : ");
        double centAngle = input.nextDouble();
        System.out.println();
        input.close();
        double pi = 3.14;
        double circumference = (2 * pi * r) * centAngle / 360;
        double area = (circumference * r) / 2;
        // another way of finding are is that (Math.pow(r,2)*pi) * centAngle / 360
        // or (r * r * pi) * centAngle / 360
        System.out.println("Area of the circular region is : " + area +
                " " + "Circumference of the circular region is : " + circumference);

    }
}