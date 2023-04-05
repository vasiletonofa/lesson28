package list;

public class Person {

    public static String informatie;

    public Integer varsta;

    public void setInformatie(String informatie) {
        Person.informatie = informatie;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public void afisareInformatie() {
        System.out.println(informatie);
    }


    public void afisareVarsta() {
        System.out.println(varsta);
    }

    public static String getInformatie() {
        return informatie;
    }

    public  Integer getVarsta() {
        return varsta;
    }
}
