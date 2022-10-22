import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Üçgen boyutu için bir çift sayi giriniz: ");
        int sayi= inp.nextInt();
        if (sayi%2==1){
            System.out.println("Tek sayı girdiniz. Lütfen çift sayı giriniz!!!");
        }
        int a=1;
        int say2=sayi/2;
        int stop=say2;
        int c=sayi;
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
        for (int b=0;b<stop;b++){
            for (int n=0;n<say2+1;n++){
                System.out.print(" ");
            }
            for (int m=0;m<c-1;m++){
                System.out.print("*");
            }
            say2=say2+1;
            c=c-2;
            System.out.println();
        }



    }
}