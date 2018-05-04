package lab1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = Integer.parseInt(in.nextLine());

        System.out.print("Введите второе число: ");
        int second = Integer.parseInt(in.nextLine());

        System.out.print("Выберите операция: \n\n1:+\n2:-\n3:*\n4:/\n\n");

        int res = 0;
        boolean flag = false;

        do {
            System.out.print("Ваш выбор: ");
            res = Integer.parseInt(in.nextLine());

            switch (res) {
                case 1:
                    System.out.print("Вы выбрали плюс\n");
                    break;
                case 2:
                    System.out.print("Вы выбрали минус\n");
                    break;
                case 3:
                    System.out.print("Вы выбрали умножить\n");
                    break;
                case 4:
                    System.out.print("Вы выбрали разделить\n");
                    break;
                default:
                    if (flag == false) {
                        System.out.print("Такого действия не существует, возможно внедрим позже!\nВведите пжлст действие из списка.\n\n");
                        flag = true;
                    } else {
                        System.out.print("Не, ну ты совсем дурак?! Введи циферку из списка!!!\n\n");
                    }
            }
        } while (res > 4 || res == 0);

        Functions func = new Functions(first, second);

        if (res == 1)
            System.out.print("Ваш персональный результат = " + func.plus());
        else if (res == 2)
            System.out.print("Ваш персональный результат = " + func.minus());
        else if (res == 3)
            System.out.print("Ваш персональный результат = " + func.multiply());
        else if (res == 4)
            System.out.print("Ваш персональный результат = " + func.divide());
    }
}
