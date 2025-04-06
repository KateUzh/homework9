public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] payments = {25_000, 17_333, 16_590, 65_010, 29_250};
        int sum = 0;
        for (int i : payments) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("\nЗадание 2");
        int[] payments2 = {20_000, 13_333, 16_500, 65_999, 159_200};
        int minPayments = payments2[0];
        int maxPayments = payments2[0];
        for (int i : payments2) {
            if (minPayments > i) {
                minPayments = i;
            }
            if (maxPayments < i) {
                maxPayments = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayments + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxPayments + " рублей.");
        System.out.println("\nЗадание 3");
        int[] payments3 = {25_025, 13_333, 160_061, 65_065, 99_999};
        sum = 0;
        for (int i : payments3) {
            sum += i;
        }
        double averagePayments = (double) sum / payments3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayments + " рублей");
        System.out.println("\nЗадание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0, j = reverseFullName.length - 1; i < j; i++, j--) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = temp;
        }
        System.out.println(reverseFullName);
    }
}