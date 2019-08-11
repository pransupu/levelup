public class Palindrome
{

    public static boolean method1(String str) {
        return new StringBuffer(str).reverse().toString().equals(str);
    }

    public static boolean method2(String str) {
        int l = str.length();
        for (int i=0; i<l/2; i++) {
            if (str.charAt(i) != str.charAt(l-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println("METHOD-1: String "+str+" is"+(method1(str) ? "" : " not")+" a palindrome");
        System.out.println("METHOD-2: String "+str+" is"+(method2(str) ? "" : " not")+" a palindrome");
    }
}