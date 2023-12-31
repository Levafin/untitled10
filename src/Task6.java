import java.util.Random;
import java.util.Scanner;

public class Task6 {
    //6. Составить программу:
    //1. нахождения минимального значения среди элементов любой строки двумерного массива;
    //2. нахождения максимального значения среди элементов любого столбца двумерного массива
    public static double[][] enterMatrix(int n, int m)
    {
        Scanner sc=new Scanner(System.in);
        double[][] array;
        array=new double[n][m];
        for(int i =0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.printf("Введите %d элемент строки %d \n",j,i);
                array[i][j]=sc.nextDouble();
            }
        }
        return array;
    }

    public static double[][] randMatrix(int n)
    {
        Random r = new Random();
        double[][] array;
        array=new double[n][n];
        for(int i =0; i<n; i++){
            for(int j=0; j<n;j++){
                array[i][j]=r.nextInt(99);
            }
        }
        return array;
    }
    public static void printMatrix(double[][] array)
    {
        for(int i =0; i<array.length; i++)
        {
            for(int j =0; j<array.length; j++)
            {
                System.out.print(array[i][j]+"\t");
            }

            System.out.println();
        }
    }

    public static void printArray(double[] array)
    {
        for(int i =0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void printIntArray(int[] array)
    {
        for(int i =0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void printIntArrayReverse(int[] array)
    {
        for(int i =array.length-1; i>=0; i--)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static double[] randomArray(int n)
    {
        Random r = new Random();
        double[] array;
        array=new double[n];
        for(int i =0; i<n; i++){
            array[i]=r.nextInt(99);
        }
        return array;
    }

    public static int minInd(double[] array, double Min)
    {
        int MinInd=0;
        for(int i =0; i<array.length; i++){
            if (array[i]==Min){
                MinInd=i;
                break;
            }
        }
        return MinInd;
    }

    public static int maxInd(double[] array, double Max)
    {
        int MaxInd=0;
        for(int i =0; i<array.length; i++){
            if (array[i]==Max){
                MaxInd=i;
                break;
            }
        }
        return MaxInd;
    }

    public static double arrayMax(double[] array)
    {

        double Max=array[0];
        for(int i=0; i<array.length;i++)
        {
            if (array[i]>Max){
                Max=array[i];
            }

        }
        return Max;
    }

    public static double arrayMin(double[] array)
    {
        double Min=array[0];
        for(int i=0; i<array.length;i++)
        {
            if (array[i]<Min){
                Min=array[i];
            }

        }
        return Min;
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        double[][] matrix=randMatrix(6);
        printMatrix(matrix);
        System.out.printf("Введите номер строки n от 0 до %d: \n",matrix.length);
        int n=sc.nextInt();
        System.out.printf("Введите номер столбца m от 0 до %d: \n",matrix.length);
        int m=sc.nextInt();
        double[] row = new double[matrix.length];
        double[] col = new double[matrix.length];
        for(int i=0;i<matrix.length;i++){
            row[i]=matrix[n][i];
            col[i]=matrix[i][m];
        }
        System.out.printf("Минимальное значение строки %d = %f \n",n,arrayMin(row));
        System.out.printf("Максимальное значение столбца %d = %f \n",m,arrayMax(col));




    }

}