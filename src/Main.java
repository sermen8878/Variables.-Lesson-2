public class Main {
        public static void main(String[] args) {
            int bottlesPerMinute = 8;
            int bottlesIn20Minutes = bottlesPerMinute * 20;
            System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок.");
            int bottlesPerDay = bottlesPerMinute * 1440;
            System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок.");
            int bottlesIn3Days = bottlesPerDay * 3;
            System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок.");

        }
    }