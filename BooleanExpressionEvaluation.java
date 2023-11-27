public class BooleanExpressionEvaluation {
    public static void main(String[] args) {
         boolean a = 5 < 9 | 6 >= 19 / 3 & 7 % 6 == 2;
         boolean b = (5 <9 | 6 >= 19 /3) && (7 % 6 ==2);
         boolean c = 6 >= 19 /3 & 5 < 9 || 7 % 6 == 2;
         System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }
}
