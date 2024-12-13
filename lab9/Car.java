public record Car(String brand, String model, double fuelConsumptionPer100km) {
    double fuelCost(double fuelPrice, double distance){
        double fuel = (distance/100)*this.fuelConsumptionPer100km;
        return fuel*fuelPrice;
    }

}
