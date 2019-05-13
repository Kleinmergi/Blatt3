package B2.A8;

import java.time.LocalDate;

public class A8 {
    public static void main(String[] args) {
        double[][] m = myMatrixRandom(5,4);
        myMatrixPrint(m);
        myMatrixSwapRows(m,2,4);
        System.out.print('\n');
        myMatrixPrint(m);
        LocalDate d = LocalDate.now();

    }

    public static double[][]myMatrixRandom(int zeilen, int spalten){
        if(zeilen <= 0 ||spalten <= 0){
            System.err.println("Zeilen- und Spaltenzahl muss größer 0 sein!");
            return null;
        }

        double[][] matrix =new double[zeilen][spalten];
        for(int i = 0; i < zeilen; i++){
            for(int j = 0; j < spalten; j++){
                matrix[i][j] = Math.random();
            }
        }
        return matrix;
    }

    public static void myMatrixPrint(double[][] matrix){
        if(matrix == null){
            System.err.println("Keine Matrix gefunden!");
            return;
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.printf("%f\t", matrix[i][j]);
            }
            System.out.print('\n');
        }
    }

    //Zeilentausch über flache Kopie der Matrix
    public static void myMatrixSwapRows(double[][] matrix, int zeile1, int zeile2){
        if(matrix == null){
            System.err.println("Keine Matrix gefunden!");
            return;
        }
        if(zeile1 <= 0 || zeile2 == 0){
            System.err.println("Zeilenzahlen müssen größer 0 sein!");
            return;
        }

        if(zeile1 > matrix.length|| zeile2 > matrix.length){
            System.err.println("Zeilenzahlen müssen zur Matrix passen!");
            return;
        }

        double[] temp = matrix [zeile1 - 1];
        matrix[zeile1 - 1] = matrix[zeile2 - 1];
        matrix[zeile2 - 1] = temp;
    }
}

