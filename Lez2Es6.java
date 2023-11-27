import java.util.Scanner;
public class Lez2Es6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("inserisci una stringa di lunghezza 5 caratteri contenente solo '+' e '-': ");
        String messaggio1 = myObj.nextLine();
        if (messaggio1.length() == 5) {
            for (int i = 0; i < messaggio1.length(); i++) {
                if (messaggio1.charAt(i) != '+' && messaggio1.charAt(i) != '-') {
                    System.out.println("la stringa contiene caratteri non validi!");
                    System.exit(0);
                }
            }
        }
        else {
            System.out.println("la prima stringa non è di 5 caratteri");
            System.exit(0);
        }
        System.out.println("inserisci un'altra stringa di lunghezza 5 caratteri contenente solo '+' e '-': ");
        String messaggio2 = myObj2.nextLine();
        if (messaggio2.length() == 5) {
            for (int i = 0; i < messaggio2.length(); i++) {
                if (messaggio2.charAt(i) != '+' && messaggio2.charAt(i) != '-') {
                    System.out.println("la stringa contiene caratteri non validi!");
                    System.exit(0);
                }
            }
        }
        else {
            System.out.println("la seconda stringa non è di 5 caratteri");
            System.exit(0);
        }
        //fine controlli
        int a = 0;
        int b = 4;
        for(int i = 0;i<5;i++){
            if(messaggio1.charAt(i)=='+'){
                a=a+1;
            }
            else{
                a=a-1;
            }
            if(messaggio2.charAt(i)=='+'){
                b=b+1;
            }
            else{
                b=b-1;
            }
            System.out.println("Il valore di a è "+a+", il valore di b è "+b);
            if(a==b){
                System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
                System.exit(0);
            }
        }
    }
}
