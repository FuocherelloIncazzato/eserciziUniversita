public class CharRangeCheck {
    public static void main(String[] args)
    {
    //task a java code snippet that defines and initializes a char and then checks if the char is within the range 'A' to 'L'
    char daControllare = 'G';
    if((int)daControllare>(int)'A' && (int)daControllare<(int)'L'){
        System.out.println("il carattere " + daControllare + " è compreso tra A ed L");
    }
    else{
        System.out.println("il carattere " + daControllare + " non è compreso tra A ed L");
    }
    }
}
