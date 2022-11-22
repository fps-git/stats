# Сервисный класс для расчета статистики продаж **StatsService**

Данный сервисный Java класс принимает на вход данные о сумме продаж за любое количество месяцев в виде массива данных типа long

Класс содержит шесть методов:

* `getTotalSum` - позволяет рассчитать сумму всех продаж;
* `getMeanSum` - определяет среднюю сумму продаж в месяц;
* `getLastMaxSalesMonth` - находит последний месяц с максимальной суммой продаж;
* `getLastMinSalesMonth` - находит последний месяц с минимальной суммой продаж;
* `getLessMeanMonthQuantity` - выводит количество месяцев, в которых сумма продаж ниже средней;
* `getMoreMeanMonthQuantity` - выводит количество месяцев, в которых сумма продаж выше средней.

******

Сервисный класс `StatsService` снабжен набором автотестов `StatsServiceTest` для проверки работы каждого метода.