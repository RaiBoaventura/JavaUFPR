import java.util.Scanner;
public class Tarefa2Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Até qual número da série de fibonacci ir? ");
        int serial = sc.nextInt();
        
        int[] f = new int[serial];

        for(int i = 0; i<serial; i++){
            if (i==0){
                f[0] = 0;
                System.out.println(f[i]);
            } else if(i==1){
                f[1] = 1;
                System.out.println(f[i]);
            }     
            else {
                    f[i] = f[i-1] + f[i-2];
                    System.out.println(f[i]);
            } 
        }
        sc.close();
    }
}
