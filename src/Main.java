public class Main {
    public static void main(String[] args) {
      //TablicaJednowymiarowa.wyswietlenieTablicy(TablicaJednowymiarowa.utworzTablice());
        TablicaDwuwymiarowa.tworzenieTablicy();
        TablicaDwuwymiarowa.stosunekiczb(TablicaDwuwymiarowa.tworzenieTablicy());
        Okrag.tablicaOkregow();
        Okrag o1= new Okrag();
        Okrag o2 = new Okrag();
        Okrag.polozenieOkregow(o1,o2);
        Okrag [] tablica =Okrag.tablicaOkregow();
        Okrag.wyswietlaniePolObiektu(Okrag.tablicaOkregow());
        for (Okrag okrag : tablica) {
            Okrag.polozenieOkregow(okrag, o2);
        }
    }
}