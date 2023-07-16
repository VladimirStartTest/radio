package org.example;

public class Radio {
    private int CurrentStation;
    private int CurrentVolume;

    public int getCurrentStation() {
        return CurrentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {

            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.CurrentStation = currentStation;

    }

    public int getCurrentVolume() {
        return CurrentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 100) {
            return;
        }
        this.CurrentVolume = currentVolume;
    }

    public void nextStation() {
        if (CurrentStation != 9) {
            CurrentStation++;
        } else {
            CurrentStation = 0;
        }
    }

    public void prevStation() {
        if (CurrentStation != 0) {
            CurrentStation--;
        } else {
            CurrentStation = 9;
        }
    }

    public void increaseVolume() {
        if (CurrentVolume != 100) {
            CurrentVolume++;
        } else {
            CurrentVolume = 100;
        }
    }


    public void reduceVolume() {
        if (CurrentVolume != 0) {
            CurrentVolume--;
        } else {
            CurrentVolume = 0;
        }
    }
}