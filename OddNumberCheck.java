import java.util.Scanner;
public class OddNumberCheck {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        /* enter n from standard input, and check whether n is odd(dispari) and within the range (5,51)*/
        System.out.println("inserisci un numero dispari a piacere: ");
        try {
            int inputNumber = myObj.nextInt();
            if (inputNumber >= 5 && inputNumber <= 51 && inputNumber%2 != 0) {
                System.out.println("hai inserito un numero dispari che è compreso tra 5 e 51!");
            } else {
                System.out.println("hai inserito un numero che non è compreso tra 5 e 51 o che è pari!");
            }
        }catch (Exception e){ // non l'abbiamo ancora fatto, comunque è per controllare se l'utente inserisce un numero o meno
            System.out.println("hai inserito un elemento che non è un numero");
        }
    }
}