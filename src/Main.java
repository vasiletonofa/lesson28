import list.Afisare;
import list.GenericList;
import list.Person;
import list.TekwilList;
import map.TekwillMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//
        List<String> list = new ArrayList();

        list.add("Hello");
        list.add("World");
//
//
//        for(int i = 0; i< list.size(); i++) {
//            String s = list.get(i);
//
//            System.out.println(s);
//        }


//        TekwilList<Integer> tekwilList = new TekwilList<>();
//
//        TekwilList.description = "ERROR";
//
//        tekwilList.add(1);
//        tekwilList.add(5);
//
//        Integer a = tekwilList.get(0);
//        Integer b = tekwilList.get(1);
//
//        System.out.println(a);
//
//        System.out.println(b);
//
//
//        GenericList<String> tekwilList = new TekwilList<>();
//
//
//        tekwilList.add("Hello");
//        tekwilList.add("World");
//
//        String a = tekwilList.get(0);
//        String b = tekwilList.get(1);
//
//        System.out.println(a);
//
//        System.out.println(b);
//
//
//        TekwillMap<String, Integer> tekwillMap = new TekwillMap();
//
//        tekwillMap.put("Key1", 1);
//        tekwillMap.put("Key2", 10);
//
//        TekwillMap<Integer, String> tekwillMap2 = new TekwillMap();
//
//        tekwillMap2.put(1, "Valoare String");
//
//        TekwillMap<Double, Boolean> tekwillMap3 = new TekwillMap<>();
//
//        tekwillMap3.put(new Double(2), new Boolean(true));

//
//        Person ion = new Person();
//
//        ion.setVarsta(24);
//        ion.setInformatie("Informatia Doi");
//
//        ion.afisareInformatie();
//        ion.afisareVarsta();
//
//
//        Person vasile = new Person();
//        vasile.setVarsta(27);
//        vasile.setInformatie("Informatie de la Vasile");
//
//        vasile.afisareInformatie();
//        vasile.afisareVarsta();
//
//        Person andrei = new Person();
//
////        vasile.setVarsta(35);
//
//        andrei.afisareInformatie();
//        andrei.afisareVarsta();
//
//
//        TekwilList<Integer> tekwilList = new TekwilList<>();
//
//        TekwilList<String> tekwilList2 = new TekwilList<>();
//
//        tekwilList2.print(tekwilList);


        Afisare afisare = new Afisare();

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        afisare.afiseaza(stringList);
        afisare.afiseaza(integerList);


        TekwilList<Integer> listtek;
        afisare.afiseazaNumere(listtek);
        afisare.afiseazaNumere(stringList);




        afisare.afiseazaUnObiect(true);


        Object a = new String("Hello");




        List<String> listStr = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();



        List<?> listOb;

        listOb = listInt;
        listOb = listStr;





        TekwilList<Integer> list1 = new TekwilList<>();

        List<Number> ai = new ArrayList<>();
        List<String> ab = new ArrayList<>();

        list1.printGeneric(ai);



    }
}