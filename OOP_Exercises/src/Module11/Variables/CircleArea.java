package Module11.Variables;

public class CircleArea {
    public static void main(String[] args) {
        int circleRadius1 = 1;
        int circleRadius2 = 3;
        int circleRadius3 = 5;
        float pi = (float)Math.PI;

        float circleArea1 = 2 * pi *circleRadius1;
        float circleArea2 = 2 * pi *circleRadius2;
        float circleArea3 = 2 * pi *circleRadius3;

        System.out.println("areas of circles are = "
        + circleArea1 + " " + circleArea2 + " " + circleArea3);
    }
}
