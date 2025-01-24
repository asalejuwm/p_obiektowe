public class Storage<T> {
    T object;
    public void store(T object) {
        this.object = object;
    }
    public T retrieve() {
        return object;
    }
    public static void main(String[] args) {
        Storage<String> storage = new Storage<>();
        storage.store("clothes");
        System.out.println(storage.retrieve());
    }
}
