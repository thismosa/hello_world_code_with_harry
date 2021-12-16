package com.company;
class Base{
    int x;

    public Base(int x) {
        this.x = x;
        System.out.println("this is a contructor");
    }

    public void printMe(){
        System.out.println("this is a base class");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public Derived(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inhertence {
}
