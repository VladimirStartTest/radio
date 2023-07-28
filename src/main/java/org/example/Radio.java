package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getcurrentStation() {
        return currentStation;
    }

    public void setcurrentStation(int CurrentStation) {
        if (currentStation < 0) {

            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = CurrentStation;

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
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
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