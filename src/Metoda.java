public class Metoda {
    int sum = 0;

    int calculateSum (int liczba){
        while(liczba > 0){
            int i = liczba%10;
            sum = sum + i;
            liczba = liczba /10;
        }
        return sum;
    }

}
