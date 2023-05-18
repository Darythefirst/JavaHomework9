package ru.netology.JavaHomework9.radioservice;

public class Radio {
    private int radioSize = 10;
    private int radioNum;
    private int volume;
    private int radioMin = 0;
    private int radioMax = radioSize - 1;

    private int volumeMin = 0;
    private int volumeMax = 100;

    public Radio(int radioSize) {
        if (radioSize > 0) {
            this.radioSize = radioSize;
            this.radioMax = radioSize - 1;
        }
    }

    public Radio() {
        this.radioSize = getRadioSize();
    }

    public int getRadioSize() {
        return radioSize;
    }
//    public void setRadioSize (int newRadioSize) {
//        if (newRadioSize > 0) {
//            radioSize = newRadioSize;
//        }
//    }

    public int getRadioMax() {
        return radioMax;
    }

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
        if (radioNum < radioMax) {
            radioNum = radioNum + 1;
        } else radioNum = radioMin;
    }

    public void prevRadioNum() {
        if (radioNum > 0) {
            radioNum = radioNum - 1;
        } else radioNum = radioMax;
    }

    public void volumePlus() {
        if (volume < volumeMax) {
            volume = volume + 1;
        } else volume = volumeMax;
    }

    public void volumeMinus() {
        if (volume > volumeMin) {
            volume = volume - 1;
        } else volume = volumeMin;
    }
}
