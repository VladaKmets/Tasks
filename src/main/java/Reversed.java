public class Reversed {
    public static void main(String[] args) {
        String stringToReverse = "Never wanted to leave, never wanted to leave";
        reverseString(stringToReverse);
    }

    public static void reverseString(String string) {
        String stringToReverse = "Never wanted to leave, never wanted to leave";
        String[] subStr;
        String delimeter = " ";
        subStr = stringToReverse.split(delimeter);
        for (int i = subStr.length - 1; i >= 0; i--) {
            System.out.print(subStr[i]+delimeter);
        }

    }
}
