import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        switch (str) {
            case "gryffindor":
                System.out.println("bravery");
                break;
            case "hufflepuff":
                System.out.println("loyalty");
                break;
            case "slytherin":
                System.out.println("cunning");
                break;
            case "ravenclaw":
                System.out.println("intellect");
                break;
            default:
                System.out.println("not a valid house");
        }
    }
}

/*
Гарри Поттеру нужна помощь в определении значения каждого факультета.

Прочитайте строку, представляющую собой название дома, и выведите следующее:

    Если это "гриффиндор", выведите "храбрость";

    Если это "хаффлпафф", выведите "лояльность";

    Если это "Слизерин", выведите "хитрый";

    Если это "Ravenclaw", выведите "Intellect";

    В противном случае, вывести сообщение «недействительный дом».
 */