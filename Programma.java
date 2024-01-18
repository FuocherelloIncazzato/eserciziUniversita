public class Programma {
    public static void main(String[] args){
        int [] interi = new int [5];
        int [] copiaInteri = new int [5];
        int n = Integer.parseInt(args[5]);
        for(int i = 0; i<5; i++){
            interi[i]=Integer.parseInt(args[i]);
            copiaInteri[i]=Integer.parseInt(args[i]);
        }
        copiaInteri = Metodi1.modificaArray(copiaInteri,n);
        //checko i due array
        Metodi1.stampaIntArray(interi);
        Metodi1.stampaIntArray(copiaInteri);
        int check = Metodi1.valutaDifferenzeArray(interi,copiaInteri);
        System.out.println("check: "+check);
    }
}
