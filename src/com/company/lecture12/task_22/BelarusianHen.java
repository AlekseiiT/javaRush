package com.company.lecture12.task_22;

public class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 99;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
    }
}
