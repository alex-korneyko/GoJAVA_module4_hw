package ua.GoIT.GoJAVA;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("----------- Area calculation -----------");

        System.out.println("Triangle 2x4x3");
        System.out.println("Area: " + CalculateArea.TriangleArea(2.0, 4.0, 3.0));
        System.out.println();

        System.out.println("Rectangle 4x6");
        System.out.println("Area: " + CalculateArea.RectangleArea(4, 6));
        System.out.println();

        System.out.println("Circle with radius 7");
        System.out.println("Area: " + CalculateArea.CircleArea(7));
        System.out.println();

        System.out.println("--------- Temperature conversion ---------");

        double fahDegree = TempConverting.ToFahrenheit(30);
        System.out.println("Celsius: 30° in Fahrenheit: " + fahDegree + (char)176);
        System.out.println("and backward...");
        System.out.println("Fahrenheit: " + fahDegree + "° in Celsius: " + TempConverting.ToCelsius(fahDegree) + (char)176);
        System.out.println();

        System.out.println("------- Distance between two dots -------");
        Dot dot1 = new Dot(-4.5, 4);
        Dot dot2 = new Dot(3.5, -4.5);

        System.out.print("Distance between dot"+dot1.toString()+" and dot"+dot2.toString());
        System.out.println(" is "+Distance.BetweenTwoDots(dot1, dot2));
    }
}
