import java.util.Objects;
public class CarC {
    private String make;
    private String model;
    private Engine engine;
    //konstruktor
    public CarC(Engine engine){
        this.make="";
        this.model="";
        this.engine = engine;
    }
    //gettery
    public String getMake(){return this.make;}
    public String getModel(){return this.model;}
    public Engine getEngine(){return this.engine;}
    //settery
    public void setMake(String make){
        if(make==null){
            throw new IllegalArgumentException("make cannot be set to null");
        }
        this.make=make;
    }
    public void setModel(String model){
        if(model==null){
            throw new IllegalArgumentException("model cannot be set to null");
        }
        this.model=model;
    }
    public void setEngine(Engine engine){
        if(engine==null){
            throw new IllegalArgumentException("engine cannot be set to null");
        }
        this.engine=engine;
    }
    //reszta funkcji
    @Override
    public String toString(){
        return "Carc{make="+this.make+", model="+this.model+", engine="+this.engine.toString()+"}";
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        CarC car = (CarC) obj;
        return make.equals(car.make) && model.equals(car.model) && engine.equals(car.engine);
    }
    @Override
    public int hashCode(){
        return Objects.hash(make,model,engine);
    }
}
