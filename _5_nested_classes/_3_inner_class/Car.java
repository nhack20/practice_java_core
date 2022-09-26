package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._5_nested_classes._3_inner_class;

public class Car {
    String color;
    private int doorCount;
    Engine engine;

    public Car(String color, int doorCount/*, int horsePower*/) {
        Engine e = new Engine(215);
        System.out.println(e.horsePower);
        this.color = color;
        this.doorCount = doorCount;
        //this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(doorCount);
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
