public class DataType {
    static void main() {

        long value1= 1325476899;
        int value2= (int) value1;
        System.out.println(value2);
        
        byte num1 = 33;
        System.out.println(num1);

        short num2 = 3333;
        System.out.println(num2);

        int num3 = 50000;
        long num4 = 329421370;
        System.out.println(num3);
        System.out.println(num4);


        // floating DTs
        float num5 = 3.142436f;
        System.out.println(num5);

        double num6 = 3.142435464777779;
        System.out.println(num6);

        // Other - Char, Boolean
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'a';
        System.out.println("My First Character is: "+ (char)(firstCharacter+2));

    }
}