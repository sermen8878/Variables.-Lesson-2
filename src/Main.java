public class Main {
        public static void main(String[] args) {
            int bananasCount = 5;
            int bananaWeight = 80;
            int totalBananaWeight = bananasCount * bananaWeight;

            int milkVolume = 200;
            double milkWeightPer100ml = 105;
            double totalMilkWeight = milkVolume * (milkWeightPer100ml / 100);

            int iceCreamCount = 2;
            int iceCreamWeight = 100;
            int totalIceCreamWeight = iceCreamCount * iceCreamWeight;

            int eggsCount = 4;
            int eggWeight = 70;
            int totalEggsWeight = eggsCount * eggWeight;
            double totalWeightGrams = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
            double totalWeightKilograms = totalWeightGrams / 1000;
             System.out.println("Вес спортзавтрака: " + totalWeightGrams + " грамм или " + totalWeightKilograms + " килограмм.");
        }
    }