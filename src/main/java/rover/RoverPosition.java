package rover;


public record RoverPosition(int x, int y) {

    public RoverPosition getNorth() {
        return new RoverPosition(this.x, this.y + 1);
    }

    public RoverPosition getSouth() {
        return new RoverPosition(this.x, this.y - 1);
    }

    public RoverPosition getEast() {
        return new RoverPosition(this.x + 1, this.y);
    }


    public RoverPosition getWest() {
        return new RoverPosition(this.x - 1, this.y);
    }
}
