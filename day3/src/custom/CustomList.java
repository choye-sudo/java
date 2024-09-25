package custom;

public interface CustomList<T> {
    void add(T item);
    int size();
    void remove(int index);
    void remove(T item);
    Object get(int index);
    Object get(T item);
}
