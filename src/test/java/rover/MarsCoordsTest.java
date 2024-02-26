package rover;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsCoordsTest {

    @ParameterizedTest
    @CsvSource({
            "0,0,0,1",
            "33,67,33,68",
            "-55,-34,-55,-33"
    })
    void northPosition(int startX, int startY, int endX, int endY) {
        MarsCoords start = new MarsCoords(startX, startY);
        MarsCoords end = new MarsCoords(endX, endY);

        MarsCoords result = start.getNorth();

        assertThat(result).isEqualTo(end);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0,0,-1",
            "33,67,33,66",
            "-55,-34,-55,-35"
    })
    void southPosition(int startX, int startY, int endX, int endY) {
        MarsCoords start = new MarsCoords(startX, startY);
        MarsCoords end = new MarsCoords(endX, endY);

        MarsCoords result = start.getSouth();

        assertThat(result).isEqualTo(end);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0,1,0",
            "33,67,34,67",
            "-55,-34,-54,-34"
    })
    void eastPosition(int startX, int startY, int endX, int endY) {
        MarsCoords start = new MarsCoords(startX, startY);
        MarsCoords end = new MarsCoords(endX, endY);

        MarsCoords result = start.getEast();

        assertThat(result).isEqualTo(end);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0,-1,0",
            "33,67,32,67",
            "-55,-34,-56,-34"
    })
    void westPosition(int startX, int startY, int endX, int endY) {
        MarsCoords start = new MarsCoords(startX, startY);
        MarsCoords end = new MarsCoords(endX, endY);

        MarsCoords result = start.getWest();

        assertThat(result).isEqualTo(end);
    }

}
