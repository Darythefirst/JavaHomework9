package ru.netology.JavaHomework9.radioservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioSize() { //установка количества станций
        Radio radio = new Radio(15);

        int expected = 15;
        int actual = radio.getRadioSize();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioSizeMin() { //установка количества станций (нулевое значение)
        Radio radio = new Radio(0);

        int expected = 10; // кол-во станций 10 по умолчанию,даже если пользователь ввел желаемое кол-во станций - 0
        int actual = radio.getRadioSize();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioMaxBySize() { //установка № макс.станции в зависимости от количества станций
        Radio radio = new Radio(30);

        int expected = 29;
        int actual = radio.getRadioMax();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMaxSize() { // Кол-во станций не устанавливается, количество станций остается по умолчанию 10,максимальная станция №9
        Radio radio = new Radio();

        int expectedSize = 10;
        int actualSize = radio.getRadioSize();
        int expectedRadioMax = 9;
        int actualRadioMax = radio.getRadioMax();

        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedRadioMax, actualRadioMax);
    }

    @Test
    public void shouldSetRadioNum() { //установка станции через прямое указание номера
        Radio radio = new Radio();
        radio.setRadioNum(8);


        int expected = 8;
        int actual = radio.getRadioNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMax() { // проверка граничных значений при установке номера станции напрямую без указания кол-ва станций
        Radio radio = new Radio();
        radio.setRadioNum(10);


        int expected = 0; // ноль потому что ничего не должно измениться
        int actual = radio.getRadioNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMaxSize() { // проверка граничных значений при установке номера станции напрямую при указании кол-ва станций
        Radio radio = new Radio(12);
        radio.setRadioNum(13);


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
    public void shouldNotClickRadioAboveMaxSize() { // проверка переключения станции через кнопку "+" при максимальном значении номера станции(установлено кол-во станций)
        Radio radio = new Radio(18);
        radio.setRadioNum(17);
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
    public void shouldNotClickRadioUnderMinSize() { // проверка переключения станции через кнопку "-" при минимальном значении номера станции (установлено кол-во станций)
        Radio radio = new Radio(21);
        radio.setRadioNum(0);
        radio.prevRadioNum();

        int expected = 20;
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
        radio.setVolume(100);
        radio.volumePlus();


        int expected = 100;
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