import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightBus = scanner.nextInt();
        int countBridge = scanner.nextInt();
        int crashBridge = 0;

        for (int i = 1; i <= countBridge; i++) {
            int heightBridge = scanner.nextInt();
            if (heightBridge <= heightBus) {
                crashBridge = i;
                break;
            }
        }

        if (crashBridge == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + crashBridge);
        }
    }
}

/*
Автобусный тур по Европе прошел очень успешно.
В связи с увеличением числа желающих отправиться в тур, туристическая компания решила увеличить высоту автобуса.
Новая высота автобуса составляет ровно N сантиметров.

Но маршрут экскурсии проходит под множеством мостов, и есть вероятность, что автобус врежется в один из них.
Можете ли вы выяснить, произойдет ли это?

Первая строка входных данных содержит высоту автобуса и количество мостов, под которыми он проезжает.
Вторая строка содержит высоту этих мостов.

Если всё будет в порядке, следует вывести сообщение "Не разобьётся";
в противном случае — сообщение "Разобьётся на мосту i" (где i — номер моста),
в который врежется автобус.
Если высота моста равна высоте автобуса, автобус разобьётся.

 Sample Input 1:
234 8
465 453 981 463 1235 871 475 981

Sample Output 1:
Will not crash

Sample Input 2:
211 5
871 205 123 871 1681

Sample Output 2:
Will crash on bridge 2
 */