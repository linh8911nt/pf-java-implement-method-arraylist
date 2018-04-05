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
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E clone() {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        if (size == DEFAULT_CAPACITY){

        }
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public void clear() {

    }
}
