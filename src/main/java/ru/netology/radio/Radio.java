package ru.netology.radio;

public class Radio {

    private int volume;
    private int station;

    public int getStation() {    // Геттер текущего номера станции
        return station;
    }

    public int getVolume() {    // Геттер текущего значения громкости
        return volume;
    }

    public void setStation(int newStation) {  //  Сеттер номера станции (от 0 до 9)
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        station = newStation;
    }

    public void next() {   //  Следующая станция
        if (station == 9) {
            station = 0;
            return;
        }
        station = station + 1;
    }

    public void prev() {  //  Предыдущая станция
        if (station == 0) {
            station = 9;
            return;
        }
        station = station - 1;
    }

    public void setVolume(int newVolume) {  //  Сеттер громкости звука (от 0 до 100)
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void volumeUp() { // Увеличение громкости на 1
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void volumeDn() {  // Уменьшение громкости на 1
        if (volume > 0) {
            volume = volume - 1;
        }
    }

}