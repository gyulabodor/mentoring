package org.oop;

public class BaseCheckPoint {
    private boolean completed;

    public BaseCheckPoint(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "BaseCheckPoint{" +
                "completed=" + completed +
                '}';
    }
}
