public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte clientOperatingSystem = 0;
        if (clientOperatingSystem == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.\n");
        } else if (clientOperatingSystem == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.\n");
        } else {
            System.out.println("Неверное значение.\n");
        }

        System.out.println("Задача 2");
        byte clientOperatingSystem1 = 1;
        int clientDeviceYear = 2015;
        if (clientOperatingSystem1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.\n");
        } else if (clientOperatingSystem1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке.\n");
        } else if (clientOperatingSystem1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.\n");
        } else if (clientOperatingSystem1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке.\n");
        }

        System.out.println("Задача 3");
        int year = 2021;
        if (year > 1584 && (year % 4 == 0 && (year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным.\n");
        } else {
            System.out.println(year + " год не является високосным.\n");
        }

        System.out.println("Задача 4");
        byte deliveryDistance = 95;
        byte daysDelivery20 = 1;
        byte daysDelivery60 = 2;
        byte daysDelivery100 = 3;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + daysDelivery20 + ".\n");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + daysDelivery60 + ".\n");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + daysDelivery100 + ".\n");
        } else {
            System.out.println("Доставки нет.\n");
        }

        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.\n");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.\n");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.\n");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.\n");
                break;
            default:
                System.out.println("Неверное значение.\n");
        }
    }
}