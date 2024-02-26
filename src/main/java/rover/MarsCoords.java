package rover;


public record MarsCoords(int x, int y) {

    public MarsCoords getNorth() {
        return new MarsCoords(this.x, this.y + 1);
    }

    public MarsCoords getSouth() {
        return new MarsCoords(this.x, this.y - 1);
    }

    public MarsCoords getEast() {
        return new MarsCoords(this.x + 1, this.y);
    }


    public MarsCoords getWest() {
        return new MarsCoords(this.x - 1, this.y);
    }
}
