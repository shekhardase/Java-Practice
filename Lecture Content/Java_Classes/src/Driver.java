public class Driver {


    // object declaration

    // MEMORY ALLOCATION HAPPENS IN HEAP MEMORY


    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.AddFuel(5);
//        myCar.Driving();
//        System.out.println(myCar.GetCurrentFuel());
//        myCar.Driving();
//        myCar.Driving();
//        myCar.Driving();
//        myCar.Driving();
//        myCar.Driving();
//
//        myCar.Driving();
//        myCar.AddFuel(34.34f);
//        System.out.println(myCar);


        Car Swift = new Car();
        Swift.AddFuel(5);
        Swift.Start();
        Swift.Driving();


        Car ss = new Car();
        ss.AddFuel(23);
        Car StartedCar = ss.Start();
        StartedCar.Driving();

        ss.Driving();
        System.out.println(ss.MaxSpeed);
    }
}
