package com.company.lecture12.task_22;

public class MoldovanHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());
    }
}
