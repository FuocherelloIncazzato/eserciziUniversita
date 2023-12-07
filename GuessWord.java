import java.util.Arrays;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args){
        String guessWord = Metodi.getRandomString();
        char [] guessWordChar = Metodi.convertArrayChar(guessWord);
        Scanner myobj = new Scanner(System.in);
        char [] hideWord = new char [guessWordChar.length];
        int tentativi=0;
        Arrays.fill(hideWord, '-');
        do{
            tentativi++;
            System.out.println("Parola da indovinare: ");
            Metodi.printCharArray(hideWord);
            System.out.println("Inserisci una lettera per provare ad indovinare la parola: ");
            char lettera = myobj.next().charAt(0);
            hideWord = Metodi.checkLettera(lettera,hideWord,guessWordChar);
        }while(!Arrays.equals(hideWord,guessWordChar) && tentativi<21);
        if(Arrays.equals(hideWord,guessWordChar)){
            System.out.println("Parola indovinata!: "+guessWord);
        }
        else{
            System.out.println("Parola non indovinata! la parola era: "+guessWord);
        }

        //Metodi.printCharArray(hideWord);
    }
}
