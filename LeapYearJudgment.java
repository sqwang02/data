package com.sqwang.test;
import java.util.Scanner;

public class LeapYearJudgment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������һ����ݣ�");
        int year = scanner.nextInt();
        scanner.close();

        if (year <= 0) {
            System.out.println("������һ������0����ݡ�");
            return; // Unreachable path (year <= 0)
        }

        if (year % 400 == 0) {
            System.out.println(year + " �����ꡣ");
        } else if (year % 100 == 0) {
            System.out.println(year + " �������ꡣ");
        } else if (year % 4 == 0) {
            System.out.println(year + " �����ꡣ");
        } else {
            System.out.println(year + " �������ꡣ");
        }
    }
}
