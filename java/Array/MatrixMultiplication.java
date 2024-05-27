package Array;

public class MatrixMultiplication {
    public static void main(String[] args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{9,8,7},{6,5,4},{3,2,1}};
        int c[][]=new int[3][3];
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
        {
            c[i][j]=0;
            for (int k=0;k<a.length;k++)
            {
                c[i][j] += a[i][k]*b[k][j];
            }
            System.out.print(c[i][j]+"\t");
        }
            System.out.println();

        }
        System.out.println();
    }
}
