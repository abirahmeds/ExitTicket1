package com.company;

public class Main {

    public boolean haveThree(int[] nums) {
        int num3 = 0;
        int arr[] = nums;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0)
                num3++;
            if (arr[i+1] == 3 && arr[i+2] == 3)
                return false;
            if (num3 == 3)
                return true;
        }
        return false;
    }
}
