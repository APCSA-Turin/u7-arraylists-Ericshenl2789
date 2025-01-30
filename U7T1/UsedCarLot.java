package U7T1;

import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;
    
    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }
    
    public boolean swap(int index, int int2){
        if(index >= inventory.size()|| int2 >= inventory.size() || index < 0 || int2 < 0){
            return false;
        }
        Car car1 = inventory.get(index);
        Car car2 = inventory.get(int2);
        inventory.set(index, car2);
        inventory.set(int2, car1);
        return true;
    }
}
