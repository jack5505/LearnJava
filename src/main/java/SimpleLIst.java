import java.util.Iterator;

/*
 *
 *  @A Sabirov Jakhongir
 *
 */
public interface SimpleLIst<E> extends Iterable<E> {
    void add(E e);

    //void add(int index, E e);

    int get(int index);

    int size();

    @Override
    Iterator<E> iterator();
}
