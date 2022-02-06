package ru.avdotchenkov.lesson1.myHowework;

public class Man implements Participant {
    private final String name;
    private final int jumpHeight;
    private final int runLength;


    public Man(String name, int jumpHeight, int runLength) {
        super();
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public int runDistance() {
        System.out.printf("Man %s способен пробежать %d%n", this.name, this.runLength);
        return runLength;
    }

    @Override
    public int jumpHeight() {
        System.out.printf("Man %s способен прыгнуть %d%n", this.name, this.jumpHeight);
        return jumpHeight;
    }

    @Override
    public int swimDistance() {
        System.out.printf("Human %s способен проплыть %d%n", this.name, 100);
        return 100;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", runLength=" + runLength +
                '}';
    }
}
