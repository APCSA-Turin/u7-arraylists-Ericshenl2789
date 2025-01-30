package U7T1;

public class Car {
    private String name;
    private int mileage;

    public Car(String _name, int mile){
        name = _name;
        mileage = mile;
    }

    public String toString(){
        return name + " " + mileage + "mi";
    }


}
