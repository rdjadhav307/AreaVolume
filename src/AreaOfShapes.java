public class AreaOfShapes {

    void area(double r)
    {
        System.out.println("Area of Circle of Radius "+r+"m is "+(3.14*r*r)+" m^2");
    }
    float area(float a, float b)
    {
        return a*b;
    }
    void area(float len )
    {
        System.out.println("Area of Square is "+(len*len)+" m^2");
    }
    void area(float a, float b, float h)
    {
        float res = (a+b)/2;
        System.out.println("Area of Trapezium is "+(res*h)+" m^2");
    }
    void area(double base, double height)
    {
        double res =base * height;
        System.out.println("Area of Triangle is "+(res/2)+" m^2");
    }
    void area(float mn, float mj, char a)
    {
        System.out.println("Area of Ellipse is "+(3.14*mn*mj)+" m^2");
    }

}

