public class House extends Building{
    int numberOfRooms;
    public House(){
    }
    public House(int height, String color, int numberOfRooms) {
        super(height, color);
        this.numberOfRooms = numberOfRooms;
    }

    public static void main(String[] args){
        House house = new House(5,"red",10);
    }
}
