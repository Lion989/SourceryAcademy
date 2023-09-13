package com.company;

public class Main {

    static void printBonusDatesBetween(int fromYear, int toYear) {


        for (int i = fromYear; i <= toYear; i++) {
            int number = i, reverse = 0;
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;

            }
            int day = reverse % 100;
            int month = reverse / 100;

            if (month <= 12) {
                switch (month) {
                    case 1:
                        if (day <= 31) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 2:
                        if (day <= 28) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 3:
                        if (day <= 31) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 4:
                        if (day <= 30) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 5:
                        if (day <= 31) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 6:
                        if (day <= 30) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 7:
                        if (day <= 31) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 8:
                        if (day <= 31) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 9:
                        if (day <= 30) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 10:
                        if (day <= 31) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 11:
                        if (day <= 30) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                    case 12:
                        if (day <= 31) {
                            System.out.println(i + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
                        }
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        printBonusDatesBetween(2000, 2015);

    }
}