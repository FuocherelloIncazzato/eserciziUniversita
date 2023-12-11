public class Ventilatori {
    public static void main(String[] args){
        Boolean x1=false,y1=false,presenza1=true,abilitazione1=true;
        Boolean x2=false,y2=false,presenza2=true,abilitazione2=true;
        Boolean x3=true,y3=false,presenza3=true,abilitazione3=true;
        Boolean x4=false,y4=false,presenza4=false,abilitazione4=false;
        Boolean output1=false,output2=false,output3=false,output4=false;

        if(presenza1 && abilitazione1){
            if(x1 && y1){
                output1=true;
                System.out.println("1)variabili uguali");
            }
            else{
                System.out.println("1)variabili non uguali");
                output1=false;
            }
        }else {
            output1=true;
            System.out.println("1)non ho controllato le variabili");
        }

        if(presenza2 && abilitazione2){
            if(x2 && y2){
                output2=true;
                System.out.println("2)variabili uguali");
            }
            else{
                output2=false;
                System.out.println("2)variabili non uguali");
            }
        }else {
            output2=true;
            System.out.println("2)non ho controllato le variabili");
        }


        if(presenza3 && abilitazione3){
            if(x3 && y3){
                output3=true;
                System.out.println("3)variabili uguali");
            }
            else{
                output3=false;
                System.out.println("3)variabili non uguali");
            }
        }else {
            output3=true;
            System.out.println("3)non ho controllato le variabili");
        }

        if(presenza4 && abilitazione4){
            if(x4 && y4){
                output4=true;
                System.out.println("4)variabili uguali");
            }
            else{
                output4=false;
                System.out.println("4)variabili uguali");
            }
        }else {
            output4=true;
            System.out.println("4)non ho controllato le variabili");
        }



        if(output1 && output2 && output3 && output4){
            System.out.println("Tutti veri");
        }else{
            if(!output1){
                System.out.println("il problema è il primo ventilatore");
            }
            if(!output2){
                System.out.println("il problema è il secondo ventilatore");
            }
            if(!output3){
                System.out.println("il problema è il terzo ventilatore");
            }
            if(!output4){
                System.out.println("il problema è il quarto ventilatore");
            }
        }

    }
}
