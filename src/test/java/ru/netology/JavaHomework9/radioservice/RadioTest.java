package ru.netology.JavaHomework9.radioservice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioNum() { //установка станции через прямое указание номера
        Radio radio = new Radio();
        radio.setRadioNum(8);


        int expected = 8;
        int actual = radio.getRadioNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMax() { // проверка граничных значений при установке номера станции напрямую
        Radio radio = new Radio();
        radio.setRadioNum(10);


        int expected = 0; // ноль потому что ничего не должно измениться
        int actual = radio.getRadioNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioUnderMin() { // проверка граничных значений при установке номера станции напрямую
        Radio radio = new Radio();
        radio.setRadioNum(-1);


        int expected = 0; // ноль потому что ничего не должно измениться
        int actual = radio.getRadioNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotClickRadioAboveMax() { // проверка переключения станции через кнопку "+" при максимальном значении номера станции
        Radio radio = new Radio();
        radio.setRadioNum(9);
        radio.nextRadioNum();


        int expected = 0;
        int actual = radio.getRadioNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotClickRadioUnderMin() { // проверка переключения станции через кнопку "-" при минимальном значении номера станции
        Radio radio = new Radio();
        radio.setRadioNum(0);
        radio.prevRadioNum();

        int expected = 9;
        int actual = radio.getRadioNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldClickPrevRadio() { // проверка переключения станции кнопкой "-" внутри допустимых значений
        Radio radio = new Radio();
        radio.setRadioNum(6);
        radio.prevRadioNum();


        int expected = 5;
        int actual = radio.getRadioNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldClickNextRadio() { // проверка переключения станции кнопкой "+" внутри допустимых значений
        Radio radio = new Radio();
        radio.setRadioNum(4);
        radio.nextRadioNum();


        int expected = 5;
        int actual = radio.getRadioNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldClickNextVolume() { // проверка переключения звука кнопкой "+" внутри допустимых значений
        Radio radio = new Radio();
        radio.setVolume(3);
        radio.volumePlus();


        int expected = 4;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldClickPrevVolume() { // проверка переключения звука кнопкой "-" внутри допустимых значений
        Radio radio = new Radio();
        radio.setVolume(8);
        radio.volumeMinus();


        int expected = 7;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotClickNextVolume() { // проверка переключения звука через кнопку "+" при максимальном значении
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.volumePlus();


        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotClickPrevVolume() { // проверка переключения звука через кнопку "-" при минимальном значении
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeMinus();


        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}