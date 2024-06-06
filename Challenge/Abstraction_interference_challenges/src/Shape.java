public abstract class Shape {

    public int radiusOfCircle;
    public final double PI = 3.14;

    public abstract double CalculcateArea();

    public Shape(int radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }


}
