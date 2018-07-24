/**
 * Created by onkar.mhantati on 11/13/2017.
 */
public class MatrixMultiplication {
    public static void main(String[] args) {
        int n,r,c;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int m[][]=new int[3][3];
        a =createMatrix(1,3,3);
        displayMatrix(a);
        b=matrixTranspose(a);
        displayMatrix(b);

    }
    public static void displayMatrix(int x[][]){
        for(int i=0;i<x[0].length;i++){
            for(int j=0;j<x[1].length;j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }

    }
    public static int[][] createMatrix(int n,int r,int c){
        int x[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                x[i][j]=n;
                n=n+1;
            }
        }
        return x;
    }
    public static int[][] matrixTranspose(int b[][]){
        int x[][]=new int[b[0].length][b[1].length];

        for (int i=0;i<x[0].length;i++){
            for(int j=0;j<x[1].length;j++){
                x[i][j]=b[j][i];
            }
        }
        return x;
    }

    public static int[][] matrixMultiplication(int p[][],int q[][]){
    int x[][]=new int[p[0].length][p[1].length];

    for(int i=0;i<x[0].length;i++){
        for(int j=0;j<x[1].length;j++){
            x[i][j]=mult();
        }
    }

        return x;

    }
    public static  int mult(){
        int f=0;


        return f;
    }
}
