package rover;

import java.util.Objects;

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

    public void moveForward() {
        this.position = this.position.getNorth();
    }

    public void moveBackwards() {
        this.orientation = switch (this.orientation) {
            case EAST -> RoverOrientation.WEST;
            case WEST -> RoverOrientation.EAST;
            case NORTH -> RoverOrientation.SOUTH;
            case SOUTH -> RoverOrientation.NORTH;
        };

        this.position = switch (this.orientation) {
            case EAST -> this.position.getWest();
            case WEST -> this.position.getEast();
            case NORTH -> this.position.getSouth();
            case SOUTH -> this.position.getNorth();
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRover marsRover = (MarsRover) o;
        return orientation == marsRover.orientation && Objects.equals(position, marsRover.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orientation, position);
    }
}
