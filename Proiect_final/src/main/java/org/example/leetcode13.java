package org.example;

import java.util.HashMap;

public class leetcode13 {

    public static int romanToInt(String s) {
        int a=0;
        HashMap<String, Integer> numere = new HashMap<String, Integer>();
        numere.put("I", 1);
        numere.put("IV", 4);
        numere.put("V", 5);
        numere.put("IX", 9);
        numere.put("X", 10);
        numere.put("XL", 40);
        numere.put("L", 50);
        numere.put("XC", 90);
        numere.put("C", 100);
        numere.put("CD", 400);
        numere.put("D", 500);
        numere.put("CM", 900);
        numere.put("M", 1000);
        for(int i=0;i<s.length()-1;i++){
            String s1="";
            s1=s1+s.charAt(i);
            String s2="";
            s2=s2+s.charAt(i+1);
            if(numere.get(s1)< numere.get(s2)){
                a=a+numere.get(s1+s2);
                i++;
            } else {
                a=a+numere.get(s1);
            }
        }
        if(s.length()>1){
            String s3="";
            int b=s.length()-1;
            s3=s3+s.charAt(b);
            String s4="";
            s4=s4 + s.charAt(b-1);
            if(numere.get(s3)<=numere.get(s4)){
                a=a+numere.get(s3);
            }
        } else{
            String s3="";
            s3=s3+s.charAt(0);
            a=a+numere.get(s3);
        }

        return a;
    }
}
