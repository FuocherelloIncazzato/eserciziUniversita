public class IntegerDistributionCalculator {
    public static int estraiNumeroCasuale(){
        int x;
        do{
            x = (int)(Math.random()*11);
        }while(x==0);
        return x;
    }
    public static void main(String[] args){
        int generato = estraiNumeroCasuale();
        int [] defaultArray = new int[10];
    }
}
