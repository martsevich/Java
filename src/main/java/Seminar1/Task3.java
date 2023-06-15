package Seminar1;

import java.time.LocalTime;
import java.util.Scanner;

//3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
public class Task3 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String Name = iScanner.nextLine();
        String s1;
        int time = LocalTime.now().getHour();
        if (time == 5 || time < 12)
            s1 = "Доброе утро";
        else if (time < 18)
            s1 = "Добрый день";
        else if (time < 23)
            s1 = "Добрый вечер";
        else
            s1 = "Доброй ночи";
        //System.out.println(Name);
        System.out.printf(s1 + ", " + Name + "!");
        iScanner.close();
    }
}