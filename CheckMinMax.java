import java.util.Scanner;
public class CheckMinMax {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("inserisci un numero a piacere: ");
        int firstInput = myObj.nextInt();
        System.out.println("inserisci un altro numero a piacere: ");
        int secondInput = myObj.nextInt();
        if(firstInput == secondInput){
            System.out.println("i numeri sono uguali");
            System.exit(0);
        }
        else if(firstInput<secondInput){
            System.out.println("il numero " + firstInput + " è minore di " + secondInput);
        }else{
            System.out.println("il numero " + firstInput + " è maggiore di " + secondInput);
        }
    }
}
