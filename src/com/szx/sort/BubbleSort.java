package com.szx.sort;

/**
 * @author szx
 * @description TODO 冒泡排序
 * @date 2021/11/15  22:04
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            boolean flag=false;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    flag=true;
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            if(!flag){
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{6,2,8,1,7,9,0,3,5,4};
        for (int i : bubbleSort(nums)) {
            System.out.print(i+"\t");
        }
    }
}
