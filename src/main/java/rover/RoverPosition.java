package rover;


public record RoverPosition(int x, int y) {

    public RoverPosition north() {
        return new RoverPosition(this.x, this.y + 1);
    }

}
