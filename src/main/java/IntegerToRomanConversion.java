/*

Given an integer, convert it to a roman numeral, and return a string corresponding to its roman numeral version

Input is guaranteed to be within the range from 1 to 3999.

Example :

Input : 5
Return : "V"

Input : 14
Return : "XIV"

 */

package main.java;

public class IntegerToRomanConversion {

    public static void main(String[] args){
        System.out.println(intToRoman(28));
    }

    private static final String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String intToRoman(int value) {
        if (value > 3999 || value < 1)
            return "";

        StringBuilder sb = new StringBuilder();
        int i=0;
        while (value > 0) {
            if (value - values[i] >= 0){
                sb.append(numerals[i]);
                value -= values[i];
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
