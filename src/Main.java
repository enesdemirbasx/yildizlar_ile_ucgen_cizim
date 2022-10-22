import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Üçgen boyutu için bir sayi giriniz: ");
        int sayi= inp.nextInt();
        int a=1;
        for (int i=0;i<sayi+1;i++){
            for (int j=0;j<sayi;j++){
                System.out.print(" ");
            }
            for (int k=0;k<a;k++){
                System.out.print("*");
            }
            sayi=sayi-1;
            a=a+2;
            System.out.println();


        }

    }
}