package org.oop;

public class CheckPointA extends BaseCheckPoint implements Comparable<CheckPointA>{
    String name;

    public CheckPointA(boolean completed, String name) {
        super(completed);
        this.name = name;
    }
    @Override
    public String toString() {
        return "CheckPointA{" +
                "name='" + name + '\'' +
                "completed=" + this.isCompleted() +
                '}';
    }

    @Override
    public int compareTo(CheckPointA o) {
        return 0;
    }
}
