import java.util.Scanner;

public class FibonaChicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(howManyChicken(num));
    }

    static int howManyChicken(int num) {
        if (num < 1) {
            return 0;
        } else if (num == 1) {
            return 1;
        }

        int f1 = 0;
        int f2 = 1;
        int f3 = 1;

        while (f3 < num) {
            f1 = f2;
            f2 = f3;
            f3 = f3 + f1;
        }

        return f1 + Math.round((float) (f2 - f1) * (num - f2) / (f3 - f2));
    }
}