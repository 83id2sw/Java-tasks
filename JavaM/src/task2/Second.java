package task2;

import java.util.Scanner;

public class Second {

    public void numMultiplier(double num, int m) {
        if (num == 1) {
            System.out.println(num);
        } else if (num != (int)num) {
            System.out.println("Error!");
            return;
        }

        while (num > 1) {
            if (num % m == 0) {
                System.out.println(m);
                num = num / m;
            } else {
                m++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        in.close();

        int multiplier = 2;
        Second obj = new Second();
        obj.numMultiplier(num, multiplier);
    }
}
