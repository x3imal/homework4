public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }


        public static void task1 () {
            int age = 19;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
            }
            if (age < 18) {
                System.out.println("Если возраст человека равен " + age + ", то он несовершеннолетний.");
            }
        }
    public  static void task2() {
        int temp = 6;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градуса, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
    }
    public static void task3() {
        int speed = 120;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
        }
    }
    public static void task4() {
        int age = 25;
        boolean canToGoKindergarten = age >= 2 && age <= 6;
        if (canToGoKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");}
        boolean canToGoToSchool = age >= 7 && age <= 18;
        if (canToGoToSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");}
        boolean canToGoToUniversity = age > 18 && age < 24;
        if (canToGoToUniversity) {
            System.out.println("Если возраст человка равен " + age + ", то ему нужно ходить в университет");}
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }
    public static void task5() {
        int age = 2;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционах");
        }
        boolean ageKids = age >= 5 && age <= 14;
        if (ageKids) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционах только в сопровождении зврослых");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься без сопровождения");
        }
    }
    public static void task6() {
        int people = 99;
        if (people >= 60 && people <= 101) {
            System.out.println("Сидячих мест нет, но есть стоячие");
        } else if (people < 60) {
            System.out.println("Есть сидячие и стоячие места");
        } else if (people >= 102) {
            System.out.println("Мест нет");
        }
    }
    }
