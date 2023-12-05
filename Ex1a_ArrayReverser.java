public class Ex1a_ArrayReverser {
    public static int[] reverse(int [] defaultArray,int lunghezza){
        int [] reverse = new int [5];
        for(int i=0;i<lunghezza;i++){
            reverse[i] = defaultArray[lunghezza-1-i];
        }
        return reverse;
    }
    public static void stampaArray(int [] defaultArray) {
        for(int var : defaultArray){
            System.out.print(var);
        }
        System.out.print("\n");
    }
    public static int[] giraArray(int [] defaultArray,int lunghezza) {
        int temp,start=0,end=lunghezza-1;
        while(start<end){
            temp=defaultArray[start];
            defaultArray[start]=defaultArray[end];
            defaultArray[end] = temp;
            start++;
            end--;
        }


        return defaultArray;
    }

    public static void main(String[] args){
        int [] dagirare = {1,2,3,4,5};
        int lunghezza = dagirare.length;
        int [] reverse1;
        int [] reverse2;
        reverse1 = reverse(dagirare,lunghezza);
        stampaArray(dagirare);
        reverse2 = giraArray(dagirare,lunghezza); //no me gusta
        stampaArray(reverse1);
        stampaArray(reverse2);
    }

}
