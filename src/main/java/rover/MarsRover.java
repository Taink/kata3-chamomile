package rover;

public class MarsRover {
    private RoverOrientation orientation;
    private RoverPosition position;

    public MarsRover(RoverPosition origin, RoverOrientation defaultOrientation) {
        this.orientation = defaultOrientation;
        this.position = origin;
    }

    public RoverOrientation getOrientation() {
        return this.orientation;
    }

    public RoverPosition getPosition() {
        return this.position;
    }

    public RoverPosition MoveForward() {
        return this.position.north();
    }
}
