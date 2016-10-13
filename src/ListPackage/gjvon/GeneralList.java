package ListPackage.gjvon;

/**
 * Created by Gjvon on 10/13/16.
 */
public interface GeneralList<E> {
    void add(E Object);
    void add(int index, E Object);
    void clear();
    boolean contains(E Object);
    E get(int index);
    int indexOf(E Object);
    boolean isEmpty(E Object);
    boolean remove(E Object);
    E remove(int index);
    E set(int index, E Object);
    int size();
}
