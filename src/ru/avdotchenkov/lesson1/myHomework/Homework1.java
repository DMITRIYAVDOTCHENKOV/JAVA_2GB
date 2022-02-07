package ru.avdotchenkov.lesson1.myHomework;


import ru.avdotchenkov.lesson1.myHomework.obstacle.Obstacle;
import ru.avdotchenkov.lesson1.myHomework.obstacle.River;
import ru.avdotchenkov.lesson1.myHomework.obstacle.Track;
import ru.avdotchenkov.lesson1.myHomework.obstacle.Wall;



import java.util.List;
import java.util.Random;

public class Homework1 {

    public static void main(String[] args) {
        System.out.println("Подготовительный этап");
        Competition competition = createAndPrepareCompetition();

        System.out.println("Начинаем соревнования");
        competition.startCompetition();

        List<Participant> lastWinners = competition.getLastWinners();
        if (!lastWinners.isEmpty()) {
            System.out.println("Победители: ");
            for (Participant lastWinner : lastWinners) {
                System.out.println(lastWinner);
            }
        } else {
            System.out.println("Никто не смог преодолеть дистанцию");
        }
    }

    private static Competition createAndPrepareCompetition() {
        Participant person = new Man("Олег", 2, 300);
        Participant cat = new Cat("Маркиз", 5, 50);
        Participant robot = new Robot("r2d2", 15, 500);

        Random random = new Random();

        Obstacle wall = new Wall(random.nextInt(1));
        Obstacle track = new Track(random.nextInt(1));
        Obstacle river = new River(1);

        Competition competition = new Competition("Олимпийский забег");
        competition.setObstacles(wall, track, river);
        competition.setParticipants(person, cat, robot);
        return competition;
    }
}
