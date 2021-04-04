//
//
//package HomeWork1;
//
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class BasicCalculator {
//    public static void main(String[] args) {
//        String s, num1, num2;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first number:");
//
//        /* We are using data.txt type double so that user
//         * can enter integer as well as floating point
//         * value
//         */
//
//        s = "2011 -10-20 525 14:28:55 10";
//        Pattern p = Pattern.compile("(^|\\s)([0-9]+)($|\\s)");
//        Matcher m = p.matcher(s);
//        if (m.find()) {
//            System.out.println(m.group(2));
//        }
//
//        num1 = s;
//
//        System.out.print("Enter an operator (+, -, *, /): ");
//        char operator = scanner.next().charAt(0);
//
//        scanner.close();
//        double output;
//
//        switch (operator) {
//            case '+':
//                output = num1 + num2;
//                break;
//
//            case '-':
//                output = num1 - num2;
//                break;
//
//            case '*':
//                output = num1 * num2;
//                break;
//
//            case '/':
//                output = num1 / num2;
//                break;
//
//            /* If user enters any other operator or char apart from
//             * +, -, * and /, then display an error message to user
//             *
//             */
//
//
//            default:
//                System.out.printf("You have entered wrong operator");
//                return;
//        }
//
//        System.out.println(num1 + " " + operator + " " + num2 + ": " + output);
//
//    }
//    /*
//
//}
