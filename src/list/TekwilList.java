package list;

import java.util.ArrayList;
import java.util.*;

public class TekwilList<E> implements GenericList<E> {

    ArrayList<E> array = new ArrayList<>();

    @Override
    public void add(E value) {
        array.add(value);
    }

    public void printGeneric(List<? extends Number> collection) {

    }

    @Override
    public E get(int index) {
        return array.get(index);
    }

    static <V> TekwilList<V> getClassInfo() {
        return new TekwilList<V>();
    }

    public static <F> void print(TekwilList<F> list) {

    }
}
