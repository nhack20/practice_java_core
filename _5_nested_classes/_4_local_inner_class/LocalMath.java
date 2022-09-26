package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._5_nested_classes._4_local_inner_class;

public class LocalMath {
    private int a = 10;

    public void getResult() {
        final int delimoe = 21; //но работает и без final
                                //effectevly final - после задания переменной ее зн-е не меняется

        class Delenie {
            //private int delimoe;
            private int delitel;

//            public int getDelimoe() {
//                return delimoe;
//            }

//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getResultDelenia() {
                return delimoe / delitel;
            }

            public int getOstatokOtDelenia() {
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        //delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("delimoe = " + delimoe);
        System.out.println("delitel = " + delenie.getDelitel());
        System.out.println("result delenia = " + delenie.getResultDelenia());
        System.out.println("ostatok ot delenia = " + delenie.getOstatokOtDelenia());
        System.out.println("private param a: " + a);
    }

    public void getResult(final int delimoe, final int delitel) {
        class Delenie {
            public int getResultDelenia() {
                return delimoe / delitel;
            }

            public int getOstatokOtDelenia() {
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        System.out.println("delimoe = " + delimoe);
        System.out.println("delitel = " + delitel);
        System.out.println("result delenia = " + delenie.getResultDelenia());
        System.out.println("ostatok ot delenia = " + delenie.getOstatokOtDelenia());
        System.out.println("private param a: " + a);
    }
}
