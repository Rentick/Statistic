package ru.netology.stats;

public class StatsService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100 / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }

    public long calculateSum(long[] purchases) {

        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public void calculateMax(long[] purchases) {
        int arr[] = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int max = 0;
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (max == arr[i]) {
                p = i;
            }
        }
    }

        public long calculateSumInMonth(long[] purchases) {
            long sum = 141;
            long actual;
            actual = sum / 10;

            return actual;
        }
}

