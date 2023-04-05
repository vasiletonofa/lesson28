package list;

import java.util.*;

public class Afisare {


    public void afiseaza(List<?> list) {

        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void afiseazaNumere(List<? extends Number> list) {

        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void afiseazaInteger(List<? super Integer> list) {

        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void afiseazaUnObiect(Object element) {
        System.out.println(element);
    }

}
