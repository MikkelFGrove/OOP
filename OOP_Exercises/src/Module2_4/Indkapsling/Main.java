package Module2_4.Indkapsling;


class Circle {
    private double x, y;
    private double d;

    public Circle (double x, double y, double diameter){
        this.x = x;
        this.y = y;
        this.d = diameter;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public double getD(){
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Coordinate{
    double x;
    double y;

    public double setY(double y){
        return y * 0.65;
    }
    public double setX(double x){
        return x * 1.37;
    }
}
class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(1.24, 2.83, 12.7);
        System.out.println("x="+c.getX()+" y="+c.getY()+" r="+c.getD());
        c.setD(c.getD() * 1.37);
        c.setX(c.getD()+0.65);
        System.out.println("x="+c.getX()+" y="+c.getY()+" d="+c.getD());
    }
}
