package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/15/16.
 */
public class FirstNonRepeatingCharacter {
    static char getFirstNonRepeating(String str){
        int[] countArr=new int[255];
        for (int i = 0; i <countArr.length ; i++) {
            countArr[i]=-1;
        }
        for (int i = 0; i <str.length() ; i++) {
            if(countArr[str.charAt(i)]==-1)
                countArr[str.charAt(i)]=i;
            else
                countArr[str.charAt(i)]=-2;
        }
        int minIndex=str.length();
        for (int i = 0; i < countArr.length; i++) {
            if(countArr[i]>0 && countArr[i]<minIndex)
                minIndex=countArr[i];
        }
        if(minIndex>0 || minIndex<=str.length())
        return str.charAt(minIndex);
        else
            return ' ';
    }
    public static void main(String[] args) {
        String str = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
        System.out.println(getFirstNonRepeating(str));
    }
}
