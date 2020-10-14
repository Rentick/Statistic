package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.security.Provider;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'registered and under limit',100060,true,30",
                    "'registered and under limit',100060,false,10"
            },
            delimiter = ','
    )
    void shouldCalculate(String test, long amount, boolean registered, long expected) {
        StatsService service = new StatsService();
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

//    Сумму всех продаж
//    Среднюю сумму продаж в месяц
//    Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
//    Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
//    Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
//    Кол-во месяцев, в которых продажи были выше среднего (см. п.2)


    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};

        System.out.println(service.calculateSum(purchases));

    }

    @Test
    void calculateSumInMonth() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};

        System.out.println(service.calculateSumInMonth(purchases));

    }

    @Test
    void calculateMaxSum() {
        StatsService service = new StatsService();
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
        System.out.println(p);
    }

    @Test
    void calculateMinSum() {
        StatsService service = new StatsService();
        int arr[] = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int min = 9999;
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (min == arr[i]) {
                p = i;
            }
        }
        System.out.println(p);
    }

    @Test
    void calculateSumElement() {
        StatsService service = new StatsService();
        int arr[] = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int min = 14;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] < min) {
                sum = sum + 1;
            }


        }
        System.out.println(sum);
    }

    @Test
    void calculateSumElementMax() {
        StatsService service = new StatsService();
        int arr[] = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int min = 14;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] > min) {
                sum = sum+1;
            }


        }
        System.out.println(sum);
    }
}



