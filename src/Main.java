public class Main {
        public static void main(String[] args) {
            int targetWeightLoss = 7000;
            int lossPerDayMin = 250;
            int lossPerDayMax = 500;
            int daysMinLoss = targetWeightLoss / lossPerDayMin;
            int daysMaxLoss = targetWeightLoss / lossPerDayMax;
            int averageDays = (daysMinLoss + daysMaxLoss) / 2;
            System.out.println("Если спортсмен будет терять по 250 грамм в день, то на похудение уйдет " + daysMinLoss + " дней.");
            System.out.println("Если спортсмен будет терять по 500 грамм в день, то на похудение уйдет " + daysMaxLoss + " дней.");
            System.out.println("В среднем может потребоваться " + averageDays + " дней для достижения результата.");
        }
    }