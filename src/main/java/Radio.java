public class Radio {
    private int radioNum;
    private int volume;

    public int getRadioNum() {
        return radioNum;
    }

    public void setRadioNum(int newRadioNum) {
        if (newRadioNum < 0 || newRadioNum > 9) {
            return;
        } else radioNum = newRadioNum;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0 || newVolume > 10) {
            return;
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
        }
        return;
    }

    public void volumeMinus() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
