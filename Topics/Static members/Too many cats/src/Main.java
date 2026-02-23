class Cat {

    // write static and instance variables
    public String name;
    public int age;
    public static int counter;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        this.name = name;
        this.age = age;
        if (++counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}
/*
Давайте посчитаем кошек! Реализуйте класс с именем Cat и статический метод getNumberOfCats.

Вот некоторые особенности этого класса:

    Класс Cat имеет два поля экземпляра: строковое имя и целочисленное значение возраста,
    а также одно статическое целочисленное поле counter. Статическое поле counter позволяет узнать, сколько кошек уже было создано.
    Класс должен иметь конструктор для инициализации полей экземпляра. Во время инициализации нового кота значение статического поля counter должно увеличиваться.
    Если counter > 5, в System.out должно быть выведено сообщение "У вас слишком много котов".

Ваш статический метод getNumberOfCats возвращает текущее количество созданных кошек и не выводит никаких сообщений.

Взгляните на пример:

Предположим, что уже создано семь экземпляров класса Cat. Тогда правильно реализованный метод Cat.getNumberOfCats() должен возвращать 7.

Обратите внимание, что сообщение «У вас слишком много кошек» должно появиться дважды:
первый раз при создании шестой кошки и второй раз при создании седьмой.

Используйте предоставленный шаблон и не делайте класс приватным.
 */