package lab2;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        IRobot robot = ObjectFactory.getInstance().createObject(IRobot.class);
        robot.cleanRoom();
    }
}
