import java.util.Objects;
public class Engine {
    private int power;
    private String type;
    private int serialNumber;
    //konstruktor
    public Engine(int power, String type, int serialNumber){
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }
    //gettery
    public int getPower(){return this.power;}
    public String getType(){return this.type;}
    public int getSerialNumber(){return this.serialNumber;}
    //settery
    public void setPower(int power){
        if(power<0){
            throw new IllegalArgumentException("Cannot set power below 0");
        }
        this.power = power;
    }
    public void setType(String type){
        if(type==null){
            throw new IllegalArgumentException("Cannot set type to null");
        }
        this.type = type;
    }
    public void setSerialNumber(int serialNumber){
        if(serialNumber<0){
            throw new IllegalArgumentException("Cannot set serial number below 0");
        }
        this.serialNumber=serialNumber;
    }
    //reszta funkcji
    @Override
    public String toString(){
        return "Engine{power="+this.power+", type="+this.type+", serial number="+this.serialNumber+"}";
    }
    @Override
    public int hashCode(){
        return Objects.hash(power,type,serialNumber);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Engine engine = (Engine) obj;
        return power==engine.power && type.equals(engine.type) && serialNumber == engine.serialNumber;
    }
}
