package org.oop;

public class Plan implements Comparable<Plan>{
    public String ownerName;
    protected int chanceToWin;
    private  CheckPoints checkPoints;

    public Plan(String ownerName, int chanceToWin) {
        this.ownerName = ownerName;
        this.chanceToWin = chanceToWin;
        this.checkPoints = new CheckPoints();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getChanceToWin() {
        return chanceToWin;
    }

    public void setChanceToWin(int chanceToWin) {
        this.chanceToWin = chanceToWin;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "ownerName='" + ownerName + '\'' +
                ", chanceToWin=" + chanceToWin +
                ", checkPoints=" + checkPoints +
                '}';
    }

    @Override
    public int compareTo(Plan plan){

        if (plan == null) return -1;

        int result=2;

        if (this.chanceToWin > plan.getChanceToWin()) result = 1;
        if (this.chanceToWin == plan.getChanceToWin()) result = 0;
        if (this.chanceToWin < plan.getChanceToWin()) result = -1;

        return result;
    }
}
