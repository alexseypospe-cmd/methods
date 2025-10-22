public class Main {
    // Метод проверки задания 1

    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - не високосный год.");
        }
    }

    // Метод проверки задания 2
    public static void printCheckDevice(int deviceCode, int currentYear) {
        final int referencePointYear = 2015;
        String os;
        if (deviceCode == 0) {
            os = "iOS";
        } else if (deviceCode == 1) {
            os = "Android";
        } else {
            throw new IllegalArgumentException("Неизвестный код устройства: " + deviceCode);
        }
        if (currentYear < referencePointYear) {
            System.out.println("Установите облегченную версию приложения для " + os);
        } else {
            System.out.println("Установите обычную версию приложения для " + os);
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
        printLeapYear(year);

        // Задание 2
        System.out.println("Задание 2");
        int deviceOs = 0; // 0 — iOS, 1 — Android
        int checkingYear = 2014;
        printCheckDevice(deviceOs, checkingYear);

        //Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        printDeliveryDays(deliveryDistance);

    }
}

