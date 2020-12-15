public class Exercise {


    /*static String name ="Utsav";
    static char[] charName = name.toCharArray();*/

    public static String reverseName(String name) { //2

        char[] charName = name.toCharArray(); // string break
        String reverseString = "";              //
        int j = name.toCharArray().length - 1;

        for (int i = j; i >= 0; i--) {
            reverseString = reverseString + charName[i];
            System.out.println(reverseString);
        }

        System.out.println("Final Reverse = " + reverseString);

        return reverseString;
    }
    public static void main(String[] args){

        /*System.out.println(name);
        System.out.println(charName);
        System.out.println(name.length());
        System.out.println(charName.length);
        System.out.println("jaya".toCharArray());*/
        System.out.println(Exercise.reverseName("Zebra")); //1
    }
}
