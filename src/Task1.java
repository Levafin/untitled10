import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task1 {

    //1. Заполнить массив из двенадцати элементов 1, 2, ... 12.
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
        int[] array=new int[12];
        for(int i=0; i<12;i++)
        {
            array[i]=i+1;
        }
        printIntArray(array);

        System.out.println();


    }

}