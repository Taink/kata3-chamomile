package rover;

public class MarsRover {
    private RoverOrientation orientation;

    public MarsRover(RoverPosition origin, RoverOrientation defaultOrientation) {
        this.orientation = defaultOrientation;
    }

    public RoverOrientation getOrientation() {
        return this.orientation;
    }
}
