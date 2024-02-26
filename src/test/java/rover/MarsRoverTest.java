package rover;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {

    @ParameterizedTest
    @EnumSource(MarsOrientation.class)
    void hasOrientation(MarsOrientation baseOrientation) {
        MarsCoords origin = new MarsCoords(0,0);

        MarsRover rover = new MarsRover(origin, baseOrientation);
        MarsOrientation result = rover.getFacingDirection();

        assertThat(result).isEqualTo(baseOrientation);
    }

    @Test
    void hasPosition() {
        MarsCoords origin = new MarsCoords(0,0);
        MarsOrientation north = MarsOrientation.NORTH;
        MarsRover rover = new MarsRover(origin, north);

        MarsCoords result = rover.getCurrentPosition();
        assertThat(result).isEqualTo(origin);
    }

    @Test
    void moveForwards() {
        MarsCoords origin = new MarsCoords(0,0);
        MarsOrientation north = MarsOrientation.NORTH;
        MarsRover rover = new MarsRover(origin, north);

        rover.moveForward();
        MarsCoords result = rover.getCurrentPosition();

        MarsCoords expected = new MarsCoords(0,1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void moveBackwards() {
        MarsCoords origin = new MarsCoords(0,0);
        MarsOrientation north = MarsOrientation.NORTH;
        MarsRover rover = new MarsRover(origin, north);

        rover.moveBackwards();

        MarsCoords expectedPosition = new MarsCoords(0, -1);
        MarsOrientation expectedOrientation = MarsOrientation.SOUTH;
        MarsRover expected = new MarsRover(expectedPosition, expectedOrientation);
        assertThat(rover).isEqualTo(expected);
    }

}
