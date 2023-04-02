import java.util.*;
public class ArlanHelper {
    public String drawQuad(int n) {
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        return new String();
    }

    public String drawRect(int width, int height, char c) {
        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                System.out.print(c);
                j++;
            }
            System.out.println();
            i++;
        }
        return new String();
    }

    public String drawLine(int length) {
        String line = "";
        boolean flag = true;
        while (length > 0) {
            line += flag ? "*" : "#";
            flag = !flag;
            length--;
        }
        return line;
    }

    public String drawPattern(char[] pattern, int repeatCount) {

        while (repeatCount > 0) {
            repeatCount--;
            System.out.print(pattern);
        }
        return "";
    }

    public String drawTriangle(int side){
        String line = "";
//        int i=1;
        while(side>0){
            int j=0;
            while(j<side){
                System.out.print("*");
                j++;
            }System.out.println();
            side--;
        }return "";
    }
    public int sumQuads(int n){
        int count=0;
        while(n>0){
            count+=n*n;
            n--;
        }return count;
    }
    public int countSumOfDigits(int number){
        String a = Integer.toString(number);
        int i=0;
        char k = a.charAt(i);
        int sum = 0;
        while(i<a.length()){
            k=a.charAt(i);
            sum+=Integer.parseInt(String.valueOf(k));
            i++;
        }return sum;
    }
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        System.out.println(helper.countSumOfDigits(547));
    }
}