public class Main {
    //Задача 1
//Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
//Эту проверку вы уже реализовывали в задании по условным операторам.
    public static String isLeapYear (int year){
        String isLeapYear;
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (leapYear == true){
            isLeapYear = year + " год является высокосным";
        }else{
            isLeapYear = year + " год не является высокосным";
        }
        return isLeapYear;
    }

//Задача 2
//Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
//Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
    public static String getMessage(int operSystem, int year){
        String message = "";
        if (operSystem == 0 && year < 2015){
            message = message + "Установите облегченную версию приложения для iOS по ссылке";
        }else if (operSystem == 0 && year >= 2015){
            message = message + "Установите приложение для iOS по ссылке";
        }else if (operSystem == 1 && year < 2015){
            message = message + "Установите облегченную версию приложения для Android по ссылке";
        }else if (operSystem == 1 && year >= 2015){
            message = message + "Установите приложение для Android по ссылке";
        }
        return message;
    }

/*Задача 3.
Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
Свыше 100 км доставки нет.
Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
*/
    public static String getdeliveryDays(int deliveryDistanse){
        int deliveryDays = 1;
        if (deliveryDistanse > 20){
            deliveryDays = deliveryDays + 1;
        }if(deliveryDistanse > 60){
            deliveryDays = deliveryDays + 1;
        }
        String message = "";
        if (deliveryDistanse <= 100){
            message = message + "Потребуется дней доставки: " + deliveryDays;
        }else{
            message = message + "доставка на расстояние больше 100 км. не осуществляется";
        }
        return message;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(getMessage(0, 2013));
        System.out.println(getdeliveryDays(95));
    }
}