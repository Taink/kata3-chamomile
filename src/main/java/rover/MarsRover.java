package rover;

import java.util.Objects;

public class MarsRover {
    private MarsOrientation facingDirection;
    private MarsCoords currentPosition;

    public MarsRover(MarsCoords initialCoords, MarsOrientation facingDirection) {
        this.facingDirection = facingDirection;
        this.currentPosition = initialCoords;
    }

    public MarsOrientation getFacingDirection() {
        return this.facingDirection;
    }

    public MarsCoords getCurrentPosition() {
        return this.currentPosition;
    }

    public void moveForward() {
        this.currentPosition = this.currentPosition.getNorth();
    }

    public void moveBackwards() {
        this.facingDirection = switch (this.facingDirection) {
            case EAST -> MarsOrientation.WEST;
            case WEST -> MarsOrientation.EAST;
            case NORTH -> MarsOrientation.SOUTH;
            case SOUTH -> MarsOrientation.NORTH;
        };

        this.currentPosition = switch (this.facingDirection) {
            case WEST -> this.currentPosition.getWest();
            case EAST -> this.currentPosition.getEast();
            case SOUTH -> this.currentPosition.getSouth();
            case NORTH -> this.currentPosition.getNorth();
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRover marsRover = (MarsRover) o;
        return facingDirection == marsRover.facingDirection && Objects.equals(currentPosition, marsRover.currentPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facingDirection, currentPosition);
    }
}
