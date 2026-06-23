public class String2 {
    public static void main(String[] args) {
        String str = "Nirbhay";
        String str1 = "NirbhaY";

        // Case 1
        if(str == str1){
            System.out.println("String are Equal");
        }
        else{
            System.out.println("String are not Equal");
        }

        // Case 2
        if(str.equals(str1)){
            System.out.println("String are Equal");
        }
        else{
            System.out.println("String are not Equal");
        }

        // Case 3
        if(str.equalsIgnoreCase(str1)){
            System.out.println("String are Equal");
        }
        else{
            System.out.println("String are not Equal");
        }
    }
}
