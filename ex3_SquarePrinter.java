import java.util.Scanner;
public class ex3_SquarePrinter {
    public static void main(String[] args){
        System.out.println("inserisci n >0");
        Scanner myobj = new Scanner(System.in);
        int valore = myobj.nextInt();
        for(int i=0;i<valore;i++){
            for(int j=0;j<valore;j++){
                if((i+j)%2==0)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println("\n");
        }
    }
}
