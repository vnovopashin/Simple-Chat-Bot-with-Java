import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        if (x <= 0) {
          return  f1(x);
        }
        if (x > 0 && x < 1) {
           return f2(x);
        }
        if(x >= 1) {
           return f3(x);
        }
        return 0;
    }

    //implement your methods here
    public static double f1(double x) {
        return x * x + 1;
    }

    public static double f2(double x) {
        return 1 / (x * x);
    }

    public static double f3(double x) {
        return x * x - 1;
    }
}
/*
Вот математическая функция, которую Кейт хочет использовать в своей программе:

f(x)={x²+1, если x≤0; x², если 0<x<1; x²−1, если x≥1; f(x)=⎩
⎨
⎧ x²+11/x²x²−1 если x≤0 если 0<x<1 если x≥1

Ниже приведено описание шаблона для этой функции. Давайте разложим его на составляющие!

Ваша задача — создать три дополнительных метода f1, f2 и f3 для каждого случая и завершить метод f.
Каждый метод должен принимать в качестве аргумента x с типом double.


 */