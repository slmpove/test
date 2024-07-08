import java.awt.*;

public class Circle extends Shape implements ColorDraw,Comparable<Circle>{
    private double radius;
    static final int DEFAULT_RADIUS = 5;


    public Circle(double radius, double x, double y) {
        super(x,y);
        this.radius = radius;

    }

    public Circle(double radius) {
        super(0,0);
        this.radius = radius;

    }

    public Circle(double x, double y) {
        super(x,y);
        this.radius = DEFAULT_RADIUS;

    }


    public void checkColor() {
        if (isInBoundary()) {
            setColor(ShapeColor.GREEN);
        } else {
            setColor(ShapeColor.RED);
        }
    }

    public boolean isInBoundary() {
        if (-1 * getScreenSize() > super.getX() - this.radius || getScreenSize() < super.getX() + this.radius) {
            return false;
        }
        if (-1 * getScreenSize() > super.getY()- this.radius || getScreenSize() < super.getY() + this.radius) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + " x=" + super.getX() +
                ", y=" + super.getY() +
                ", color=" + getColor() +
                "}\n";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return super.getX();
    }

    public void setX(double x) {
        super.setX(x);
    }

    public double getY() {
        return super.getY();
    }

    public void setY(double y) {
        super.setY(y);
    }

    public void draw() {

        StdDraw.setPenColor(super.getColor());
        StdDraw.filledCircle(super.getX(), super.getY(), radius);

    }

    @Override
    public void customizedColor(ColorScheme colorScheme, int index) {
        Color[] colorList = colorScheme.getColorScheme();
        if (index < 0){
            index = 0;
        }
        if (index >= colorList.length){
            index = index % colorList.length;
        }
        StdDraw.setPenColor(colorList[index]);
        StdDraw.filledCircle(super.getX(), super.getY(), radius);
    }

    @Override
    public int compareTo(Circle o) {
        return (int) (o.radius-this.radius);
    }
}
