class Time {

    int hours;
    int minutes;
    int seconds;

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this(hours, minutes);
        this.seconds = seconds;
    }
}
/*
Вот класс с именем Time, имеющий три поля: часы, минуты и секунды.

Добавьте в класс три конструктора:

    Первый процесс занимает всего несколько часов и инициализирует это поле;
    Второй процесс занимает часы и минуты и инициализирует соответствующие поля;
    Третий процесс занимает часы, минуты и секунды и инициализирует все поля.

Не делайте поля и конструкторы приватными.
 */