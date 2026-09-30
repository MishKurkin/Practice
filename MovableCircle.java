package Object_Oriented;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint mid;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.mid = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveup() {
        mid.moveup();
    }

    @Override
    public void movedown() {
        mid.movedown();
    }

    @Override
    public void moveleft() {
        mid.moveleft();
    }

    @Override
    public void moveright() {
        mid.moveright();
    }

    @Override
    public String toString() {
        return "MovableCircle[radius=%d, center=%s]".formatted(radius, mid);
    }
}
