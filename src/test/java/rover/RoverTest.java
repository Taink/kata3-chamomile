package rover;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class RoverTest {

    @ParameterizedTest
    @EnumSource(RoverOrientation.class)
    void hasOrientation(RoverOrientation baseOrientation) {
        RoverPosition origin = new RoverPosition(0,0);

        MarsRover rover = new MarsRover(origin, baseOrientation);
        RoverOrientation result = rover.getOrientation();

        assertThat(result).isEqualTo(baseOrientation);
    }

    @Test
    void hasPosition() {
        RoverPosition origin = new RoverPosition(0,0);
        RoverOrientation north = RoverOrientation.NORTH;
        MarsRover rover = new MarsRover(origin, north);

        RoverPosition result = rover.getPosition();
        assertThat(result).isEqualTo(origin);
    }

    @Test
    void moveForwards() {
        RoverPosition origin = new RoverPosition(0,0);
        RoverOrientation north = RoverOrientation.NORTH;
        MarsRover rover = new MarsRover(origin, north);

        rover.MoveForward();
        RoverPosition result = rover.getPosition();

        RoverPosition expected = new RoverPosition(0,1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void moveBackwards() {
        RoverPosition origin = new RoverPosition(0,0);
        RoverOrientation north = RoverOrientation.NORTH;
        MarsRover rover = new MarsRover(origin, north);

        rover.MoveBackwards();

        RoverPosition expectedPosition = new RoverPosition(0, -1);
        RoverOrientation expectedOrientation = RoverOrientation.SOUTH;
        MarsRover expected = new MarsRover(expectedPosition, expectedOrientation);
        assertThat(rover).isEqualTo(expected);
    }

}
