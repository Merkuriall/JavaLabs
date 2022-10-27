/*
C5 = 4 C=A×B
C7 = 4 long
C11 = 5 Обчислити суму найбільших елементів в рядках матриці з непарними номерами та найменших елементів
        в рядках матриці з парними номерами
 */
public class lab2 {
    public static void main (String [] args){
        long [][] A =
                {
                        {1,2,3,4},
                        {4,5,6,5},
                        {3,4,1,0}};
        long [][] B =
                {
                        {3,4,5,4},
                        {6,7,8,5},
                        {2,3,5,6},
                        {2,0,8,4}};
        int n = A.length;
        int m = A[0].length;
        int r = B[0].length;
        int q = B.length;

        boolean value = true; // Перевіряємо матрицю А на скошеність
        for(int i = 0; i < n; i++)
            if(m != A[i].length)
                value = false;

        for(int i = 0; i < q; i++)//Перевіряємо матрицю В на скошеність
            if(r != B[i].length)
                value = false;

        if (value==false)
            System.out.println("Скошена матриця");
        else
        {
            if (m!=q) //Перевіряємо умову множення двох матриць
                System.out.println("Кількість стовпців у першому множнику повинно дорівнювати кількості рядків у другому. ");
            else {
                long [][] C = new long [n][r]; //Виконуємо множення матриць А і В
                for (int i=0; i<n; i++){
                    for (int j=0; j<r; j++){
                        for (int k=0; k<m; k++)
                            C[i][j]+= A[i][k]*B[k][j];
                    }}
                for (int i=0; i<C.length; i++){
                    for(int j=0; j<C[0].length; j++){
                        System.out.print(C[i][j]+" ");
                    }
                    System.out.println();
                }
// Обчислити суму найбільших елементів в рядках матриці з непарними номерами
                long big=0;
                for (int i=0; i<n;i++){
                    if (i%2==0) {
                        long max=C[i][0];
                        for (int j=0; j<r;j++)
                            if (C[i][j]>max) max=C[i][j];
                        big+=max;

                    }}

//Обчислити суму найменших елементів в рядках матриці з парними номерами
                long low=0;
                for (int i=0; i<n;i++){
                    if (i%2==1) {
                        long min=C[i][0];
                        for (int j=0; j<r;j++)
                            if (C[i][j]<min) min=C[i][j];
                        low+=min;
                    }
                }
                System.out.println("Сума = " + (big+low));
            }
        }
    }
}

