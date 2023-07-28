package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {
    @Test

    public void testNowStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(6);

        int expected = 6;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNegativeStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(-7);

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMaxMaxStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(18);

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNineStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(9);

        int expected = 9;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testTenStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(10);

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testEightStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(8);

        int expected = 8;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMinusOneStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(-1);

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testZeroStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(0);

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testOneStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(1);

        int expected = 1;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNextStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNextStationZero() {

        Radio radio = new Radio();
        radio.setcurrentStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNextStationOne() {

        Radio radio = new Radio();
        radio.setcurrentStation(1);
        radio.nextStation();

        int expected = 2;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNextStationEight() {

        Radio radio = new Radio();
        radio.setcurrentStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNextStationNine() {

        Radio radio = new Radio();
        radio.setcurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testPrevStation() {

        Radio radio = new Radio();
        radio.setcurrentStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testPrevStationZero() {

        Radio radio = new Radio();
        radio.setcurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testPrevStationOne() {

        Radio radio = new Radio();
        radio.setcurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testPrevStationEight() {

        Radio radio = new Radio();
        radio.setcurrentStation(8);
        radio.prevStation();

        int expected = 7;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testPrevStationNine() {

        Radio radio = new Radio();
        radio.setcurrentStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testIncreaseVolume() {

        Radio radio = new Radio();
        radio.setcurrentVolume(12);
        radio.increaseVolume();

        int expected = 13;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testIncreaseVolumeZero() {

        Radio radio = new Radio();
        radio.setcurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testIncreaseVolumeOne() {

        Radio radio = new Radio();
        radio.setcurrentVolume(1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testIncreaseVolumeNinetyNine() {

        Radio radio = new Radio();
        radio.setcurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testIncreaseVolumeOneHundred() {

        Radio radio = new Radio();
        radio.setcurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testReduceVolume() {

        Radio radio = new Radio();
        radio.setcurrentVolume(12);
        radio.reduceVolume();

        int expected = 11;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testReduceVolumeZero() {

        Radio radio = new Radio();
        radio.setcurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testReduceVolumeOne() {

        Radio radio = new Radio();
        radio.setcurrentVolume(1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testReduceVolumeNinetyNine() {

        Radio radio = new Radio();
        radio.setcurrentVolume(99);
        radio.reduceVolume();

        int expected = 98;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testReduceVolumeOneHundred() {

        Radio radio = new Radio();
        radio.setcurrentVolume(100);
        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testReduceVolumeMinusFive() {

        Radio radio = new Radio();
        radio.setcurrentVolume(-5);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getcurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testIncreaseVolumeTwoHundred() {

        Radio radio = new Radio();
        radio.setcurrentVolume(200);

        int expected = 0;
        int actual = radio.getcurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testFiveStationSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(5);

        int expected = 5;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNineStationSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(9);

        int expected = 9;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testTenStationSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(10);

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testEightStationSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(8);

        int expected = 8;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void testZeroStationSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(0);

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testOneStationSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(1);

        int expected = 1;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNextStationSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNextStationZeroSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNextStationOneSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(1);
        radio.nextStation();

        int expected = 2;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNextStationEightSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNextStationNineSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testPrevStationSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testPrevStationZeroSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testPrevStationOneSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testPrevStationEightSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(8);
        radio.prevStation();

        int expected = 7;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testPrevStationNineSC() {

        Radio radio = new Radio(10);
        radio.setcurrentStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getcurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}


