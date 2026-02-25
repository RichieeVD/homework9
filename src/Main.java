public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientOS = 0; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }

        // Задача 2
        clientOS = 0; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 3
        int year = 2021;

        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 0) {
            // 1. Проверка на неверный ввод (просьба Ирины)
            System.out.println("Неверный ввод");
        } else if (deliveryDistance <= 20) {
            // 2. До 20 км — 1 день
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 60) {
            // 3. От 20 до 60 км — 2 дня
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 100) {
            // 4. От 60 до 100 км — 3 дня
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            // 5. Всё, что больше 100 км
            System.out.println("Доставки нет");
        }

        // Задача 5
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон: Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон: Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон: Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон: Осень");
                break;
            default:
                System.out.println("Такого месяца не существует (введите число от 1 до 12)");
        }
    }
}