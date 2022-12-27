import java.util.Random;

public class Main {
        public static void main(String[] args) {
           int xx = randInt(-1000,1000);
           int yy= randInt(-1000,1000);
            int Xx = randInt(-1000,1000);
            int Yy = randInt(-1000,1000);
            Robot robot = new Robot(xx, yy, Direction.DOWN);// от куда ити .
            moveRobot(robot, Xx, Yy); // куда ити .
if(robot.getX()==Xx && robot.getY()==Yy){
    System.out.println("ты выйграл робат на месте!!! X="+Xx + "  Y="+Yy );// надпись в случае победы
}

            /*

               getDirection()
        // текущее направление взгляда

                getX()
        // текущая координата X

                getY()
        // текущая координата Y

             turnLeft()
        // повернуться на 90 градусов против часовой стрелки

             turnRight() {
        // повернуться на 90 градусов по часовой стрелке

               stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
Direction, направление взгляда робота,  — это перечисление:
public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
             */
        }
    public static int randInt(int min, int max) {
        Random random = new Random();
        int randomNum = random.nextInt((max - min) + 1) + min;
        return randomNum;
    }



        public enum Direction {
            UP, DOWN, LEFT, RIGHT
        }

        public static class Robot {
            int x;
            int y;
            Direction dir;

            public Robot(int x, int y, Direction dir) {
                this.x = x;
                this.y = y;
                this.dir = dir;
            }

            public Direction getDirection() {
                return dir;
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }

            public void turnLeft() {
                if (dir == Direction.UP) {
                    dir = Direction.LEFT;
                } else if (dir == Direction.DOWN) {
                    dir = Direction.RIGHT;
                } else if (dir == Direction.LEFT) {
                    dir = Direction.DOWN;
                } else if (dir == Direction.RIGHT) {
                    dir = Direction.UP;
                }
            }

            public void turnRight() {
                if (dir == Direction.UP) {
                    dir = Direction.RIGHT;
                } else if (dir == Direction.DOWN) {
                    dir = Direction.LEFT;
                } else if (dir == Direction.LEFT) {
                    dir = Direction.UP;
                } else if (dir == Direction.RIGHT) {
                    dir = Direction.DOWN;
                }
            }

            public void stepForward() {
                if (dir == Direction.UP) {
                    y++;
                }
                if (dir == Direction.DOWN) {
                    y--;
                }
                if (dir == Direction.LEFT) {
                    x--;
                }
                if (dir == Direction.RIGHT) {
                    x++;
                }
            }
        }

        public static void moveRobot(Robot robot, int toX, int toY) {
            //пишите код тут
            ...
                }
            }


