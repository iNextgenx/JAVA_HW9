import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldTestVolSet() {

        Radio setVolume = new Radio();
        setVolume.volume = 5;
        int expected = 5;
        int actual = setVolume.volume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestStationSet () {
        Radio setStation = new Radio();
        setStation.station = 9;
        int expected = 9;
        int actual = setStation.station;
        Assertions.assertEquals(expected, actual);
    }

}
