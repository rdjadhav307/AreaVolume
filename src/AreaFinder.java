import java.util.Scanner;

public class AreaFinder extends AreaOfShapes{
    public static void main(String[] args) {
        byte choice;
        float a,b,h;
        double base, height;
        Scanner sc = new Scanner(System.in);
        AreaFinder an = new AreaFinder();

        System.out.println("\n\n<<<<<< Enter Values in Meter >>>>>>>\n");
        System.out.println("Area of Which shape do you want to find ?\n");
        System.out.println("1. Circle\n2. Triangle\n3. Square\n4. Rectangle\n5. Parallelogram\n6. Trapezium\n7. Ellipse\n8. Exit");
        do {
            System.out.print("Enter Choice : ");
            choice = sc.nextByte();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter value of Radius of Circle : ");
                    base = sc.nextDouble();
                    an.area(base);
                    break;

                case 2:
                    System.out.print("Enter Value of Base of Traingle :");
                    base = sc.nextDouble();
                    System.out.print("Enter Value of Height of Traingle :");
                    height = sc.nextDouble();
                    an.area(base, height);
                    break;

                case 3:
                    System.out.print("Enter Length of a side of Square : ");
                    a = sc.nextFloat();
                    an.area(a);
                    break;

                case 4:
                    System.out.print("Enter Length of Rectangle : ");
                    a = sc.nextFloat();
                    System.out.print("Enter Width of Rectangle : ");
                    b = sc.nextFloat();
                    System.out.println("Area of Rectangle is " + an.area(a, b) + " m^2");
                    break;

                case 5:
                    System.out.print("Enter Base Length of Parallelogram : ");
                    a = sc.nextFloat();
                    System.out.print("Enter Height of Parallelogram : ");
                    b = sc.nextFloat();
                    System.out.println("Area of Parallelogram is " + an.area(a, b) + " m^2");
                    break;

                case 6:
                    System.out.print("Enter First Parallel side length of Trapezium : ");
                    a = sc.nextFloat();
                    System.out.print("Enter Second Parallel side length of Trapezium : ");
                    b = sc.nextFloat();
                    System.out.print("Enter Height of Trapezium : ");
                    h = sc.nextFloat();
                    an.area(a, b, h);
                    break;

                case 7:
                    System.out.print("Enter Minor axis length of Ellipse : ");
                    a = sc.nextFloat();
                    System.out.print("Enter Major axis length of Ellipse : ");
                    b = sc.nextFloat();
                    an.area(a / 2, b / 2, 'e');
                    break;

                case 8:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Please Enter Correct Choice ");
            }
            System.out.println();
        }while(choice!=8);
    }
}