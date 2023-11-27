import java.util.Scanner;

public class Lez3Es1 {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("inserisci il numero del mese: ");
        int mese = myObj.nextInt();
        if(mese<1 || mese>12){
            System.out.println("Mese non valido");
            System.exit(0);
        }
        System.out.println("inserisci il numero dell'anno: ");
        int anno = myObj2.nextInt();
        if(anno<1900 || anno>2099){
            System.out.println("Anno non valido");
            System.exit(0);
        }
        int giorni=0;
        if(mese==1 || mese==3 || mese==5 || mese==7 || mese==8 || mese==10 || mese==12){
            giorni=31;
        }
        else if(mese != 2){
            giorni=30;
        }
        else if(mese==2 && ((anno%4==0 && anno%100!=0) || anno%400==0)){
            giorni=29;
        }
        else if(mese==2)
            giorni=28;

        System.out.println(giorni);
    }
}
