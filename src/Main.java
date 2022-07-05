public class Main {
    public static void main(String[] args) {
        int ticket = 600; //вводится стоимость билета
        int value = 20; //количество рублей за милю
        int bonus = ticket/value;

        System.out.println(bonus + " бонусных(ая) миль(и) начисленны(а)");
    }
}