/**
 * Created by User on 5/19/2018.
 */
public class Dejavu {
    public static void main( String[] args) {
        // 4ое задание
        System.out.println(Spramougolnic(1,2));
        // 5ое задание
        System.out.println(Spramougolnic(7,8));
        System.out.println(Spramougolnic(9,10));
        //6ое задание
        System.out.println(Formulavstepen(5));
        System.out.println(Formulavstepen(-2));
        System.out.println(Formulavstepen(19));
        // 7ое задание
        System.out.println(Sindvounouugol(45));
    }

        public static int symma2 ( int a, int b){
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



}
