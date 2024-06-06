public class Circle extends Shape {


    public Circle(int radiusOfCircle) {
        super(radiusOfCircle);
    }

    @Override
    public double CalculcateArea() {

        return PI * radiusOfCircle * radiusOfCircle;
    }
}
