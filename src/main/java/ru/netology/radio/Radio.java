package ru.netology.radio;

public class Radio {

    private int volume;
    private int station;
    private int stationsNumber = 10;

    public Radio(int stationsNumber) { // Конструктор с параметром кол-ва станций
        this.stationsNumber = stationsNumber;
    }

    public Radio() {     // Конструктор без параметра кол-ва станций

    }

    public int getStationsNumber() {  // Геттер кол-ва станций

        return stationsNumber;
    }

    public int getStation() {    // Геттер текущего номера станции

        return station;
    }

    public int getVolume() {    // Геттер текущего значения громкости

        return volume;
    }

    public void setStation(int newStation) {  //  Сеттер номера станции (от 0 до Max)
        if (newStation < 0) {
            return;
        }
        if (newStation > (stationsNumber - 1)) {
            return;
        }
        station = newStation;
    }

    public void next() {   //  Следующая станция
        if (station == (stationsNumber - 1)) {
            station = 0;
            return;
        }
        station = station + 1;
    }

    public void prev() {  //  Предыдущая станция
        if (station == 0) {
            station = stationsNumber - 1;
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