package com.interview.controller;

import java.util.Scanner;

public class Subject {

    public static void main(String[] args) {
        int apple = 8;
        int strawberry = 13;

        int applePrice = 0;
        int strawberryPrice = 0;


        while (true) {
            System.out.println("请问需要购买什么: 1:苹果, 2:草莓, 3:不购物");
            Scanner scanner = new Scanner(System.in);
            int kind = scanner.nextInt();
            switch (kind) {
//            买苹果
                case 1:
                    System.out.println("正在选择的是苹果,请问需要购买多少kg");
                    int appleKg = scanner.nextInt();

                    System.out.println("苹果价格8.00/kg,您选择了" + appleKg + "千克");

                    System.out.println("==============================================");
                    System.out.println("请问还需要购买别的水果吗? 1:需要 2:不需要并结算");
                    int i = scanner.nextInt();
                    if (i == 2) {
                        applePrice = applePrice + appleKg * apple;
                        int 价格 = applePrice + strawberryPrice;
                        System.out.println("共需要支付" + 价格 + "元");
                        applePrice = 0;
                        strawberryPrice = 0;
                        break;
                    } else {
                        applePrice = applePrice + appleKg * apple;
                        break;
                    }
//              买草莓
                case 2:
                    System.out.println("当前选择的是草莓,请问需要购买多少kg");
                    int strawberryKg = scanner.nextInt();

                    System.out.println("草莓价格13.00/kg,您选择了" + strawberryKg + "千克");
                    System.out.println("==============================================");
                    System.out.println("请问还需要购买别的水果吗? 1:需要 2:不需要并结算");
                    int i2 = scanner.nextInt();
                    if (i2 == 2) {
                        strawberryPrice = strawberryPrice + strawberryKg * strawberry;

                        int 价格 = applePrice + strawberryPrice;
                        System.out.println("共需要支付" + 价格 + "元");
                        applePrice = 0;
                        strawberryPrice = 0;
                        break;
                    } else {
                        strawberryPrice = strawberryPrice + strawberryKg * strawberry;
                        break;
                    }

                case 3:
                    System.out.println("当前选择不进行购物");
//                    break;
                    return;

                default:
                    System.out.println("啥也不需要");
                    break;
            }
        }
    }
}
