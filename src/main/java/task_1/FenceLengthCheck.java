package task_1;

import java.util.Scanner;
public class FenceLengthCheck {
    public static int totalLength() {
        int letterLength = (15 / 3) * 62;
        int gapLength = 12 * 3;
        return letterLength + gapLength;
    }
    public static void fenceLength(int length) {
        if(totalLength() <= length ) {
            System.out.println(length + " - Данной длины забора хватит для написания текста");
        } else if (length < 0 || length == 0) {
            System.out.println("Длина забора может быть только положительной !!!");
        } else  {
            System.out.println(length + " - Данной длины забора не хватит для написания текста");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите дилну забора = ");
        int num = scanner.nextInt();
        fenceLength(num);
    }

}
