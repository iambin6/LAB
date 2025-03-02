package Week5.bai3;

import java.math.BigInteger;


public class LargeNumber {
    public static void main(String[] args) {
//        BigInteger num1 = new BigInteger("74329423798");
//        BigInteger num2 = new BigInteger("83734892434");
//        BigInteger sum =  num1.add(num2);
//        System.out.println("Sum" + sum.toString());    

    Number n1 = new Number("6544");
    Number n2 = new Number("78");
    Number sum  = n1.MutiplyTwoNum(n2);
        System.out.println("SUM "+ sum.getValue());
    }
}