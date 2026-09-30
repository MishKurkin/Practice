package Object_Oriented;

public class MovableRectangle implements Movable{
    public MovablePoint topLeft;
    public MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void chechUp(int xSpeed, int ySpeed) {
        if (xSpeed == ySpeed) {
            System.out.println("Скорости равны");
        } else {
            System.out.println("Скорости не равны");
        }
    }

    @Override
    public void moveup() {
        chechUp(topLeft.xSpeed, topLeft.ySpeed);
        topLeft.moveup();
        bottomRight.moveup();
    }

    @Override
    public void moveleft() {
        chechUp(topLeft.xSpeed, topLeft.ySpeed);
        topLeft.moveleft();
        bottomRight.moveleft();
    }

    @Override
    public void moveright() {
        chechUp(topLeft.xSpeed, topLeft.ySpeed);
        topLeft.moveright();
        bottomRight.moveright();
    }

    @Override
    public void movedown() {
        chechUp(topLeft.xSpeed, topLeft.ySpeed);
        topLeft.movedown();
        bottomRight.movedown();
    }

    @Override
    public String toString() {
        return "MovableRectangle[topLeft=%s, bottomRight=%s]".formatted(topLeft, bottomRight);
    }
}
