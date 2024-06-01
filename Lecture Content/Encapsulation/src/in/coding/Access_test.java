package in.coding;

public class Access_test {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.model = "shw";
//        car.costOfPurchase;

        Car newCar = new Car("Black", "BMW", 1, 23323);
        System.out.println(Car);
        System.out.println(newCar);
    }
}
