package HomeWork1;

public class MassiveIsPalindrome {
    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 5, 56, 5, 3, 4};
        if (isPalindrome(array) == true) {
            System.out.println("This massive IS the palindrome ");
        } else {
            System.out.println("This massive IS NOT the palindrome ");
        }
    }

    public static boolean isPalindrome(int[] arrayToCheck) {
        for (int elFromStart = 0; elFromStart < arrayToCheck.length / 2; elFromStart++) {
            if (arrayToCheck[elFromStart] != arrayToCheck[arrayToCheck.length - 1 - elFromStart]) {
                return false;
            }
        }
        return true;
    }
}
