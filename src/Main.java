import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String MilkyWay ;
        int NUM = 5 ;
        String word =" Infiniti star " ;
        MilkyWay = NUM + word;
        System.out.println(MilkyWay);
        System.out.println(MilkyWay+NUM+word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }else  {
            System.out.println("Вы сохранили ноль");
        }
        // Собразительность
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String fname = input.next();
        System.out.println("Привет "+fname );
        System.out.println("");
        String yaer = input.next();
        System.out.println("");






    }

}