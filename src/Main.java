public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задача №1_______");
        int goal = 2_459_000;
        short payment = 15000;
        double sum = 0;
        int month = 1;
        int monthInYear = 12;
        double percentPerYear = 12f;
        double percentFactor = 1+(percentPerYear/monthInYear)/100;
        while (sum < goal) {
            sum += payment;
            sum = sum * percentFactor;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.\n", month, sum);
            month ++;
        }
        System.out.println();

        System.out.println("_______Задача №2_______");
        byte i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("_______Задача №3_______");

        int humans = 12000000;
        float aliveHumans = 17 / 1000f;
        float deadHumans = 8 / 1000f;
        for (int year = 1; year <= 10; year++) {
            humans += (int) ((aliveHumans - deadHumans) * humans);
            System.out.println("Год " + year + ", численность населения составляет " + humans + " человек.");
        }
        System.out.println();

        System.out.println("_______Задача №4_______");

        int sumTwo = 15000;
        short monthTwo = 0;
        float percentPerMonth = 1.07f;
        while (sumTwo < 12000000) {
            monthTwo += 1;
            sumTwo = (int) (sumTwo * percentPerMonth);
            System.out.println("Месяц " + monthTwo + ", сумма накполений равна " + sumTwo + " рублей.");
        }
        System.out.println();

        System.out.println("_______Задача №5_______");
        int sumThree = 15000;
        short monthThree = 0;
        while (sumThree < 12000000) {
            monthThree += 1;
            sumThree = (int) (sumThree * percentPerMonth);
            if (monthThree % 6 == 0) {
                System.out.println("Месяц " + monthThree + ", сумма накполений равна " + sumThree + " рублей.");
            }
        }
        System.out.println();

        System.out.println("_______Задача №6_______");
        int sumFour = 15000;
        byte monthFour = 0;
        byte years = 9;
        byte monthsInYears = 12;
        while (monthFour < years * monthsInYears) {
            monthFour += 1;
            sumFour = (int) (sumFour * percentPerMonth);
            if (monthFour % 6 == 0) {
                System.out.println("Месяц " + monthFour + ", сумма накполений равна " + sumFour + " рублей.");
            }
        }
        System.out.println();

        System.out.println("_______Задача №7_______");
        int friday = 4;
        int daysInMonth = 31;
        final int daysInWeek = 7;
        for (int l = friday; l <= daysInMonth; l++) {
            if ((l - friday) % daysInWeek == 0) {
                System.out.println("Сегондя пятница, " + l + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println();

        System.out.println("_______Задача №8_______");
        int yearSeeing = 0;
        int period = 79;
        int startYear = 2024;
        int firstYear = startYear - 200;
        int lastYear = startYear + 100;
        for (int year2 = yearSeeing; year2 < lastYear; year2 += period) {
            if (year2 > firstYear) {
                System.out.println(year2);
            }
        }
    }
}
