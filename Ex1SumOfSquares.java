import java.util.Scanner;
public class Ex1SumOfSquares {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Inserisci un numero maggiore di 0");
        int input = myObj.nextInt();
        do{
            if (input <= 0) {
                System.out.println("ERRORE");
                System.exit(0);
            } else {
                int somma = 0;
                for (int i = 0; i <= input; i++) {
                    somma = somma + (i * i);
                }
                System.out.println("sommaa:" + somma);
                input = myObj.nextInt();
            }
        }while(input>0);
    }
}
