package task1;

import java.util.Scanner;

public class Main {
    private final char[] digits = {'0', '1', '2',
            '3', '4', '5', '6', '7', '8', '9'};

    public void strDigitsSum(String str) {
        char[] strArray = str.toCharArray();
        int sum = 0;

        for (int i = 0; i < strArray.length; ++i) {
            for (int j = 0; j < digits.length; ++j) {
                if (strArray[i] == digits[j]) {
                    sum = sum + (strArray[i] - '0');
                }
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        Main obj = new Main();
        obj.strDigitsSum(str);
    }
}
