public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием !");
        }
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        System.out.println("Задание 2");

        int ageKid = 24;
        if (ageKid >= 7 && ageKid < 18) {
            System.out.println("ребенок ходит в школу");
        }
        if (ageKid >= 18 && ageKid < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (ageKid >= 24) {
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
        }
        if (seatUsed==seatPassages) {
            System.out.println(" сидячих мест нет");
        }
        if (standUsed<standPassages) {
            System.out.println("Есть ещё " + (standPassages-standUsed) + " стоячих мест");
        }
        if (standUsed==standPassages) {
            System.out.println("стоячих мест нет");
        }







    }
}