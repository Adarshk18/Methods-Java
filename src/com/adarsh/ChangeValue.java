package com.adarsh;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {2,3,1,7};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Change(int[] nums){
        nums[0] = 99;
    }
}
