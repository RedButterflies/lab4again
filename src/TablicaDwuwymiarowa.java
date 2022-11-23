import java.util.Random;

/* Napisz metodę, która utworzy kwadratową tablicę dwuwymiarową liczb całkowitych
o losowej wielkości (wylosowanej z zakresu [10,20]). Liczba kolumn i wierszy ma
być taka sama. Tablica ma zostać wypełniona wartościami wylosowanymi
z przedziału [-20,20], z wyjątkiem elementów znajdujących się na przekątnej tablicy,
które losowo otrzymają wartość - 1 lub 1.
 Napisz metodę, która obliczy stosunek sumy liczb leżących w komórkach tablicy
o parzystych indeksach wierszy do sumy liczb leżących w komórkach tablicy
o nieparzystych indeksach kolumn. Wykorzystaj klasę Random.
*/
public class TablicaDwuwymiarowa {
    static int[][] tworzenieTablicy()
    {
        Random rnd = new Random();
        int rozmiar= rnd.nextInt(11)+10;
        int [][] tablica = new int [rozmiar][rozmiar];
        Random wypelnienie = new Random();
        for(int i=0;i<rozmiar;i++)
        {
            for(int j=0;j<rozmiar;j++)
            {
                if(i==j)
                {
                    if(rozmiar<15)
                    {
                        tablica[i][j]=-1;
                    }
                    if(rozmiar>=15)
                    {
                        tablica[i][j]=1;
                    }
                }
                else
                {
                    tablica[i][j]= wypelnienie.nextInt(41)-20;
                }
            }
        }
         for(int i=0;i<rozmiar;i++)
         {
             for(int j=0;j<rozmiar;j++)
             {
                 if(tablica[i][j]>=0 && tablica[i][j]<10 )
                 {
                     System.out.print("  ");
                 }
                 if(tablica[i][j]>=10)
                 {
                     System.out.print(" ");
                 }
                 if(tablica[i][j]<0 && tablica[i][j]>-10 )
                 {
                     System.out.print(" ");
                 }
                 System.out.print(tablica[i][j]+" ");
             }
             System.out.println();
         }
         return tablica;
    }
    static void stosunekiczb(int [][]tablica)
    {
        int sumaP=0;
        int sumaNP=0;
        for(int i=0;i<tablica.length;i++)
        {
            for(int j=0;j<tablica.length;j++)
            {
                if(j%2==0)
                {
                    sumaP+=tablica[i][j];
                }
                if(i%2==1)
                {
                    sumaNP+=tablica[i][j];
                }
            }
        }
        System.out.println("Stosunek sumy liczb lezacych w komorkach tablicy o parzystych indeksach wierszy\n do sumy liczb lezacych w komorkach tablicy o nieparzystych indeksach kolumn wynosi: "+ (double)sumaP/sumaNP);
    }

}
