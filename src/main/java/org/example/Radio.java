package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;

    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;

    }

    public int getcurrentStation() {
        return currentStation;
    }

    public void setcurrentStation(int currentStation) {
        if (currentStation < 0) {

            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;

    }

    public int getcurrentVolume() {
        return currentVolume;
    }

    public void setcurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;

        } else {
            currentVolume = 100;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}