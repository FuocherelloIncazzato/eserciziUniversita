import java.util.Scanner;
public class Lez2Es1 {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("inserisci un numero intero:");
            int inputNumber = myObj.nextInt();
            if(inputNumber>0)
                System.out.println("ecco il numero assoluto: "+inputNumber);
            else
                System.out.println("ecco il numero assoluto: "+inputNumber*(-1));
        }
        catch(Exception e){
          System.out.println("non hai inserito un numero intero o un numero troppo grande");
        }
    }
}
