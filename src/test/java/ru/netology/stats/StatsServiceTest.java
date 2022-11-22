package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldCalculateTotalSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.getTotalSum(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateMeanSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.getMeanSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetLastMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getLastMaxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetLastMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getLastMinSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetLessMeanMonthQuantity() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getLessMeanMonthQuantity(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMoreMeanMonthQuantity() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getMoreMeanMonthQuantity(sales);
        Assertions.assertEquals(expected, actual);
    }
}
