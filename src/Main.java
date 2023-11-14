public class Main {
    public static void main(String[] args) {

        System.out.println("-----------Palindrom Sayıyı Bulma----------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("-----------Mükemmel Sayıları Bulma--------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5);
        System.out.println(isPerfectNumber(-1));
        System.out.println("--------Sayıları Kelimelere Dök--------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number){
               return true;
    }

    public static boolean isPerfectNumber(int number){
        int sum = 1;

        if(number < 0){
            return false;
        }

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }

        if(sum == number){
            return true;
        }
        return false;

    }

    public static String numberToWords(int number){
        if(number < 0){
            return "Invalid Value";
        }else{

        }
    }
}