import java.util.Scanner;

public class Lez2Es4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("inserisci una stringa di 4 caratteri:");
        String messaggio = myObj.nextLine();
        if(messaggio.length()!=4){
            System.out.println("ERRORE");
            System.exit(0);
        }
        boolean check = true;
        for(int i=0;i<messaggio.length();i++){
            System.out.println(messaggio.charAt(i));
            if(messaggio.charAt(i)>'8' || messaggio.charAt(i)<'0'){
                System.exit(0);
                check=false;
            }
            if(i==messaggio.length()-1 && check){
                System.out.println("YES: "+messaggio);
            }
        }
    }
}
