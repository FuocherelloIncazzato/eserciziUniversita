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

    public static void stampaWorld(int [][] matrice){
        int [][] matriceEsterna = new int[22][22];
        for(int i =0 ;i<matriceEsterna.length;i++){
            for(int j = 0 ;j<matriceEsterna[i].length;j++){
                if(j==0 || i==0 || j==21 || i==21)
                    System.out.print('*');
                else{
                    if(matrice[i-1][j-1]==0)
                        System.out.print(' ');
                    if(matrice[i-1][j-1]==1)
                        System.out.print('X');
                    if(matrice[i-1][j-1]==2)
                        System.out.print('#');
                    if(matrice[i-1][j-1]==3)
                        System.out.print('O');
                }
            }
            System.out.print("\n");
        }
    }
    public static void aggiungiOstacolo(){
        if(world[estraiNumeroCasuale()][estraiNumeroCasuale()]==0){
            aggiungiOstacolo();
        }else
            world[estraiNumeroCasuale()][estraiNumeroCasuale()]=2;
    }
    public static int estraiNumeroCasuale(){
        return (int)(Math.random()*20);
    }
    public static char [] convertArrayChar(String word){
        char [] outputArray = new char[word.length()];
        for(int i = 0; i<word.length();i++){
            outputArray[i] = word.charAt(i);
        }
        return outputArray;
    }
    public static int aggiungiPosizioniRobot(char [] mosse){
        int riga=0,colonna=0;
        world[riga][colonna]=3;
        for(char var : mosse){
            if(var=='s') {
                if ((riga + 1) < 20 && world[riga + 1][colonna] == 0) {
                    riga++;
                    world[riga][colonna] = 3;
                } else if ((riga + 1) > 19)
                    return 3;
                else if (world[riga + 1][colonna] == 2)
                    return 2;
                else if (world[riga + 1][colonna] == 1)
                    return 1;
            }
            if(var=='n') {
                if ((riga - 1) >= 0 && world[riga - 1][colonna] == 0) {
                    riga--;
                    world[riga][colonna] = 3;
                } else if ((riga - 1) < 0)
                    return 3;
                else if (world[riga - 1][colonna] == 2)
                    return 2;
                else if (world[riga - 1][colonna] == 1)
                    return 1;
            }
            if(var=='e') {
                if ((colonna + 1) < 20 && world[riga][colonna + 1] == 0) {
                    colonna++;
                    world[riga][colonna] = 3;
                } else if ((colonna + 1) > 19)
                    return 3;
                else if (world[riga][colonna + 1] == 2)
                    return 2;
                else if (world[riga][colonna + 1] == 1)
                    return 1;
            }
            if(var=='o') {
                if ((colonna - 1) >= 0 && world[riga][colonna - 1] == 0) {
                    colonna--;
                    world[riga][colonna] = 3;
                } else if ((colonna - 1) < 0)
                    return 3;
                else if (world[riga][colonna - 1] == 2)
                    return 2;
                else if (world[riga][colonna - 1] == 1)
                    return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int righe,colonne;
        boolean checkAddedScope;
        if(args.length==3){
                righe = Integer.parseInt(args[0]);
                colonne = Integer.parseInt(args[1]);
                String mosse = args[2];
                char [] arrayCharMosse = convertArrayChar(mosse);
            //System.out.println("World Create:");
            //stampaMatrice(world);
            checkAddedScope = aggiungiObiettivo(righe-1,colonne-1);
            if(checkAddedScope) {
                //System.out.println("Scope added:");
                for(int i = 0 ;i<10;i++){
                    aggiungiOstacolo();
                }
                //System.out.println("Ostacoli aggiunti:");
                //stampaMatrice(world);
                int output = aggiungiPosizioniRobot(arrayCharMosse);
                //System.out.println("Percorso Robot:");
                //stampaMatrice(world);
                if(output==1){
                    System.out.println("Obbiettivo raggiunto!");
                }
                else if(output==2){
                    System.out.println("Hai preso un ostacolo!");
                }
                else if(output==3) {
                    System.out.println("sei uscito dal mondo!");
                }
                stampaWorld(world);
            }
            else
                System.out.println("Error Scope not added");
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
