package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;
    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }
    public Error() {
        active = false;
        status = 303;
        message = "Не найдено";
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщения: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 403, "Выполнено");
        error1.printInfo();
        Error error2 = new Error(false, 404, "не правильная команда");
        error2.printInfo();

    }
}
