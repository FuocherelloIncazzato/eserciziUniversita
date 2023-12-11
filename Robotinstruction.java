public class Robotinstruction {
    public static int [][] world = createWorld();
    public static boolean aggiungiObiettivo(int righe, int colonne){
        if(righe <=20 && colonne<=20 && righe>=0 && colonne>=0) {
            if (world[righe][colonne] == 0) {
                world[righe][colonne] = 1;
            }
            return true;
        }
        else {
            return false;
        }
    }
    public static void stampaMatrice(int [][] matrice){
        for (int array[] : matrice){
            for (int var : array){
                System.out.print(var+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        int righe,colonne;
        if(args.length==3){
                righe = (args[0].charAt(0));
                colonne = (args[1].charAt(0));
                System.out.println(righe);
            System.out.println(colonne);
                String mosse = args[2];
            System.out.println("World Create:");
            stampaMatrice(world);
            aggiungiObiettivo(righe-1,colonne-1);
            System.out.println("Scope added:");
            stampaMatrice(world);

        }
        else {
            System.out.println("zio devi inserire 3 parametri");
            System.exit(0);
        }

    }
    public static int [][] createWorld(){
        return new int[20][20];
    }
}
