public class Main {
        public static void main(String[] args) {
            int totalPaintCans = 120;
            int whitePaintPerClass = 2;
            int brownPaintPerClass = 4;
            int totalPaintPerClass = whitePaintPerClass + brownPaintPerClass;
            int numberOfClasses = totalPaintCans / totalPaintPerClass;
            int totalWhitePaint = whitePaintPerClass * numberOfClasses;
            int totalBrownPaint = brownPaintPerClass * numberOfClasses;
            System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");
        }
    }