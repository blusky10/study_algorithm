package leetcode;


import java.util.Stack;

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
//        String num1 = "498828660196";
//        String num2 = "840477629533";

        String num1 = "123";
        String num2 = "456";

        MultiplyStrings multiplyStrings = new MultiplyStrings();
        System.out.println(multiplyStrings.multiply(num1, num2));
    }

    static int[] data = new int[1000];

    public String multiply(String num1, String num2) {
        if (num1.length() < num2.length()){
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for(int i=num2.length()-1; i>=0; i--){
            int n = num2.charAt(i) - '0';
            int s = num2.length()-i -1;
            getNum(num1, n, s);
        }

        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int i=data.length-1; i>=0; i--){
            if (start !=0){
                sb.append(data[i]);
            }

            if (data[i] != 0 && start == 0){
                sb.append(data[i]);
                start++;
            }
        }

        return sb.toString();
    }

    public static void getNum(String num, int n, int s){
        int over = 0;
        int index = s;

        for(int i=num.length()-1; i>=0; i--){
            char c = num.charAt(i);
            int a = (c-'0')*n + over + data[index];
            int b = a % 10;

            if (a >= 10){
                over = a / 10;
            }else{
                over = 0;
            }
            data[index] = b;
            index++;

        }

        if (over != 0){
            data[index] +=over;
            index++;
        }
    }
}
