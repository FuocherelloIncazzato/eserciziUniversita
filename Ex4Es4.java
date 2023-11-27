//Scrivere un programma Java che legga da tastiera un intero positivo,rappresentante la capacità in kg di uno zaino, e riceva una sequenza di interi positivi rappresentanti i pesi degli oggetti da inserirvi, fino a che la somma dei pesi non eccede la capacità oppure viene letto da tastiera uno 0. Al termine il programma deve stampare a video la capacità dello zaino, il numero e il peso totale degli oggetti in esso contenuti, il peso dell’oggetto più pesante, il peso dell’oggetto più leggero, e il peso medio degli oggetti presenti nello zaino.
import java.util.Scanner;
public class Ex4Es4 {
    public static void  main(String[] args){
        Scanner myobj=new Scanner(System.in);
        System.out.println("Inserisci un numero intero positivo(kg capacità zaino): ");
        int kgZaino = myobj.nextInt();
        int kgOggetti = 0,cont = 0,maxInsert=0,minInsert=0;
        do{
            System.out.println("Inserisci il peso in kg di un oggetto che sta dentro lo zaino: ");
            int insertKg = myobj.nextInt();
            if(cont==0){
                minInsert=insertKg;
                maxInsert=insertKg;
            }else {
                if (minInsert > insertKg) {
                    minInsert = insertKg;
                }
                if (maxInsert < insertKg) {
                    maxInsert = insertKg;
                }
            }
            cont++;
            kgOggetti = kgOggetti + insertKg;
            if(insertKg==0){
                System.exit(0);
            }
        }while(kgOggetti<kgZaino);
        System.out.println("capactià dello zaino: "+kgZaino);
        System.out.println("totale oggetti: "+cont);
        System.out.println("peso totale degli oggetti: "+kgOggetti);
        System.out.println("Peso Minore: "+minInsert);
        System.out.println("Peso Maggiore"+maxInsert);
        System.out.println("Peso medio"+(float)kgOggetti/(float)cont);
    }
}
