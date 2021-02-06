public class SurfaceAreaOfSolids {
    void surfaceArea(float side, char ch)
    {
        if(ch=='c') {
            System.out.print("Surface Area of Cube is " + (6 * side * side) + " m^2");
        }
        else
        {
            System.out.print("Surface Area of Sphere is " + (12.56*side*side) + " m^2");
        }
    }
    void surfaceArea(float r, float h, char ch)
    {
        double res;
        if(ch == 'c') {
            res = (6.28 * r * r) + (6.28 * r * h);
            System.out.print("Surface Area of Cylinder is " + res + " m^2");
        }
        else
        {
            res = (3.14*r*h)+(3.14*r*r);
            System.out.print("Surface Area of Cone is " + res + " m^2");
        }
    }

}
