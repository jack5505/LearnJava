import java.util.Iterator;
import java.util.LinkedList;

/*
 *
 *  @A Sabirov Jakhongir
 *
 */
public class LinkedSimpleLIst<E> implements SimpleLIst<E> {
    private int size;
    private Node<E> head;
    private Node<E> tail;

    private static class Node<E>{
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
        // value
        // next

    }

    @Override
    public void add(E e) {
        final Node<E> f = head;
        final Node<E> newNode = new Node<>(null, e, f);
        head = newNode;
        if (f == null)
            tail = newNode;
        else
            f.prev = newNode;
        size++;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
