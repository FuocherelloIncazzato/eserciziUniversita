public class Estrai {
    public static int estraiNumeroCasuale(){
        int x;
        do{
            x = (int)(Math.random()*101);
        }while(x==0);
        return x;
    }
    public static int confrontaNumeri(int inserito, int generato){
        if(inserito<generato){
            System.out.println("Il numero "+inserito+" e’ piu’ piccolo di quello da indovinare. ");
            return -1;
        }
        else if(inserito>generato){
            System.out.println("Il numero "+inserito+" e’ piu’ grande di quello da indovinare. ");
            return 1;
        }
        else{
            System.out.println("Numero indovinato!");
            return 0;
        }


    }
    public static void checkStupido(int inserito, int [] inseriti){
        for(int i=0;i<inseriti.length;i++){
            if(inseriti[i]<inserito){

            }
        }
    }


}
