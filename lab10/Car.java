public class Car implements VehicleManager {
    public Car(){
    }
    @Override
    public String startEngine(){
        return "Silnik samochodu uruchomoiony";
    }
    @Override
    public int getFuelLevel(){
        return 50;
    }
}
