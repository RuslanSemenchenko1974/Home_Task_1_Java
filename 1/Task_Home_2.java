/*Задание 2.

Вывести все простые числа от 1 до 1000  */
public class Task_Home_2 {
    public static void main(String[] args) {
        int n = 1000;

        System.out.print("Простые числа от 1 до 1000: ");
        for(int i = 1; i<=n; i++){
            int check = 0;
            int j = 1;
            int namber = i;
            while (check<=1 && namber!=1){
                j++;
                if (i%j == 0){
                    namber=namber/j;
                    check++;
                }
            }
        if (check==1) System.out.print(i+" ");
        }
    }
}
