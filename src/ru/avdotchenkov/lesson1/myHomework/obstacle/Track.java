package ru.avdotchenkov.lesson1.myHomework.obstacle;

import ru.avdotchenkov.lesson1.myHomework.Participant;

public class Track implements Obstacle {

    private final int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.runDistance() > this.distance) {
            System.out.printf("Участник %s успешно пробежал дистанцию %d%n", participant, this.distance);
            return true;
        } else {
            System.out.printf("Участник %s не справился с дистанцией %d%n", participant, this.distance);
            return false;
        }
    }
}
