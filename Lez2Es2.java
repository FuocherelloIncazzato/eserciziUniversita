import java.util.Scanner;
public class Lez2Es2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("inserisci il primo numero intero:");
        int firstInput = myObj.nextInt();
        System.out.println("inserisci il secondo numero intero con cui dividere "+firstInput+" :");
        int secondInput = myObj.nextInt();
        if(secondInput==0)
            System.exit(0);
        else
            System.out.println("ecco il risultato della divisione: "+((float)firstInput/(float)secondInput));
    }
}
