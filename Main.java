import java.util.ArrayList;
import java.util.Arrays;

import U7T1.Car;

public class Main{
    public static void main(String[] args) {

        // create an array with the known values
        Car[] carArray = {new Car("Bugatti", 212), new Car("Porche", 454), new Car("Challenger", 123)};

        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Car> cArrayList = new ArrayList<Car>(Arrays.asList(carArray));
        System.out.println(cArrayList);

    }
}