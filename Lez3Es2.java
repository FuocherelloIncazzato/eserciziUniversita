import java.util.Scanner;

public class Lez3Es2 {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("inserisci una stringa casuale");
        String stringa = myObj.nextLine();
        int posizione = stringa.indexOf(" ");
        boolean words = stringa.contains(" ");
        System.out.println(words);
    }
}
