package com.java.gb.vtb.hw2;

public class HomeWork2 {
    public static void main(String[] args) {

        ComeOverObstacle runners[] = {
                new Human(1.3, 1000.0),
                new Cat(0.5, 300.0),
                new Cyborg(3.0, 5000.0)
        };

        Obstacle obstacles[] = {
                new Wall(0.1),
                new Treadmill(200.0),
                new Wall(0.5),
                new Treadmill(500.0),
                new Wall(1.5),
                new Treadmill(1200.0),
                new Wall(3.5),
                new Treadmill(8000.0)
        };

        for (ComeOverObstacle runner : runners){
            for(Obstacle obstacle : obstacles){
//                runner.comeOver(obstacle);
                if(!obstacle.isPassed(runner)){
                    break;
                }
            }
        }


        // show enum
//        for(Enum<SolarSystem> s : SolarSystem.values()){
//            System.out.println(s.toString());
//        }
    }
}
