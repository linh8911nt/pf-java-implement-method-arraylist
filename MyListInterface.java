public interface MyListInterface<E> {
    void add(int index, E element);
    E remove(int index);
    int size();
    E clone();
    boolean contains(E o);
    int indexOf(E o);
    boolean add(E e);
    void ensureCapacity(int minCapacity);
    E get(int i);
    void clear();

}
