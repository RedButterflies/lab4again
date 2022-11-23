/*Utwórz klasę Okrag:
o Zadeklaruj 3 pola odpowiednio dla współrzędnych x, y oraz promień okręgu,
o Dodaj konstruktor ustawiający odpowiednio wszystkie pola klasy:
 Współrzędne jako losowe liczby z zakresu <5,95>,
 Promień jako losową liczbę z zakresu <1,5>.
  dodaj trzy metody:
o Pierwsza ma utworzyć tablicę obiektów klasy Okrag.
o Druga ma sprawdzić wzajemne położenie dwóch dowolnych okręgów na
płaszczyźnie i zwrócić stosowny komunikat (styczne, rozłączne, przecinające
się, pokrywające się). Metoda ma przyjmować jako parametry dwa obiekty
klasy Okrąg.
o Trzecia ma wyświetlić w jednym wierszu wszystkie pola danego obiektu
(każdy obiekt w nowej linii). Wykorzystaj pętlę for – each*/

import java.util.Random;

import static java.lang.Math.*;

public class Okrag {
    private int x;
    private int y;
    private int r;

    Random wsp = new Random();
    public Okrag() {
        this.x = wsp.nextInt(91)+5;
        this.y = wsp.nextInt(91)+5;
        this.r = wsp.nextInt(5)+1;
    }

    static Okrag [] tablicaOkregow()
    {
        Okrag [] tablica = new Okrag[3] ;
        tablica[0]= new Okrag();
        tablica[1]= new Okrag();
        tablica[2]= new Okrag();

      return tablica;
    }
    static void polozenieOkregow(Okrag a, Okrag b)
    {
        double ab = abs(sqrt(pow((a.x-b.x),2)+pow((a.y-b.y),2)));
        if(ab>a.r+b.r){
            System.out.println("Okregi wzajemnie zewnetrzne");
        }
        if(ab==a.r+b.r){
            System.out.println("Okregi styczne zewnetrzne");
        }
        if(ab>a.r-b.r && ab <a.r+b.r){
            System.out.println("Okregi przecinajace sie");
        }
        if(ab==a.r-b.r){
            System.out.println("Okregi styczne wewnetrzne");
        }
        if(ab<a.r-b.r){
            System.out.println("Okregi nie sa styczne i wiekszy zawiera mniejszy");
        }

    }
    static void wyswietlaniePolObiektu(Okrag [] tablica)
    {
        for(Okrag t: tablica)
        {
            System.out.print("Wspolrzedna x "+ t.x + " ");
            System.out.print("Wspolrzedna y "+ t.y+ " ");
            System.out.print("Promien "+ t.r+ " ");
            System.out.println();
        }
    }
}
