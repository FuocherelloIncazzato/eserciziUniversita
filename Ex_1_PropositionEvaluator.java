public class Ex_1_PropositionEvaluator {
    public static boolean implica(boolean A, boolean B){
        Boolean output;
        if(A && !B){
            output=false;
        }
        else
            output=true;

        return output;
    }
    public static void main(String[] args){
        //se A vera e B falsa = falsa nel resto dei casi è vero
        Boolean A=false,B=false;
        Boolean output=implica(A,B);
        System.out.println(output);
    }
}
