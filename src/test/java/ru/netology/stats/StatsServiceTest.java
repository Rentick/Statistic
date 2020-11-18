package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    public StatsService service = new StatsService();
    public int[] expectedArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void shouldSum() {
        int expected = 180;
        int actual = service.sum(expectedArray);

        assertEquals(expected, actual);

    }

    @Test
    void shouldAverage() {
        assertEquals(15, service.average(expectedArray));

    }

    @Test
    void shouldGetMaxMonth() {
        int expected = 8;
        int actual = service.GetMaxMonth(expectedArray);
        assertEquals(expected, actual);

    }
    @Test
    void shouldGetMinMonth() {
        int expected = 9;
        int actual = service.GetMinMonth(expectedArray);
        assertEquals(expected, actual);

    }
    @Test
    void shouldGetCountMoreThanAverage() {
        int expected = 5;
        int actual = service.GetMonthCountMoreThanAverage(expectedArray);
        assertEquals(expected, actual);

    }
    @Test
    void shouldGetCountLessThanAverage() {
        int expected = 5;
        int actual = service.GetMonthCountLessThanAverage(expectedArray);
        assertEquals(expected, actual);

    }
}
//
//    @Test
//    void calculateSumInMonth() {
//        StatsService service = new StatsService();
//        long[] purchases = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
//
//        System.out.println(service.calculateSumInMonth(purchases));
//
//    }
//
//    @Test
//    void calculateMaxSum() {
//        StatsService service = new StatsService();
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
//        System.out.println(p);
//    }
//
//    @Test
//    void calculateMinSum() {
//        StatsService service = new StatsService();
//        int arr[] = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
//        int min = 9999;
//        int p = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            if (min == arr[i]) {
//                p = i;
//            }
//        }
//        System.out.println(p);
//    }
//
//    @Test
//    void calculateSumElement() {
//        StatsService service = new StatsService();
//        int arr[] = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
//        int min = 14;
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            if (arr[i] < min) {
//                sum = sum + 1;
//            }
//
//
//        }
//        System.out.println(sum);
//    }
//
//    @Test
//    void calculateSumElementMax() {
//        StatsService service = new StatsService();
//        int arr[] = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
//        int min = 14;
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            if (arr[i] > min) {
//                sum = sum+1;
//            }
//
//
//        }
//        System.out.println(sum);
//    }
//}



