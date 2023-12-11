import java.util.Scanner;

public class McdRicorsivo {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int a, b;
        do {
            a= myobj.nextInt();
            b= myobj.nextInt();
        }while(a<0 && b<0);
        int mcd = mcd(a,b);
        System.out.println("l'mcd tra "+a+" e "+b+" è: "+mcd);
    }
    public static int mcd(int a,int b){
        int mcd;
        if(a==b)
            mcd = a;
        else if(a<b)
            mcd = mcd(b,a);
        else
            mcd = mcd(a-b,b);
        return  mcd;
    }
}
