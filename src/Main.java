public class Main {
        public static void main(String[] args) {
            // Объявляем переменные
            int ludmilaStudents = 23;
            int annaStudents = 27;
            int ekaterinaStudents = 30;
            int totalPaper = 480;
            int totalStudents = ludmilaStudents + annaStudents + ekaterinaStudents;
            double paperPerStudent = (double) totalPaper / totalStudents;
            System.out.printf("На каждого ученика рассчитано %.1f листов бумаги%n", paperPerStudent);


        }
    }