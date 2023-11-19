package Module3_6.Farver;

public class Test {
    public static void main(String[] args) {
        RGB[] tests = {
                new RGB(255, 0, 0),
                new RGB(0, 255 ,0),
                new RGB(0, 0, 255),
                new RGB(0, 0, 0),
                new RGB(255, 255, 255),
                new RGB(18, 52, 86),
                new RGB(88, 154, 188),
        };

        for (RGB test : tests){
            HSV hsv = test.asHSV();
            RGB rgb = hsv.asRGB();

            System.out.println(test+" -> "+hsv+" -> "+rgb);
        }
    }
}
