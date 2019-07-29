package leetcode;


//Input: num1 = "2", num2 = "3"
//Output: "6"
//Example 2:
//
//Input: num1 = "123", num2 = "456"
//Output: "56088"
//Note:
//
//The length of both num1 and num2 is < 110.
//Both num1 and num2 contain only digits 0-9.
//Both num1 and num2 do not contain any leading zero, except the number 0 itself.
//You must not use any built-in BigInteger library or convert the inputs to integer directly.
public class MultiplyStrings {

    public static void main(String[] args) {
        String num1 = "498828660196";
        String num2 = "840477629533";
        System.out.println(getNum(num1));
        System.out.println(getNum(num2));
        System.out.println(multiply(num1, num2));
    }
    public static String multiply(String num1, String num2) {
        long i = (getNum(num1) * getNum(num2));
        return i + "";
    }

    public static long getNum(String num){
        long result = 0;
        for(int i=0; i<num.length(); i++){
            char c = num.charAt(i);
            result += (long)((c-'0')*Math.pow(10, num.length() -1 - i));
        }

        return result;
    }
}
