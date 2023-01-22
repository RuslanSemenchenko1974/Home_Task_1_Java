/*Задание 1.

Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n */
import java.util.Scanner;
public class Task_Home_1 {
    public static void main(String[] args) {
    System.out.print("\033\143");
    int k = inputNamber();
    int perem = 0;
    for (int i = 1; i<=k; i++){
        perem+=i;
    }
    System.out.printf("Сумма чисел от 1  до  %d = %d \n", k, perem);
    perem = 1;
    for (int i = 1; i<=k; i++){
        perem*=i;
    }
    System.out.printf("Произведение чисел от 1  до  %d (%d!)= %d \n", k, k, perem);
    }

    static int inputNamber(){
        int n = 0;
        boolean check = true;
        while (check){
        try { 
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Задайте N : ");
        n = Math.abs(iScanner.nextInt());
        check = false;
        iScanner.close();
        }
        catch (Exception ex) {
        System.out.println("!Вводите корректные данные!");
        }
        }
      
    return n;    
    }
}