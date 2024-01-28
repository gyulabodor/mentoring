package org.oop;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<CheckPointA> cpList = new ArrayList();

        CheckPointA cp1 = new CheckPointA(false,"Jhon");
        CheckPointA cp2 = new CheckPointA(true,"Helga");
        CheckPointA cp3 = new CheckPointA(false,"Bazz");
        CheckPointA cp4 = new CheckPointA(true,"Bar");


        cpList.add(cp1);
        cpList.add(cp2);
        cpList.add(cp3);
        cpList.add(cp4);

        String atext = "laéksdas";
        String btext = "laasdéksdas";

        atext.compareTo(btext);

        BaseCheckPoint baseCheckPointList[] = new BaseCheckPoint[10];

        baseCheckPointList[0] = cp1;
        baseCheckPointList[1] = cp3;
        baseCheckPointList[2] = cp4;
        baseCheckPointList[3] = cp2;

         for (int i=0; i <baseCheckPointList.length; i++){
             System.out.println(baseCheckPointList[i]);
         }
    }
}

/*
    CheckPoints checkList = new CheckPoints();
        System.out.println(checkList.toString());

                Plan planA = new Plan("A",100);
                Plan planB = new Plan("B", 70);
                System.out.println("Result: " + planA.compareTo(planB));

                planA.setChanceToWin(10);
                planB.setChanceToWin(10);
                System.out.println("Result: " + planA.compareTo(planB));

                planA.setChanceToWin(10);
                planB.setChanceToWin(80);
             System.out.println("Result: " + planA.compareTo(planB));*/