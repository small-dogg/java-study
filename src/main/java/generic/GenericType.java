package generic;

public class GenericType<T>  {
    private T name;

    public GenericType() {
    }

    public GenericType(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
