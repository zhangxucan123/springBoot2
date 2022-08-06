package com.atguigu.boot05web01.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        test test = new test();
        String s = "abcd";
        test.reverseStr(s,2);
    }
    public String reverseStr(String s, int k) {
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            if ((i+1)%(2*k)==0){
                int start=(i+1)/2-k;
                int end=(i+1)/2-1;
                while (start<end){
                    char temp = s1[end];
                    s1[end] = s1[start];
                    s1[start] = temp;
                    end--;
                    start++;
                }
            }
            if(s1.length-i < k){
                int start=i;
                int end= s1.length-1;
                while (start<end){
                    char temp = s1[end];
                    s1[end] = s1[start];
                    s1[start] = temp;
                    end--;
                    start++;
                }
                break;
            }
            if (s1.length-i>=k && (s1.length-i<(2*k))){
                int start=i;
                int end= i+k-1;
                while (start<end){
                    char temp = s1[end];
                    s1[end] = s1[start];
                    s1[start] = temp;
                    end--;
                    start++;
                }
                break;
            }
        }
        return new String(s1);
    }
}
