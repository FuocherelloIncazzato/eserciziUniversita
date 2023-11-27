import java.util.Scanner;
public class Ex5StringEqualityChecker {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Inserisci la prima parola!");
        String parola1 = myObj.nextLine();
        System.out.println("Inserisci la seconda parola!");
        String parola2 = myObj1.nextLine();
        if(parola1.length()==parola2.length()){
            for(int i=0;i<parola1.length();i++){
                if(parola1.charAt(i) != parola2.charAt(i)){
                    System.out.println("ERRORE PAROLE DIVERSE");
                    System.exit(0);
                }
            }
            System.out.println("Parole UGUALI!!");
        }
        else
            System.out.println("ERRORE PAROLE DIVERSE");
    }
}
