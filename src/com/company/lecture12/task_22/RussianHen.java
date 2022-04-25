package com.company.lecture12.task_22;

public class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 1000000;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
    }
}
