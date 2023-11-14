import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------Palindrom Sayıyı Bulma----------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("-----------Mükemmel Sayıları Bulma--------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("--------Sayıları Kelimelere Dök--------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number){

        if(number < 0 ) {
            number = abs(number);
        }
        
        int originalNum = number;
        int reversed = 0;

        while (number != 0){
            int digit = number %10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return originalNum == reversed;

    }

    public static boolean isPerfectNumber(int number){

        if(number <= 0){
            return false;
        }
        
        int sum = 1;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }

        return sum == number;

    }

    public static String numberToWords(int number){

        if(number < 0){
            return "Invalid Value";
        }

        String[] digits = new String[] {"Zero", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine" };

        String result = "";

        for (char digit : String.valueOf(number).toCharArray()) {
            int digitValue = Character.getNumericValue(digit);
            result += digits[digitValue] + " ";
        }

        return result.trim();

    }
}