package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

       int actual = service.sum(purchases);
       int expected = 180;
       assertEquals(expected, actual, "Test sum method");
    }

    @Test
    void shouldAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.avg(purchases);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthNumberWithMax() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthWithMax(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthNumberWithMin() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthWithMin(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCountOfMonthWithMoreThanAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthsWithMoreThanAvg(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCountOfMonthWithLessThanAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthsWithLessThanAvg(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }
}