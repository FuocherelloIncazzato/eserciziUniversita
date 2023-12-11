import java.util.Scanner;

public class SommaRicorsiva {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int a, b;
        do {
             a= myobj.nextInt();
             b= myobj.nextInt();
        }while(a<0 && b<0);
        int somma = somma(a,b);
        System.out.println("somma: "+somma);
    }
    public static int somma(int a,int b){
        int somma;
        if(b>0){
            somma=somma(a+1,b-1);
        }
        else{
            somma=a+b;
        }
        return somma;
    }
}
