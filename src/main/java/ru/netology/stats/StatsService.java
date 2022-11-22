package ru.netology.stats;

public class StatsService {

    public long getTotalSum(long[] sales) {
        long totalSum = 0;
        for (long nextMonth : sales) {
            totalSum = totalSum + nextMonth;
        }
        return totalSum;
    }

    public long getMeanSum(long[] sales) {
        return getTotalSum(sales) / (sales.length);
    }

    public int getLastMaxSalesMonth(long[] sales) {
        int lastMaxSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[lastMaxSalesMonth]) {
                lastMaxSalesMonth = i;
            }
        }
        return lastMaxSalesMonth + 1;
    }

    public int getLastMinSalesMonth(long[] sales) {
        int lastMinSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[lastMinSalesMonth]) {
                lastMinSalesMonth = i;
            }
        }
        return lastMinSalesMonth + 1;
    }

    public int getLessMeanMonthQuantity(long[] sales) {
        int lessMeanQuantity = 0;
        for (long sale : sales) {
            if (sale < getMeanSum(sales)) {
                lessMeanQuantity = lessMeanQuantity + 1;
            }
        }
        return lessMeanQuantity;
    }

    public int getMoreMeanMonthQuantity(long[] sales) {
        int moreMeanQuantity = 0;
        for (long sale : sales) {
            if (sale > getMeanSum(sales)) {
                moreMeanQuantity = moreMeanQuantity + 1;
            }
        }
        return moreMeanQuantity;
    }

}
