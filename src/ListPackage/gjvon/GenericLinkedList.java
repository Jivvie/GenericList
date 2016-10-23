package ListPackage.gjvon;

/**
 * Created by Gjvon on 10/14/16.
 */
public class GenericLinkedList<E> implements GeneralList<E>{

    private class Node{
        E value;
        Node next;
    }


    @Override
    public void add(E Object) {

    }

    @Override
    public void add(int index, E Object) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E Object) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(E Object) {
        return 0;
    }

    @Override
    public boolean isEmpty(E Object) {
        return false;
    }

    @Override
    public boolean remove(E Object) {
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E Object) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
