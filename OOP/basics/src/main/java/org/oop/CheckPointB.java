package org.oop;

public class CheckPointB extends BaseCheckPoint{
    private String description;

    public CheckPointB(boolean completed,String description) {
        super(completed);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CheckPointB{" +
                "description='" + description + '\'' +
                '}';
    }
}
