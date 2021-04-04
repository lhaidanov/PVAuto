package HomeWork1;

public class LineIsPalindrome {
    public static void main(String[] args) {
        String line = "aV 5 n1  s 1N5   va";
        line= line.replaceAll("\\s+","");
        line=line.toUpperCase();
        char[] lineToArray = line.toCharArray();
        if (isPalindrome1(lineToArray)) {
            System.out.println("Line \"" + line +"\" IS the palindrome ");
        } else {
            System.out.println("Line \"" + line + "\" IS NOT the palindrome ");
        }
    }

    public static boolean isPalindrome1(char[] arrayToCheck) {
        for (int elFromStart = 0; elFromStart < arrayToCheck.length / 2; elFromStart++) {
            if (arrayToCheck[elFromStart] != arrayToCheck[arrayToCheck.length - 1 - elFromStart]) {
                return false;
            }
        }
        return true;
    }
}
