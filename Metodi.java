public class Metodi {
    public static int getRandomNumber(int lunghezzaArray){
        int x;
        do{
            x = (int)(Math.random()*lunghezzaArray);
        }while(x==0);
        return x;
    }
    public static String getRandomString(){
        String [] stringArray = {"ciaone","strunz","scemoscemo","trottola","rafa","subarubaracca"};
        int index = getRandomNumber(stringArray.length);
    return stringArray[index];
    }
    public static char [] convertArrayChar(String word){
        char [] outputArray = new char[word.length()];
        for(int i = 0; i<word.length();i++){
            outputArray[i] = word.charAt(i);
        }
        return outputArray;
    }
    public static void printCharArray(char [] defaultArray) {
        for(char var : defaultArray){
                System.out.print(var);
        }
        System.out.print("\n");
    }
    public static char [] checkLettera(char lettera,char [] hideWord, char [] guessWord){
        boolean check=false;
        for(int i=0;i<hideWord.length;i++){
            if(hideWord[i]==lettera)
                System.out.println("Lettera già presente sei deficiente?");
            else {
                if (guessWord[i] == lettera) {
                    hideWord[i] = guessWord[i];
                    check=true;
                }
            }
        }
    if(!check)
        System.out.println("Lettera non trovata!");

        return hideWord;
    }
}
