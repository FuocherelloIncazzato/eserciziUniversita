import java.util.Scanner;
public class TestScanner {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int prova= myobj.nextInt();
        String prova1= myobj.next();
        System.out.println(prova+"-"+prova1);
    }
}
