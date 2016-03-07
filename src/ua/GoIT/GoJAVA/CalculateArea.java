package ua.GoIT.GoJAVA;

/**
 * Class {@code CalculateArea} calculate areas in different shapes
 */
public class CalculateArea
{
    /**
     * Method {@code TriangleArea} is static method for calculating area for any triangles
     * @param a side of triangle
     * @param b side of triangle
     * @param c side of triangle
     * @return area of triangle
     */
    public static double TriangleArea(double a, double b, double c){

        double halfP = (a + b + c) / 2;         //Calculate a half of Perimeter

        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    /**
     * Method {@code RectangleArea} is static method for calculating area for any rectangles
     * @param a side of rectangle
     * @param b side of rectangle
     * @return area of rectangle
     */
    public static double RectangleArea(double a, double b)
    {
        return a * b;
    }

    /**
     * Method {@code CircleArea} is static method for calculating area for any circles
     * @param radius radius of circle
     * @return area of circle
     */
    public static double CircleArea(double radius)
    {
        return Math.PI * radius * radius;
    }
}
