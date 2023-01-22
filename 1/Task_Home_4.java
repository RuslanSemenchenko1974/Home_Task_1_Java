/*Задание 4 *

Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
Уровень 2:

Частный случай - найти решение
для любого выражения вида 2? + ?5 = 6
*/
public class Task_Home_4 {
    public static void main(String[] args) {
        System.out.print("\033\143");
        String formula = "2?+?5=69";
        System.out.println("Задано уравнение :"+formula);
        String[] array = new String[3];
        int j=0;
        String prom = "";
        for(int i = 0; i < formula.length(); i++) { 
            if (formula.charAt(i) != '='  && formula.charAt(i) != '+') 
            { 
                prom+=formula.charAt(i);
            } 
            else {
                array[j] = prom;
                prom = "";
                j++;
                }
            }
            
        int namber1, namber2, namber3;
        
        array[j] = prom;
        
        for(int i = 1; i<10; i++) {
            for(int k = 1; k<10; k++){
                
                namber1 = Integer.valueOf(array[0].replace('?', (char)('0'+i)));
                namber2 = Integer.valueOf(array[1].replace('?', (char)('0'+k)));
                namber3 = Integer.valueOf(array[2]);

                if (namber1+namber2==namber3) System.out.printf("Решение %d + %d = %d", namber1, namber2, namber3);
            }
        }
    }
}