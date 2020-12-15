public class Exercise {

    public static String reverseName(String name) { //2

        char[] charName = name.toCharArray(); // string break
        String reverseString = "";              //
        int j = name.toCharArray().length - 1;

        for (int i = j; i >= 0; i--) {
            reverseString = reverseString + charName[i];
            System.out.println(reverseString);
        }

        return reverseString;
    }
    public static void main(String[] args){

        System.out.println(Exercise.reverseName("Zebra")); //1
    }
}
