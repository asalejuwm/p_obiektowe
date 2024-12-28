public class CarC implements Comparable<CarC>{
    private String brand;
    private int mileage;
    private int yearOfProduction;
    public CarC(String brand, int mileage, int yearOfProduction) {
        this.brand = brand;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getMileage(){
        return this.mileage;
    }
    public int getYearOfProduction(){
        return this.yearOfProduction;
    }

    @Override
    public int compareTo(CarC other){
        return Integer.compare(this.mileage,other.mileage);
    }

    @Override
    public String toString() {
        return "CarC{" + "brand='" + brand + '\'' + ", mileage=" + mileage + ", yearOfProduction=" + yearOfProduction + '}';
    }

}