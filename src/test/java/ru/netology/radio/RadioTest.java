package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio volume = new Radio();


    @Test
    public void testConstructorWithParametr() {    // Проверка конструктора с параметром кол-ва станций
        Radio stations = new Radio(15);
        int expected = 15;
        int actual = stations.getStationsNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithoutParametr() {    // Проверка конструктора без параметра кол-ва станций
        Radio stations = new Radio();
        int expected = 10;
        int actual = stations.getStationsNumber();
        Assertions.assertEquals(expected, actual);
    }


    //                         <<<ТЕСТЫ С ПАРАМЕТРОМ RADIO>>>
    @Test
    public void shouldTestStationSetCorrectValue() { // Проверка при корректном значении СТАНЦИИ
        Radio station = new Radio(500);
        station.setStation(250);

        int expected = 250;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestStationSetAboveMax() { // Проверка при вводе значения СТАНЦИИ больше максимального
        Radio station = new Radio(500);
        station.setStation(500); // кол-во станций = 500, последняя = 499, при вводе номера 500 ничего не происходит
        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestStationSetBelowMin() { // Проверка при вводе СТАНЦИИ значения меньше минимального
        Radio station = new Radio(300);
        station.setStation(-10);

        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNextIfStationFrom0toMax() { // Проверка при установленной СТАНЦИИ от 0 до Max
        Radio station = new Radio(50);
        station.setStation(15);
        station.next();

        int expected = 16;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNextIfStationMax() { // Проверка при значении СТАНЦИИ Max
        Radio station = new Radio(50);
        station.setStation(49);
        station.next();

        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPrevFrom1toMax() { // Проверка при установленной СТАНЦИИ от 1 до Max
        Radio station = new Radio(25);
        station.setStation(7);
        station.prev();

        int expected = 6;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPrevIfStation0() { // Проверка при установленной СТАНЦИИ 0
        Radio station = new Radio(500);
        station.setStation(0);
        station.prev();

        int expected = 499;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    //                              <<<ТЕСТЫ БЕЗ ПАРАМЕТРА RADIO>>>

    @Test
    public void shouldTestStationSetCorrectValueNoPar() { // Проверка при корректном значении СТАНЦИИ
        Radio station = new Radio();
        station.setStation(8);

        int expected = 8;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestStationSetAboveMaxNoPar() { // Проверка при вводе значения СТАНЦИИ больше максимального
        Radio station = new Radio();
        station.setStation(10); // кол-во станций = 10, последняя = 9, при вводе номера 10 ничего не происходит
        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestStationSetBelowMinNoPar() { // Проверка при вводе СТАНЦИИ значения меньше минимального
        Radio station = new Radio();
        station.setStation(-10);

        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNextIfStationFrom0toMaxNoPar() { // Проверка при установленной СТАНЦИИ от 0 до Max
        Radio station = new Radio();
        station.setStation(7);
        station.next();

        int expected = 8;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNextIfStationMaxNoPar() { // Проверка при значении СТАНЦИИ Max
        Radio station = new Radio();
        station.setStation(9);
        station.next();

        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPrevFrom1toMaxNoPar() { // Проверка при установленной СТАНЦИИ от 1 до Max
        Radio station = new Radio();
        station.setStation(7);
        station.prev();

        int expected = 6;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPrevIfStation0NoPar() { // Проверка при установленной СТАНЦИИ 0
        Radio station = new Radio();
        station.setStation(0);
        station.prev();

        int expected = 9;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    //                              <<<ТЕСТЫ ЗВУКА>>>
    @Test
    public void shouldTestVolSetCorrectValue() {  // Проверка при корректном значении ЗВУКА

        volume.setVolume(5);

        int expected = 5;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolSetBelow0() {  // Проверка при значении ЗВУКА меньше 0

        volume.setVolume(-25);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolSetAbove100() {  // Проверка при значении ЗВУКА больше 100

        volume.setVolume(125);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolUpIfValue100() {  // Проверка при значении ЗВУКА 100

        volume.setVolume(100);
        volume.volumeUp();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolUpIfValueFrom0to99() {  // Проверка при значении ЗВУКА от 0 до 99

        volume.setVolume(55);
        volume.volumeUp();

        int expected = 56;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolDnIfValue0() { // Проверка при значении ЗВУКА 0

        volume.setVolume(0);
        volume.volumeDn();

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolDnIfValueFrom1to100() { // Проверка при значении ЗВУКА от 1 до 100

        volume.setVolume(74);
        volume.volumeDn();

        int expected = 73;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
