package ru.netology.stats;

public class StatsService {
    public int sum(int[] array) {
        int result = 0;
        for (int amount : array) {
            result += amount;
        }
        return result;

    }

    public int average(int[] array) {
        return sum(array) / array.length;
    }

    public int GetMaxMonth(int[] array) {
        int max = getMax(array);
        int result = 0;
        int month = 0;
        for (int amount : array) {
            month++; //инкримент += 1
            if (amount == max) {
                result = month;
            }
        }
        return result;
    }
    public int GetMinMonth(int[] array) {
        int min = getMin(array);
        int result = 0;
        int month = 0;
        for (int amount : array) {
            month++; //инкримент += 1
            if (amount == min) {
                result = month;
            }
        }
        return result;
    }
    public int getMax(int[] array) {
        int max = 0;
        for (int amount : array) {
            if (amount > max) {
                max = amount;
            }
        }
        return max;
    }

    public int getMin(int[] array) {
        int min = array[0];
        for (int amount : array) {
            if (amount < min) {
                min = amount;
            }
        }
        return min;
    }

    public int GetMonthCountMoreThanAverage(int[] array) {
        int average = average(array);
        int count = 0;
        for (int amount : array) {
            if (amount > average) {
                count++;
            }

        }
        return count;
    }

    public int GetMonthCountLessThanAverage(int[] array) {
        int average = average(array);
        int count = 0;
        for (int amount : array) {
            if (amount < average) {
                count++;
            }

        }
        return count;
    }

}


//    public long calculate(long amount, boolean registered) {
//        int percent = registered ? 3 : 1;
//        long bonus = amount * percent / 100 / 100;
//        long limit = 500;
//        if (bonus > limit) {
//            bonus = limit;
//        }
//        return bonus;
//    }
//
//    public long sum (long[] purchases) {
//
//        long sum = 0;
//        for (long purchase : purchases) {
//            sum += purchase;
//        }
//        return sum;
//    }
//
//    public void calculateMax(long[] purchases) {
//        int arr[] = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
//        int max = 0;
//        int p = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (max == arr[i]) {
//                p = i;
//            }
//        }
//    }
//
//        public long calculateSumInMonth(long[] purchases) {
//            long sum = 141;
//            long actual;
//            actual = sum / 10;
//
//            return actual;
//        }
//}
