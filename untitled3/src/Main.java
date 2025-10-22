public class Main {
    // Метод проверки задания 1
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
    // Метод проверки задания 2
    public static String checkDevice(int deviceCode, int currentYear) {
        final int referencePointYEAR = 2015;
        String os;
        if (deviceCode == 0) {
            os = "iOS";
        } else if (deviceCode == 1) {
            os = "Android";
        } else {
            throw new IllegalArgumentException("Неизвестный код устройства: " + deviceCode);
        }
        if (currentYear < referencePointYEAR) {
            return "Установите облегченную версию приложения для " + (os);
        } else {
            return "Установите обычную версию приложения для " + (os);
        }
    }
    // Метод проверки задания 3
    public static void printDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else {
            System.out.println("Доставки нет!");
        }
    }
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int year = 2021;
        if (leapYear(year)) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - не високосный год.");
        }

        // Задание 2
        System.out.println("Задание 2");
        int deviceOs = 0; // 0 — iOS, 1 — Android
        int checkingYear = 2014;
        System.out.println(checkDevice(deviceOs, checkingYear));

        //Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        printDeliveryDays(deliveryDistance);

    }
}

