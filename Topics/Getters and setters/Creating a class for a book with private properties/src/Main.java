import java.util.Scanner;

// Creating class
class Book {
    // set up three private properties
    private String title;
    private String author;
    private int numberOfPages;
    // getters and setters go here

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (!author.isEmpty()) {
            this.author = author;
        }
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        }
    }

    // Remember:
    // 1. They must not allow empty string for 'title' and 'author'.
    // 2. They must not allow negative or zero value for 'numberOfPages'.
    // 3. If such values are attempted to be set, the property should remain unchanged.
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Book class
        Book book = new Book();

        // Take Title, Author and numberOfPages as next inputs and set them using the mutator methods
        // Your code here
        book.setTitle(scanner.nextLine());
        book.setAuthor(scanner.nextLine());
        book.setNumberOfPages(scanner.nextInt());
        // Then use the accessor methods to get and print these values.
        // Your code here
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());
        scanner.close();
    }
}
/*
Создайте класс по умолчанию с именем «Book», представляющий книгу в библиотеке.
Класс должен содержать три приватных свойства: «title» (строка), «author» (строка) и «numberOfPages» (целое число).
Класс также должен содержать публичные методы для установки (метод изменения) и получения (метод доступа) этих свойств.
Методы изменения не должны позволять устанавливать пустую строку для «title» и «author»,
или отрицательное или нулевое значение для «numberOfPages».
Вместо этого, если будет предпринята попытка установить такое значение, методы должны сохранять свойства без изменений.
После создания класса создайте объект этого класса, установите свойства с помощью методов изменения и получите значения с помощью методов доступа.
Примите три строки ввода: первая строка — строка (title), вторая строка — также строка (author), и третья строка — целое число (numberOfPages).
Вывод должен представлять собой три строки, печатающие заголовок, автора и количество страниц в том же порядке.
 */