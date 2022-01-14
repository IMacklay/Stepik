package org;

/*
На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным
координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)

В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот
смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 */

public class WalkingRobot {

    public static void main(String[] args) {
        Robot robot = new Robot(0,0, Direction.RIGHT);
        robot.printCurrentStatus();
        moveRobot(robot, -3, 0);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        Direction vectorMovingX = toX<robot.getX()?Direction.LEFT:Direction.RIGHT;
        while( robot.getDirection() != vectorMovingX ) robot.turnLeft();
        while ( robot.getX() != toX ) robot.stepForward();

        Direction vectorMovingY = toY<robot.getY()?Direction.DOWN:Direction.UP;
        while( robot.getDirection() != vectorMovingY ) robot.turnRight();
        while ( robot.getY() != toY ) robot.stepForward();


    }


    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT

    }
    public static class Robot {
        int x;
        int y;

        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
            printCurrentStatus();
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
            printCurrentStatus();
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
            printCurrentStatus();
        }
        public void printCurrentStatus(){
            System.out.println("X -> "+x+"   Y -> "+y+"  Direction -> "+dir);
        }

    }
}
