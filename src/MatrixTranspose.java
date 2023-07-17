import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int array[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                array[i][j]=scanner.nextInt();
            }

        }
        int ans[][]=new int[m][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                ans[j][i]=array[i][j];
            }

        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
