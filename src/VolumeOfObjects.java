public class VolumeOfObjects {
    void volume(float r, float h, char ch)
    {
        if (ch == 't') {
            System.out.println("Volume of Cylinder is " + (3.14 * r * r * h) + " m^3");
        }
        else
        {
            System.out.println("Volume of Cone is " + (3.14 * r * r * h)/3 + " m^3");
        }
    }
    void volume(float r, char ch)
    {
        if(ch == 's') {
            double res = (4 * 3.14 * r * r * r) / 3;
            System.out.println("Volume of Sphere is " + res + " m^3");
        }else {
            System.out.println("Volume of Cube is " + (r * r * r) + " m^3");
        }
    }
    void volume(float l, float w, float h, char ch)
    {
        if(ch == 'r') {
            System.out.println("Volume of Rectangular Prism is " + (l * w * h) + " m^3");
        }else
        {
            System.out.println("Volume of Pyramid is " + (l * w * h)/3 + " m^3");
        }
    }
}