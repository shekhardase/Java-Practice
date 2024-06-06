public class Square extends Shape {

    public Square(int radiusOfCircle) {
        super(radiusOfCircle);
    }

    @Override
    public double CalculcateArea() {
        return radiusOfCircle * radiusOfCircle;
    }
}
