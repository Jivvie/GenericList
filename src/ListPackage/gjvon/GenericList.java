package ListPackage.gjvon;

import java.util.Arrays;


/**
 * Created by Gjvon on 10/13/16.
 */
public class GenericList<E> implements GeneralList<E> {

    private final int DEFAULT_LIST_SIZE = 10;
    private E list[];
    private int numOfObjects;
    /*
    Default class instance:
    If user does not add the amount of values needed we will give them a free 10 element array.
    "Even if the user only wants one piece of candy, give them 10; just in case."
     */
    GenericList() {
        list = (E[]) new Object[DEFAULT_LIST_SIZE];
        this.numOfObjects = 0;
    }

    GenericList(int numOfObjects) {
        if (numOfObjects >= DEFAULT_LIST_SIZE) {
            resize();
        } else if (numOfObjects < 1) {
            throw new IllegalArgumentException();
        } else {
            list = (E[]) new Object[numOfObjects + DEFAULT_LIST_SIZE];
            this.numOfObjects = 0;
        }
    }

    /*
    Our resize method will resize our array based on our DEFAULT_LIST_SIZE variable above. We do not want to allocate
    too much or too little memory. We also do not want to make unnecessary loops to our resizze method every time the user
    wants to add more objects. Adding 10 more null elements to our array is ideal.
     */
    private void resize() {
        int newLength = (list.length + DEFAULT_LIST_SIZE) + 10;
        E[] newList = (E[]) new Object[newLength];
        for (int i = 0; i < list.length; i++)
            newList[i] = list[i];
        this.list = newList;
        numOfObjects = newList.length - 1;
    }

    private String[] toStringArray() {
        String[] strings = new String[numOfObjects];
        for (int i = 0; i < numOfObjects; i++) {
            strings[i] = String.valueOf(list[i]);
        }
        return strings;
    }

    @Override
    public String toString() {
        String s;
        s = Arrays.toString(toStringArray());
        return s;
    }

    /*
    The add method will add values to our E list array. If the number of values are equal to the length of the array,
     our array needs to be sized again.
     If this is not the case, we should add the new value into our array.
     */
    @Override
    public void add(E Object) {

        if (numOfObjects == list.length) {
            resize();
        }
        list[numOfObjects] = Object;
        numOfObjects++;
    }

    @Override
    public void add(int index, E Object) {
        if (index < 0 || index > this.size() || index > numOfObjects) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = numOfObjects; i > index; i--) list[i] = list[i - 1];
        list[index] = Object;
        //We added an object so our variable needs to be updated.
        numOfObjects++;
    }

    @Override
    public void clear() {
        for (int i = numOfObjects - 1; i >= 0; i--) list[i] = null;

        numOfObjects = 0;
    }

    @Override
    public boolean contains(E Object) {
        for (int i = 0; i < numOfObjects; i++)
            if (list[i] == Object) {
                return true;
            }
        return false;
    }

    @Override
    public E get(int index) {

        if (index < 0 || index > numOfObjects) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            return list[0];
        }
        return list[index - 1];
    }

    @Override
    public int indexOf(E Object) {
        for (int index = 0; index < numOfObjects; index++)
            if (list[index].equals(Object)) {
                return index;
            }
        return -1;
    }

    @Override
    public boolean isEmpty(E Object) {
        if (numOfObjects == 0) {
            return true;
        }

        return false;
    }


    //TODO: DEFINE METHODS
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
        return list.length;
    }

}
