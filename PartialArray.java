import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.util.Scanner;

public class PartialArray {
    public static int numeroElementi = MetodiArray.estraiNumeroCasuale();
    public static int [] defaultArray = MetodiArray.creaArray(numeroElementi);
    public static boolean aggiungiElemento(int newElement){
        if(numeroElementi-1<10) {
            boolean check = true;
            for (int var : defaultArray) {
                if (var == newElement) {
                    check = false;
                    System.out.println("Elemento già presente!");
                    break;
                }
            }
            if (check) {
                numeroElementi++;
                defaultArray[numeroElementi-1] = newElement;
                System.out.println("Elemento aggiunto");
            }
            return check;
        }
        else {
            System.out.println("numero elementi già maggiore o uguale a 10");
            return false;
        }
    }
    public static boolean rimuoviElemento(int elementToRemove){
        boolean check = false;
        int [] output = new int [100];
        int cont=0,numeroElementi2=numeroElementi;
        for (int i =0;i<numeroElementi;i++) {
            if(defaultArray[i]==elementToRemove){
                defaultArray[i]=0;
                numeroElementi2--;
            }
            if(defaultArray[i]!=0){
                output[cont]=defaultArray[i];
                cont++;
            }
        }
        defaultArray=output;
        numeroElementi=numeroElementi2;

        return check;
    }
    public static void main(String[] args){
        boolean outputAddElement,outputRemoveElement;
        int scelta;
        Scanner myobj = new Scanner(System.in);
        do {
            MetodiArray.stampaIntArray(defaultArray);
            System.out.println("numero elementi: "+numeroElementi);
            System.out.println("Inserisci un elemento nuovo all'array: ");
            int newElement = myobj.nextInt();
            outputAddElement = aggiungiElemento(newElement);
            System.out.println("Inserisci un elemento da rimuovere dall'array: ");
            int removeElement = myobj.nextInt();
            outputRemoveElement = rimuoviElemento(removeElement);
            MetodiArray.stampaIntArray(defaultArray);
            System.out.println("numero di elementi: " + numeroElementi);
            System.out.println("addElement: "+outputAddElement);
            System.out.println("removeElement: "+outputRemoveElement);
            System.out.println("inserisci 0 per continuare a togliere/aggiungere elementi, altrimenti inserisci qualsiasi altro numero per terminare il programma");
            scelta = myobj.nextInt();
        }while(scelta==0);
    }
}
