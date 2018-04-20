import java.util.Arrays;

public class MyList<E> implements MyListInterface{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        for (int i = index; i < size - 1; i++){
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements[index];
    }

    @Override
    public int size() {
        size = elements.length;
        return size;
    }

    @Override
    public E clone() {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        boolean isContains = false;
        for (int i = 0; i < size; i++){
            if (elements[i] == o){
                isContains = true;
                break;
            }
        }
        return isContains;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        for (int i = 0; i < size; i++){
            if (elements[i] == o){
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean add(Object o) {
        if (size == elements.length){
            ensureCapacity(1);
        }
        elements[size++] = o;
        return true;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public Object get(int i) {
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("index: " + i + " size: " + size);
        }
        return (E) elements[i];
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }
}
