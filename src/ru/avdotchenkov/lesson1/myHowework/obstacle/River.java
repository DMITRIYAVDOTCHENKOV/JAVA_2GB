package ru.avdotchenkov.lesson1.myHowework.obstacle;

import ru.avdotchenkov.lesson1.myHowework.Participant;

public class River implements Obstacle {

    private final int width;

    public River(int width) {
        this.width = width;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        return participant.swimDistance() >= this.width;
    }
}
