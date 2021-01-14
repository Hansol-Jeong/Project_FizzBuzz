import java.util.Arrays;

public class FibonaChicken {
    public static void main(String[] args) {
        System.out.println(howManyChicken(9));
    }

    static int howManyChicken(int num) {
        int[] fibonazzi = new int[num + 1];

        fibonazzi[0] = 0;
        fibonazzi[1] = 1;
        fibonazzi[2] = 1;

        int big = 0;
        int mid = 0;
        int small = 0;

        for (int i = 3; i < fibonazzi.length; i++) {
            fibonazzi[i] = fibonazzi[i - 2] + fibonazzi[i - 1];
            if (fibonazzi[i] == num) {
                System.out.println(Arrays.toString(fibonazzi));
                return fibonazzi[i - 1];
            } else if (fibonazzi[i] > num) {
                big = fibonazzi[i];
                mid = fibonazzi[i - 1];
                small = fibonazzi[i - 2];
                break;
            }
        }

        System.out.println(Arrays.toString(fibonazzi));

        return small + (mid - small) * (num - mid) / (big - mid);
    }
}