package rover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoverTest {

    @Test
    void hasOrientation() {
        RoverPosition origin = new RoverPosition(0,0);
        RoverOrientation north = RoverOrientation.NORTH;

        MarsRover rover = new MarsRover(origin, north);

        RoverOrientation result = rover.getOrientation();

        assertThat(result).isEqualTo(north);
    }
}
