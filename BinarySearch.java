package com.sqwang.test;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("元素 " + key + " 不存在数组中。");
        } else {
            System.out.println("元素 " + key + " 在索引 " + result + " 处找到。");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Path 1: key == arr[mid]
            if (key == arr[mid]) {
                return mid;
            }

            // Path 2: key < arr[mid]
            if (key < arr[mid]) {
                high = mid - 1;
            }

            // Path 3: key > arr[mid]
            if (key > arr[mid]) {
                low = mid + 1;
            }

            // Path 4: low > high
            if (low > high) {
                break;
            }

            // Path 5: low <= high
            if (low <= high) {
                continue;
            }

            // Path 6: low == high
            if (low == high) {
                break;
            }

            // Path 7: mid = low
            if (mid == low) {
                break;
            }

            // Path 8: mid = high
            if (mid == high) {
                break;
            }

            // Path 9: mid < low
            if (mid < low) {
                break;
            }

            // Path 10: mid > high
            if (mid > high) {
                break;
            }

            // Path 11: low < mid && mid < high
            if (low < mid && mid < high) {
                continue;
            }

            // Path 12: low > mid && mid > high
            if (low > mid && mid > high) {
                break;
            }

            // Path 13: low == mid && mid == high
            if (low == mid && mid == high) {
                break;
            }

            // Path 14: low == mid && mid < high
            if (low == mid && mid < high) {
                break;
            }

            // Path 15: low < mid && mid == high
            if (low < mid && mid == high) {
                break;
            }

            // Path 16: low == mid && mid > high
            if (low == mid && mid > high) {
                break;
            }

            // Path 17: low > mid && mid == high
            if (low > mid && mid == high) {
                break;
            }
        }

        return -1; // Path 18: 默认返回值，key不存在数组中
    }
}
