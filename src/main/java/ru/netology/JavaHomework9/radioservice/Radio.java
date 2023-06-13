package ru.netology.JavaHomework9.radioservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

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

    public void setRadioNum(int radioNum) {
        if (radioNum < radioMin || radioNum > radioMax) {
            return;
        } else {
            this.radioNum = radioNum;
        }
    }

    public void setVolume(int volume) {
        if (volume <= volumeMin) {
            this.volume = volumeMin;
        } else if (volume >= volumeMax) {
            this.volume = volumeMax;
        } else {
            this.volume = volume;
        }
    }

    public void nextRadioNum() {
        if (radioNum < radioMax) {
            radioNum = radioNum + 1;
        } else {
            radioNum = radioMin;
        }
    }

    public void prevRadioNum() {
        if (radioNum > 0) {
            radioNum = radioNum - 1;
        } else {
            radioNum = radioMax;
        }
    }

    public void volumePlus() {
        if (volume < volumeMax) {
            volume = volume + 1;
        } else {
            volume = volumeMax;
        }
    }

    public void volumeMinus() {
        if (volume > volumeMin) {
            volume = volume - 1;
        } else {
            volume = volumeMin;
        }
    }
}
