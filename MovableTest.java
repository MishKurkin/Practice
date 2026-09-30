package Object_Oriented;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint mt = new MovablePoint(5, 5, 1, 2);
        mt.moveup();
        mt.moveup();
        mt.moveright();
        mt.moveright();
        System.out.println(mt.toString());

        MovableCircle mc = new MovableCircle(0, 0, 1, 2, 5);
        mc.movedown();
        mc.moveleft();
        System.out.println(mc.toString());

        MovableRectangle mv = new MovableRectangle(0, 0, 1, 1, 4, 5);
        mv.movedown();
        mv.moveright();
        System.out.println(mv.toString());
    }
}
