package com.sqwang.test;
import java.util.Scanner;

public class LeapYearJudgment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个年份：");
        int year = scanner.nextInt();
        scanner.close();

        if (year <= 0) {
            System.out.println("请输入一个大于0的年份。");
            return; // Unreachable path (year <= 0)
        }

        if (year % 400 == 0) {
            System.out.println(year + " 是闰年。");
        } else if (year % 100 == 0) {
            System.out.println(year + " 不是闰年。");
        } else if (year % 4 == 0) {
            System.out.println(year + " 是闰年。");
        } else {
            System.out.println(year + " 不是闰年。");
        }
    }
}
