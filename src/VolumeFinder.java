import java.util.Scanner;

public class VolumeFinder extends VolumeOfObjects{
    public static void main(String[] args) {
        byte choice;
        float l, w, h;
        Scanner sc = new Scanner(System.in);
        VolumeFinder vm = new VolumeFinder();

        System.out.println("\n\n<<<<<< Enter Values in Meter >>>>>>>\n");
        System.out.println("Volume of Which Solids do you want to find ?\n");
        System.out.println("1. Cube\n2. Rectangular Prism\n3. Pyramid\n4. Cylinder\n5. Cone\n6. Sphere\n7. Exit");

        do {
            System.out.print("Enter Choice : ");
            choice = sc.nextByte();
            System.out.println();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Length of a side of Cube : ");
                    l = sc.nextFloat();
                    vm.volume(l,'c');
                    break;

                case 2:
                    System.out.print("Enter Length of Rectangular Prism : ");
                    l = sc.nextFloat();
                    System.out.print("Enter Width of Rectangular Prism : ");
                    w = sc.nextFloat();
                    System.out.print("Enter Height of Rectangular Prism : ");
                    h = sc.nextFloat();
                    vm.volume(l,w,h,'r');
                    break;

                case 3:
                    System.out.print("Enter Length of Base of Pyramid : ");
                    l = sc.nextFloat();
                    System.out.print("Enter Width of Base of Pyramid : ");
                    w = sc.nextFloat();
                    System.out.print("Enter Height of Pyramid : ");
                    h = sc.nextFloat();
                    vm.volume(l,w,h,'p');
                    break;

                case 4:
                    System.out.print("Enter Radius of Base Circle of Cylinder : ");
                    l = sc.nextFloat();
                    System.out.print("Enter Height of Cylinder : ");
                    h = sc.nextFloat();
                    vm.volume(l, h, 't');
                    break;

                case 5:
                    System.out.print("Enter Radius of Base Circle of Cone : ");
                    l = sc.nextFloat();
                    System.out.print("Enter Height of Cone : ");
                    h = sc.nextFloat();
                    vm.volume(l, h, 'c');
                    break;

                case 6:
                    System.out.print("Enter Radius of Sphere : ");
                    l = sc.nextFloat();
                    vm.volume(l,'s');
                    break;

                case 7:
                    System.out.println("Exiting.....");
                    break;

                default:
                    System.out.println("Enter Correct Choice ");
            }
            System.out.println();
        }while (choice!=7);
    }
}
