public class Main {
    public static void main(String[] args) {


        System.out.println("Task1");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("ведите праильно цифру");


        System.out.println("Task2");


        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");

            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");

            } else
                System.out.println("ведите праильно цифру");
        }

        System.out.println("Task3");


        int year = 2025;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год высоскосный");
        } else
            System.out.println(year + " Год не высоскосный");


        System.out.println("Task4");


        int deliveryDistance = 10195;

        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            System.out.println("Потребуется 1 день ");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня ");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня ");
        } else {
            System.out.println("Свыше 100 доствки нет");
        }


        System.out.println("Task5");


        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Феврль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}

