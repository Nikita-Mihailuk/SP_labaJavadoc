/**
 * Класс человека
 * @autor Никита Михайлюк
 * @version 1
 */
public class Person {
    /** Поле имя */
    String name;
    /** Поле фамилия */
    String surname;
    /** Поле год рождения */
    int birthYear;

    /** Конструктор для класса */
    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    /** Метод вывода информации */
    public void displayInfo(){
        System.out.println("Человек: " + name + " " + surname + ", год рождения: " + birthYear);
    }
}

/**
 * Основной класс программы
 * @autor Никита Михайлюк
 * @version 1
 */
class Main {
    /** Метод вычисления суммы */
    public int sum(int a, int b) {
        return a+b;
    }
    /** Метод вычисления разности */
    public int sub(int a, int b) {
        return a-b;
    }
}