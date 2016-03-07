package ua.GoIT.GoJAVA;

/**
 * Class {@code Distance} calculate distances between various objects
 * in a rectangular coordinate system
 */
public class Distance {

    /**
     * Calculate distance between two dots
     * @param dot1 object of {@code Dot} class
     * @param dot2 object of {@code Dot} class
     * @return distance
     */
    public static double BetweenTwoDots(Dot dot1, Dot dot2)
    {
        return Math.sqrt(Math.pow((dot2.getX()-dot1.getX()),2) + Math.pow((dot2.getY()-dot1.getY()),2));
    }
}

/**
 * Class {@code Dot} build an geometric dot with two coordinates for two-dimensional space
 */
class Dot
{
    private double x;
    private double y;

    Dot(double XCoordinate, double YCoordinate)
    {
        x = XCoordinate;
        y = YCoordinate;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString()
    {
        return "("+x+" ,"+y+")";
    }
}
