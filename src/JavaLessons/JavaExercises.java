package JavaLessons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class JavaExercises {
    public static void main(String[] args) throws ParseException {
        int num = 3;
        int num2 = num * 2;
        System.out.println(num2);
        int x = 5;
        int y = x * 7 + 2;
        System.out.println(y);
        if (y > 20) {
            System.out.println("High");
        } else {
            System.out.println("Low");
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        for (int j = 1; j <= 5; j++) {
            System.out.println(j * 5);
        }
        String[] names = {"John", "Kate", "David", "Susan", "Ashley"};
        System.out.println(names[0] + "\n" + names[1] + "\n" + names[2] + "\n" + names[3] + "\n" + names[4]);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date localDate = sdf.parse("2023-05-06");
        System.out.println(localDate);

        Date halloweenDate = sdf.parse("2023-10-31");
        Date christmasDate = sdf.parse("2023-12-25");
        long days = christmasDate.getTime()-halloweenDate.getTime();
        System.out.println(days / (1000 * 60 * 60 * 24));
    }
}
