package ListPackage.gjvon;

/**
 * Created by Gjvon on 10/14/16.
 */
public class GenericLinkedList<E> implements GeneralList<E> {

    //global variables
    private Node firstNode;
    public Node list = firstNode;
    private Node lastNode;

    public GenericLinkedList() {
        //initialize global variables;
        firstNode = null;
        lastNode = null;
    }


    public Node getGenericList() {
        return firstNode;
    }

    @Override
    public void add(E value) {
        if (isEmpty()) {
            firstNode = new Node(value);
            lastNode = firstNode;
        } else {
            lastNode.next = new Node(value);
            lastNode = lastNode.next;
        }
    }

    @Override
    public void add(int index, E value) {
        /*This node will transverse through our nodes to figure out where it belongs.*/
        Node NodeToInsert = firstNode;
        if (index < 0 || index > size()) {
            new ArrayIndexOutOfBoundsException();
        } else if (index == 0) {
            firstNode = new Node(value, firstNode);
            if (lastNode == null) {
                lastNode = firstNode;
            }
        }
        for (int count = 1; count <= index - 1; count++) {
            NodeToInsert = NodeToInsert.next;
            count++;
        }

        NodeToInsert = new Node(value, NodeToInsert.next);
        //what if there are no more elements in the list or the list has only one element?
        //this if statement inserts the value into that position.
        if (NodeToInsert.next.next == null) {
            lastNode = NodeToInsert.next;
        }
    }

    @Override
    public void clear() {
        firstNode = null;
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
        Node NodeWithWantedValue = firstNode;
        E listJumpingValue = firstNode.value;
        int counter;
        /* ToDO: Find out why the code below does not work.
           I do not understand why Java does not allow this type of referencing.
         */
        /*if (index == 0) {
            NodeWithWantedValue = NodeWithWantedValue.next;
            if (NodeWithWantedValue == null) {
                lastNode = NodeWithWantedValue;
            }*/
        if (index == 0) {
            firstNode = firstNode.next;
            if (firstNode == null) {
                lastNode = firstNode;
            }
        } else {
            for (counter = 1; counter <= index - 1; counter++) {
                NodeWithWantedValue = NodeWithWantedValue.next;
            }

            NodeWithWantedValue.next = NodeWithWantedValue.next.next;

            if (NodeWithWantedValue.next == null) {
                lastNode = NodeWithWantedValue;
            }
        }
        return listJumpingValue;
    }

    @Override
    public E set(int index, E Object) {
        return null;
    }

    @Override
    public int size() {
        Node n = firstNode;
        int count = 0;
        while (n != null) {
            count++;
            n = n.next;
        }
        System.out.println("This is ArrayList has " + count + " elements! ");
        return count;
    }

    boolean isEmpty() {
        return firstNode == null;
    }

    public String toString() {
        Node n = firstNode;
        StringBuilder str = new StringBuilder();
        str.append("Values: ");
        while (n != null) {
            str.append(n.value + "/");
            n = n.next;
        }
        //JOptionPane.showMessageDialog(null, str.toString());
        return str.toString();
    }

    //Node Class
    private class Node {
        E value;
        Node next;

        Node(E value) {
            this(value, null);
        }

        Node(E value, Node node) {
            this.value = value;
            next = node;
        }
    }
}
