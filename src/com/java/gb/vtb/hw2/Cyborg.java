package com.java.gb.vtb.hw2;

public class Cyborg implements ComeOverObstacle{
    private Double limitForJump;
    private Double limitForRun;

    public Cyborg(Double limitForJump, Double limitForRun) {
        this.limitForJump = limitForJump;
        this.limitForRun = limitForRun;
    }

    public boolean jump(Obstacle obstacle){
        if(limitForJump >= obstacle.getObstacleValue()){
            System.out.println(this.getClass().getSimpleName() + " jumped for " + obstacle.getObstacleValue() + " m.");
            return true;
        } else {
            System.out.println(this.getClass().getSimpleName() + " didn't jump for " + obstacle.getObstacleValue() + " m., because of limit for height - " + this.limitForJump + " m.");
            return false;
        }
    }

    public boolean run(Obstacle obstacle) {
        if(limitForRun >= obstacle.getObstacleValue()){
            System.out.println(this.getClass().getSimpleName() + " run for " + obstacle.getObstacleValue() + " m.");
            return true;
        } else {
            System.out.println(this.getClass().getSimpleName() + " didn't run for " + obstacle.getObstacleValue() + " m., because of limit for distance - " + this.limitForRun + " m.");
            return false;
        }
    }

    @Override
    public boolean comeOver(Obstacle obstacle) {
        if(obstacle instanceof Wall){
            return jump(obstacle);
        } else {
            return run(obstacle);
        }
    }
}
