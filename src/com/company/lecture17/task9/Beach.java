package com.company.lecture17.task9;

/*
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Beach o) {
        int first = 0;
        int second = 0;

        float totalDistance = distance - o.getDistance();
        if (totalDistance > 0)
            second++;
        else if ( totalDistance < 0)
            first++;

        int totalQuality = quality - o.getQuality();
        if (totalQuality > 0)
            first++;
        else if ( totalQuality < 0)
            second++;

        return first - second;
    }
}