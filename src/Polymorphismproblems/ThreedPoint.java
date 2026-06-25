package Polymorphismproblems;

public class ThreedPoint extends Point {
    private int Z;

    @Override
    public void display() {
        System.out.println("["+X+","+Y+","+Z+"]");
    }
}
