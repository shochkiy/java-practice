public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, 5, 6);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        Robot.Direction needDirectionY, needDirectionX;
        if (robot.getX() < toX ) {
            needDirectionX = Robot.Direction.RIGHT;
        } else {
            needDirectionX = Robot.Direction.LEFT;
        }

        if (robot.getY() < toY ) {
            needDirectionY = Robot.Direction.UP;
        } else {
            needDirectionY = Robot.Direction.DOWN;
        }

        while (robot.getDirection() != needDirectionY) {
            robot.turnRight();
        }

        while (robot.getY()!=toY) {
            robot.stepForward();
        }

        while (robot.getDirection() != needDirectionX) {
            robot.turnRight();
        }

        while (robot.getX()!=toX) {
            robot.stepForward();
        }
    }
}
