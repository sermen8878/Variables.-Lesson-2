public class Main {
        public static void main(String[] args) {

            double mashasSalary  = 67760;
            double denisSalary = 83690;
            double kristinasSalary = 76230;


            double mashasNewSalary = mashasSalary * 1.10;
            double denisNewSalary = denisSalary * 1.10;
            double kristinasNewSalary = kristinasSalary * 1.10;


            double mashasAnnualIncomeBefore = mashasSalary * 12;
            double denisAnnualIncomeBefore = denisSalary * 12;
            double kristinasAnnualIncomeBefore = kristinasSalary * 12;


            double mashasAnnualIncomeAfter = mashasNewSalary * 12;
            double denisAnnualIncomeAfter = denisNewSalary * 12;
            double kristinasAnnualIncomeAfter = kristinasNewSalary * 12;

            double mashasDifference = mashasAnnualIncomeAfter - mashasAnnualIncomeBefore;
            double denisDifference = denisAnnualIncomeAfter - denisAnnualIncomeBefore;
            double kristinasDifference = kristinasAnnualIncomeAfter - kristinasAnnualIncomeBefore;

            System.out.println("Маша теперь получает " + mashasNewSalary + " рублей. Годовой доход вырос на " + mashasDifference + " рублей.");
            System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей.");
            System.out.println("Кристина теперь получает " + kristinasNewSalary + " рублей. Годовой доход вырос на " + kristinasDifference + " рублей.");
        }
    }