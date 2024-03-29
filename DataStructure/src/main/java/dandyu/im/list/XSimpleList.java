package dandyu.im.list;

public interface XSimpleList<E> {
    boolean add(E element);
    boolean remove(int index);
    void clearList();
    int size();
    E get(int index);
}
