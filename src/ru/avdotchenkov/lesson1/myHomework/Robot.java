package ru.avdotchenkov.lesson1.myHomework;

public class Robot implements Participant {
    private final String name;
    private final int jumpHeight;
    private final int runLength;

    public Robot(String name, int jumpHeight, int runLenght) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLenght;
    }


    @Override
    public int runDistance() {
        System.out.printf("Robot %s способен пробежать %d%n", this.name, this.runLength);
        return this.runLength;
    }

    @Override
    public int jumpHeight() {
        System.out.printf("Robot %s способен прыгнуть %d%n", this.name, this.jumpHeight);
        return this.jumpHeight;
    }

    @Override
    public int swimDistance() {
        System.out.printf("Robot %s способен проплыть %d%n", this.name, 30);
        return 30;
    }


    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", runLenght=" + runLength +
                '}';
    }
}
