public class Main {

    public static void main(String[] args) {
        task1();
        task2();
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
    }
