/*
 C2 = 0214 mod 2 = 0   +
 C3 = 0214 mod 3 = 1   /
 C5 = 0214 mod 5 = 4   char
 C7 = 0214 mod 7 = 4   char
 */
public class laba1 {

    public static void main(String[] args) {
        int C = 1;
        char a = 2;     //a = i
        char b = 3;      //b = j
        int n = 3;
        int m = 4;
        float res = 0;
        if ((a <= n && b <= m) && (a+C !=0)) {
            for (double i = a; i <= n; i++) {
                for (double j = b; j <= m; j++) {
                    res += (i / j) / (i + C);
                }
            }
            System.out.printf ("Результат = %.5f", res);
        }
        else if (a+C == 0){
            System.out.println("Ділення на 0");
        }
        else {
            System.out.println("Вихід за межі циклу");
        }
    }
}