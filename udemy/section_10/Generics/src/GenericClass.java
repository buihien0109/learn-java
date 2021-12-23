public class GenericClass<T> {
    private T myValue;

    public GenericClass(T myValue) {
        this.myValue = myValue;
    }

    public T getMyValue() {
        return myValue;
    }

    // Generic method
    public <T> void printValue() {
        System.out.println("Value: " + myValue);
    }
}
