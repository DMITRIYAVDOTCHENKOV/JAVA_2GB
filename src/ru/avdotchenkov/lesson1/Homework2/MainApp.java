package ru.avdotchenkov.lesson1.Homework2;

public class MainApp {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Wall(), new Cross(), new Cross()
        };
        Participan[] participans = {
                new Cat(), new Human()
        };
        for (Participan participan : participans) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(participan);
            }
        }
    }
}
