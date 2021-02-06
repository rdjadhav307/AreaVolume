import java.util.Scanner;

public class SurfaceAreaFinder extends SurfaceAreaOfSolids{
    public static void main(String[] args) {
        byte choice;
        float l,  h;
        Scanner sc = new Scanner(System.in);
        SurfaceAreaFinder sf = new SurfaceAreaFinder();

        System.out.println("\n\n<<<<<< Enter Values in Meter >>>>>>>\n");
        System.out.println("Surface Area of Which Solids do you want to find ?\n");
        System.out.println("1. Cube\n2. Cylinder\n3. Sphere\n4. Cone\n5. Exit");

        do {
            System.out.print("Enter Choice : ");
            choice = sc.nextByte();
            System.out.println();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Length of a side of Cube : ");
                    l = sc.nextFloat();
                    sf.surfaceArea(l,'c');
                    break;

                case 2:
                    System.out.print("Enter Radius of Base Circle of Cylinder : ");
                    l = sc.nextFloat();
                    System.out.print("Enter Height of Cylinder : ");
                    h = sc.nextFloat();
                    sf.surfaceArea(l,h,'c');
                    break;

                case 3:
                    System.out.print("Enter Radius of Sphere : ");
                    l= sc.nextFloat();
                    sf.surfaceArea(l,'s');
                    break;


                case 4:
                    System.out.print("Enter Radius of Base Circle of Cone : ");
                    l = sc.nextFloat();
                    System.out.print("Enter Length Inclined Side of Cone : ");
                    h = sc.nextFloat();
                    sf.surfaceArea(l,h,'t');
                    break;

                case 5:
                    System.out.print("Exiting.....");
                    break;

                default:
                    System.out.print("Enter Correct Choice ");
            }
            System.out.println("\n");
        }while (choice!=5);
     }
}