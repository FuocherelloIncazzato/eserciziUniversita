public class Metodi1 {
    public static int[] modificaArray(int [] par, int a){
        int prod=1,sum=0;
        //stampaIntArray(par);
        for(int var : par){
            prod=prod*var;
            sum=sum+var;
        }
        if((prod+sum)>a && a>(prod-sum)){
            for(int i = 0; i<par.length; i++){
                if(par[i]>a)
                    par[i]=(prod+sum);
            }
        }else{
            for(int i = 0; i<par.length; i++){
                if(par[i]<a)
                    par[i]=(prod-sum);
            }
        }
        System.out.println(prod);
        System.out.println(sum);
        return par;
    }
    public static int valutaDifferenzeArray(int [] par1 , int [] par2){
        if(par1.length==par2.length){
            for(int i = 0;i<par1.length;i++){
                if(par1[i]!=par2[i])
                    return 0;
            }
            return 1;
        }
        else
            return -1;
    }
    public static void stampaIntArray(int [] defaultArray) {
        for(int var : defaultArray){
                System.out.print(var+"-");
        }
        System.out.print("\n");
    }
}
