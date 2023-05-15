package ru.netology.JavaHomework9.radioservice;

public class Radio {
    private int radioNum;
    private int volume;
    public int radioMin = 0;
    public int radioMax = 9;

    public int volumeMin = 0;
    public int volumeMax = 10;

    public int getRadioNum() {
        return radioNum;
    }

    public void setRadioNum(int newRadioNum) {
        if (newRadioNum < radioMin || newRadioNum > radioMax) {
            return;
        } else radioNum = newRadioNum;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume <= volumeMin) {
            volume = volumeMin;
        } else if (newVolume >= volumeMax) {
            volume = volumeMax;
        } else volume = newVolume;
    }

    public void nextRadioNum() {
        if (radioNum < 9) {
            radioNum = radioNum + 1;
        } else radioNum = 0;
    }

    public void prevRadioNum() {
        if (radioNum > 0) {
            radioNum = radioNum - 1;
        } else radioNum = 9;
    }

    public void volumePlus() {
        if (volume < 10) {
            volume = volume + 1;
        } else volume = 10;
    }

    public void volumeMinus() {
        if (volume > 0) {
            volume = volume - 1;
        } else volume = 0;
    }
}
