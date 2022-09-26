package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._5_nested_classes._2_static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int privateParamA;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        //1. Доступ к статик полю static nested класса
        System.out.println(Engine.countOfObjects);
        //2. Доступ к прайвед non-static полю static nested класса
        Engine eng = new Engine(200);
        System.out.println(eng.horsePower);
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println("privateParamA = " + privateParamA);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
