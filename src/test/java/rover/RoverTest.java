package rover;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

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
    void moveForward() {
        RoverPosition origin = new RoverPosition(0,0);
        RoverOrientation north = RoverOrientation.NORTH;
        MarsRover rover = new MarsRover(origin, north);

        RoverPosition result = rover.MoveForward();

        RoverPosition expected = new RoverPosition(0,1);


        assertThat(result).isEqualTo(expected);
    }

}
