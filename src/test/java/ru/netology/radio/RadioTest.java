package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldTestVolSetCorrectValue() {  // Проверка при корректном значении
        Radio volume = new Radio();

        volume.setVolume(5);

        int expected = 5;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolSetBelow0() {  // Проверка при значении меньше 0
        Radio volume = new Radio();

        volume.setVolume(-25);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolSetUp100() {  // Проверка при значении больше 100
        Radio volume = new Radio();

        volume.setVolume(125);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestStationSetCorrectValue() { // Проверка при корректном значении
        Radio station = new Radio();

        station.setStation(5);

        int expected = 5;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestStationSetAboveMax() { // Проверка при вводе значения больше максимального
        Radio station = new Radio();

        station.setStation(20);

        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestStationSetBelowMin() { // Проверка при вводе значения меньше минимального
        Radio station = new Radio();

        station.setStation(-10);

        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNextIfStationFrom0to8() { // Проверка при установленной станции от 0 до 8
        Radio station = new Radio();

        station.setStation(4);
        station.next();

        int expected = 5;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNextIfStation9() { // Проверка при значении станции 9
        Radio station = new Radio();

        station.setStation(9);
        station.next();

        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPrevСorrectValue() { // Проверка при установленной станции от 1 до 9
        Radio station = new Radio();

        station.setStation(7);
        station.prev();

        int expected = 6;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPrev() { // Проверка при установленной станции 0
        Radio station = new Radio();

        station.setStation(0);
        station.prev();

        int expected = 9;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolUpIfValue100() {  // Проверка при значении 100
        Radio volume = new Radio();

        volume.setVolume(100);
        volume.volumeUp();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolUpIfValueFrom0to99() {  // Проверка при значении от 0 до 99
        Radio volume = new Radio();

        volume.setVolume(55);
        volume.volumeUp();

        int expected = 56;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolDnIfValue0() { // Проверка при значении 0
        Radio volume = new Radio();

        volume.setVolume(0);
        volume.volumeDn();

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolDnIfValueFrom1to100() { // Проверка при значении от 1 до 100
        Radio volume = new Radio();

        volume.setVolume(74);
        volume.volumeDn();

        int expected = 73;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
