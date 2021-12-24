package com.java.gb.vtb.hw2;

public abstract class Obstacle {
    Double obstacleValue;

    public Obstacle(Double obstacleValue) {
        this.obstacleValue = obstacleValue;
    }

    public Double getObstacleValue() {
        return obstacleValue;
    }

    public boolean isPassed(ComeOverObstacle comeOverObstacle){
        return comeOverObstacle.comeOver(this);
    }
}
