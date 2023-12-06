import java.util.Scanner;

public class TrasposizioneMatrice {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("quante righe deve avere la matrice generata?");
        int righe = myobj.nextInt();
        System.out.println("quante colonne deve avere la matrice generata?");
        int colonne = myobj.nextInt();
        int [] [] matrice = generaMatriceCasuale(righe,colonne);
        stampaMatrice(matrice);
        int [] [] matriceReverse = new int[colonne][righe];
        matriceReverse = trasponiMatrice(matrice,matriceReverse);
        System.out.print("\n");
        stampaMatrice(matriceReverse);
    }
    public static int [] [] generaMatriceCasuale(int righe,int colonne){
        int [] [] matrice = new int[righe][colonne];
        for(int i=0;i<righe;i++){
            for(int j=0;j<colonne;j++){
                matrice[i][j] = estraiNumeroIntCasuale();
            }
        }
        return matrice;
    }
    public static int estraiNumeroIntCasuale(){
        int x;
        do{
            x = (int)(Math.random()*100);
        }while(x<0);
        return x;
    }
    public static void stampaMatrice(int [][] matrice){
        for (int array[] : matrice){
            for (int var : array){
                System.out.print(var+" ");
            }
            System.out.print("\n");
        }
    }
    public static int [] [] trasponiMatrice(int [][] oldMatrice,int [][] revereMatrice){
        for(int i=0;i<revereMatrice.length;i++){
            for(int j=0;j<revereMatrice[i].length;j++){
                revereMatrice[i][j] = oldMatrice[j][i] ;
            }
        }
        return revereMatrice;
    }
}
