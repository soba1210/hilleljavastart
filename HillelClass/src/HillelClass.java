import java.util.Scanner;

public class HillelClass {
    public static void main(String[] args) {
        // 4ое задание
        System.out.println(Spramougolnic(1, 2));
        // 5ое задание
        System.out.println(Spramougolnic(7, 8));
        System.out.println(Spramougolnic(9, 10));
        //6ое задание
        System.out.println(Formulavstepen(5));
        System.out.println(Formulavstepen(-2));
        System.out.println(Formulavstepen(19));
        // 7ое задание
        System.out.println(Sindvounouugol(45));
        //8ое задание
        System.out.println(TretiaStorona(3, 4, 90));
        System.out.println(TretiaStorona(12, 5, 90));
        System.out.println(TretiaStorona(15, 16, 180));
        PArnost(-2);
        Stest(1.0, 2.0);
        Stest(2, 7);
        Promejutok(10000);
        System.out.println(Bolwe(100));

        try (Scanner op = new Scanner(System.in)) {
            double L1, L2;
            int L3;
            System.out.println("Введите первое число!!!");
            L1 = op.nextDouble();
            System.out.println("Введите второе число!!!");
            L2 = op.nextDouble();
            System.out.println("Введите третее число!!!");
            L3 = op.nextInt();
            if (L3 > 1) {
                System.out.println("Сумма первого и второго числа = " + (L1 + L2));
            } else {
                if (L3 == 1) {
                    System.out.println("Разница первого и второго числа = " + (L1 - L2));
                } else {
                    if (L3 == 0) {
                        System.out.println("Произведение первого и второго числа = " + (L1 * L2));
                    } else {
                        System.out.println("Деление первого и второго числа = " + (L1 / L2));
                    }
                }
            }
        }
    }

    public static int symma2(int a, int b) {
        int c = a + b;
        return c;
    }

    public static double f(double x) {
        double y = x * x - 1;
        return y;
    }

    public static double Spramougolnic(double a, double b) {
        double S = a * b;
        return S;
    }

    public static double Formulavstepen(double x) {
        double O = Math.pow(x, 3) + Math.pow(x, 2) + 1;
        return O;
    }

    public static double Sindvounouugol(double a) {
        double O = Math.sin(2 * Math.toRadians(a));
        return O;
    }

    public static double TretiaStorona(double a, double b, double angle) {
        double O = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(angle)));
        return O;
    }

    //15 задача
    public static void PArnost(int a) {
        int b = a % 2;
        if (b == 0) {
            System.out.println("Парное");
        } else {
            System.out.println("непарное");
        }
    }

    public static void Stest(double a, double b) {
        if (a % 2 == 0) {
            System.out.println("Площадь треугольника = " + a * b / 2);
        } else {
            System.out.println("Площадь прямоугольника = " + a * b);
        }
    }

    public static void Promejutok(int A) {
        if (A >= 0 && A < 10) {
            System.out.println("Попадает в [0,10)");
        } else {
            if (A >= 10 && A < 100) {
                System.out.println("Попадает в [10,100)");
            } else {
                if (A >= 100 && A < 1000) {
                    System.out.println("Попадает в [100,1000)");
                } else {
                    System.out.println("Не попадает ни в один промежуток");
                }
            }
        }
    }

    public static boolean Bolwe(int A) {
      return A > 10;
        }
}
