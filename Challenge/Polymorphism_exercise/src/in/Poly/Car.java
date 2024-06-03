package in.Poly;

public class Car extends Vehicle {

    public String name;


    @Override
    public void service() {
        super.service();
        System.out.println("car hai bc");
    }
}
