package com.company.questCore.level8.lecture11.task2.constants;

public class TaskConstants {
    private TaskConstants(){}

    private static final String RESOURCES_PATH = System.getProperty("user.dir");
    private static final String DATA_TXT_PATH = RESOURCES_PATH + "\\src\\com\\company\\questCore\\level8\\lecture11\\task2\\Data.txt";
    public static String getDataTxtPath() {
        return DATA_TXT_PATH;
    }
}
