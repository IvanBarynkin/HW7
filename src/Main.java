public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задача №1_______");
        int goal = 2459000;
        short payment = 15000;
        int sum = 0;
        int month;
        while (sum < goal) {
            sum += payment;
            month = sum / payment;
            System.out.println("Месяц " + month + ", сумма накполений равна " + sum + " рублей.");
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
        while (sumTwo < 12000000) {
            monthTwo += 1;
            sumTwo = (int) (sumTwo * 1.07f);
            System.out.println("Месяц " + monthTwo + ", сумма накполений равна " + sumTwo + " рублей.");
        }
        System.out.println();

        System.out.println("_______Задача №5_______");
        int sumThree = 15000;
        short monthThree = 0;
        while (sumThree < 12000000) {
            monthThree += 1;
            sumThree = (int) (sumThree * 1.07f);
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
            sumFour = (int) (sumFour * 1.07f);
            if (monthFour % 6 == 0) {
                System.out.println("Месяц " + monthFour + ", сумма накполений равна " + sumFour + " рублей.");
            }
        }
        System.out.println();

        System.out.println("_______Задача №7_______");
        int friday = 4;
        for (int l = friday; l <= 31; l++) {
            if ((l - friday) % 7 == 0) {
                System.out.println("Сегондя пятница, " + l + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println();

        System.out.println("_______Задача №8_______");
        int startYear = 2053;
        int m = 0;
        int firstYear;
        while ((startYear - 200 + m) % 79 != 0) {
            m++;
        }
        firstYear = startYear - 200 + m;
        while (firstYear < startYear + 100) {
            System.out.println(firstYear);
            firstYear += 79;
        }

    }
}
