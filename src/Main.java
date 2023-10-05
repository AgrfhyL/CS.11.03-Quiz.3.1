public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int num) {
        if (num >= 90) {
            return 'A';
        } else if (num>=80 && num<=89) {
            return 'B';
        } else if (num >= 70 && num <= 79) {
            return 'C';
        } else if (num >= 60 && num <= 69) {
            return 'D';
        } else if (num >= 50 && num <= 59) {
            return 'E';
        } else {
            return 'F';
        }
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num) {
        if (num % 3 == 0 || num % 5 == 0) {
            if (num % 3 == 0 && !(num % 5 == 0)) {
                return "fizz";
            } else if (!(num % 3 == 0) && num % 5 == 0) {
                return "buzz";
            } else {
                return "fizzbuzz";
            }
        } else {
            return "unlucky";
        }
    }
    // Question 3 - frontBack
    public static String frontBack(String str) {
        if (str.length() >= 2) {
            String firstTwo = str.substring(0, 2);
            return firstTwo + str + firstTwo;
        } else {
            return str;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) { // ab, ac, bc
        return (a+b == c || a+c == b || b+c == a);
    }

    // Question 5 - endUp
    public static String endUp(String str) {
        if (str.length() >= 3) {
            String lastThree = str.substring(str.length()-3, str.length()).toUpperCase();
            String front = str.substring(0, str.length()-3);
            return front + lastThree;
        } else {
            return str.toUpperCase();
        }
    }
}
