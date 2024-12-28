public class Motorcycle implements VehicleManager{
    public Motorcycle(){
    }
    @Override
    public String startEngine(){
        return "Silnik motocykla uruchomiony";
    }
    @Override
    public int getFuelLevel(){
        return 30;
    }
}
