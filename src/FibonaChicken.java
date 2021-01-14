import java.util.Arrays;

public class FibonaChicken {
    public static void main(String[] args) {
        howManyChicken(10);

    }

    static int howManyChicken(int num) {
        int[] fibonazzi = new int[num + 1];
        int[] fibonaChicken = new int[num + 1];

        fibonazzi[0] = 0;
        fibonazzi[1] = 1;
        fibonazzi[2] = 1;

        for (int i = 3; i < fibonazzi.length; i++) {
            fibonazzi[i] = fibonazzi[i - 2] + fibonazzi[i - 1];
        }

        for (int i = 1; fibonazzi[i + 1] <= fibonaChicken.length; i++) {
            fibonaChicken[fibonazzi[i + 1]] = fibonazzi[i];
        }

        for (int i = 1; i < fibonaChicken.length; i++) {
            if (fibonaChicken[i] == 0) {

            }
        }

        System.out.println(Arrays.toString(fibonazzi));
        System.out.println(Arrays.toString(fibonaChicken));
        return fibonazzi[num];
    }
}
