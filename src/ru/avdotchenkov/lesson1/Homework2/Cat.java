package ru.avdotchenkov.lesson1.Homework2;

public class Cat implements Participan{
    private final String name;
    private final int run;
    private final int jump;

    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }


    @Override
    public void run(int distance) {

    }

    @Override
    public void jump(int height) {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", runDistance=" + run +
                ", jumpHeight=" + jump +
                '}';
    }
}
