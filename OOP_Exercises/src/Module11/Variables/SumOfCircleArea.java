package Module11.Variables;

public class SumOfCircleArea {
    public static void main(String[] args){
        int circle1Radius = 1;
        int circle2Radius = 3;
        int circle3Radius = 5;
        float pi = (float)Math.PI;

        float circle1Area = circle1Radius * 2f * pi;
        float circle2Area = circle2Radius * 2f * pi;
        float circle3Area = circle3Radius * 2f * pi;
        float circleSum = circle1Area + circle2Area + circle3Area;
        System.out.println("The radius of a circle with radius 1, 3 and 5 is "
        + circle1Area + " " + circle2Area + " " + circle3Area + " the sum of all the circle radius is " + circleSum);

    }

}
