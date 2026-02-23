abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}

// declare and implement your classes here
class Addition extends IntBinaryOperation {
    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg + secondArg;
    }
}

class Multiplication extends IntBinaryOperation {
    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg * secondArg;
    }
}
/*
Вам предоставляется абстрактный класс IntBinaryOperation .
В нем есть один абстрактный метод perform() и два поля, представляющие аргументы операции. Поля инициализируются в конструкторе.
Смотрите предоставленный шаблон кода.

Вам необходимо объявить и реализовать два класса, представляющих конкретные операции: сложение и умножение.
Классы должны расширять абстрактный класс и реализовывать метод perform() .
Реализации должны работать в соответствии с именем класса. Не забудьте написать в своих классах конструкторы с двумя аргументами.

НЕ делайте свои классы общедоступными.
 */