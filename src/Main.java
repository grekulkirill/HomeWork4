public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-2");

        System.out.println("Задание 1");

        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием !");
        } else {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        System.out.println("Задание 2");

        int ageKid = 24;
        if (ageKid >= 7 && ageKid < 18) {
            System.out.println("ребенок ходит в школу");
        } else if (ageKid >= 18 && ageKid < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else if (ageKid >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("Задание 3");

        int totalPassages = 102;
        int seatPassages = 60;
        int standPassages = totalPassages - seatPassages;

        int seatUsed = 60;
        int standUsed = 41;
        if (seatUsed<seatPassages) {
            System.out.println("Есть ещё " + (seatPassages-seatUsed) + " сидячих мест");
        } else  {
            System.out.println(" сидячих мест нет");
        }
        if (standUsed<standPassages) {
            System.out.println("Есть ещё " + (standPassages-standUsed) + " стоячих мест");
        } else {
            System.out.println("стоячих мест нет");
        }

        System.out.println("ДЗ-3");

        System.out.println("Задание 1");

        int yearsOld =8;
        if (yearsOld>=2 && yearsOld<=6) {
            System.out.println(" Если возраст человека равен " +yearsOld+ " , то ему нужно ходить в детский сад ");
        } else if (yearsOld>=7 && yearsOld<=18) {
            System.out.println(" Если возраст человека равен " +yearsOld+ " , то ему нужно ходить в школу ");
        } else if (yearsOld>18 && yearsOld<=24) {
            System.out.println(" Если возраст человека равен " + yearsOld + " , то его место в университете ");
        } else if (yearsOld>24) {
            System.out.println(" Если возраст человека равен " + yearsOld + " , то ему пора ходить на работу ");
        }

        System.out.println("Задание 2");

        if (yearsOld<5) {
            System.out.println(" Ребёнок не может кататься на аттракционе");
        } else if (yearsOld>=5 && yearsOld<14) {
            System.out.println("Ребёнок может кататься только в сопровождении взрослого");
        } else if (yearsOld>=14) {
            System.out.println("Ребёнок может кататься без сопровождения взрослого");
        }

        System.out.println("Задание 3");

        int one=99;
        int two=33;
        int three=66;
        if (one>two) {
            if (one > three) {
                System.out.println("Максимальное число " + one);
            } else if (three > one) {
                System.out.println("Максимальное число " + three);
            } else {
                System.out.println("Числа " + one + " и "+ three+ " равны");
            }
        } else if (two>one) {
            if (two > three) {
                System.out.println("Максимальное число " + two);
            } else if (three > two) {
                System.out.println("Максимальное число " + three);
            } else {
                System.out.println("Числа " + two + " и "+ three+ " равны");
            }
        } else {
            if (one>three) {
                System.out.println("Максимальное число " + one);
            } else if (three>one) {
                System.out.println("Максимальное число "+ three);
            } else {
                System.out.println("Все числа равны");
            }
        }



    }
}