public interface Drawable {
    abstract void draw();
    default void display(){
        System.out.println("Displaying Drawable");
    }
    static String getType(){
        return "DrawableType";
    }

}
