package com.company;

import java.util.Scanner;

public class Main {
    public static int findNumInArray(int number, int[] array) {
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index_del = i;
            }
        }
        return index_del;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] arr= {10,4,6,7,8,6,0,0,0,0};
        System.out.println("Nhập phần tử cần xóa: ");
        int num= scanner.nextInt();
        int number= findNumInArray(num,arr);
        System.out.println(number);
        if( number== -1){
            System.out.println(number+ " không nằm trong mảng");
        }else{
            for(int i= number;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
        }
        for(int j=0; j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }
}
