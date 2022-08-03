import java.time.LocalDate;

public class Main {

    static int currentYear = LocalDate.now().getYear();

    public static int leapYear (int year){
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + "  — не високосный год");
        }
        return currentYear;
    }

    public static void installVersion (int a) {
        if (a == 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (a == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (a == 1 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (a == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваше устройство не поддерживается ни одной из версий");
        }
    }

    public static int deliveryDays (int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (distance >= 20 && distance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (distance >= 60 && distance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Нету доставки");
        }
        return distance;
    }


    public static void main(String[] args) {

        leapYear(currentYear);


        int clientOs = 0;
        installVersion(clientOs);


        int deliveryDistance = 95;
        deliveryDays (deliveryDistance);


    }
}