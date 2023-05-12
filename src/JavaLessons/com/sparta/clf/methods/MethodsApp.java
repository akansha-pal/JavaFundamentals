package JavaLessons.com.sparta.clf.methods;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MethodsApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int count = 3;
        String name = "Cathy";
        boolean isHappy = true;
        boolean done = false;

        int newCount = count * 2;
        newCount++;

        if (isHappy) {
            System.out.println("That's great");
        } else {
            System.out.println("I'm sorry");
        }
        String result = returnHigherLower(count);
        System.out.println(result);
// iteration
        printNumbers(newCount);

// use an array
        String[] fruit = {"Oranges", "Bananas", "Apples", "Pears"};
        System.out.println(fruit);

        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }

        for (String f : fruit) {
            System.out.println(f);
        }

        String fruit2 = fruit[2];
        String lastFruit = fruit[fruit.length - 1];

// List of fruit - collection
        List<String> fruitList = Arrays.asList("Oranges", "Bananas", "Apples", "Pears");
        System.out.println(fruitList);
        String fruit3 = fruitList.get(3);

        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate christmas = LocalDate.of(2023, 12, 25);
        LocalDate halloween = LocalDate.of(2023, 10, 31);
        int noOfDays = numberOfDays(christmas, halloween);
        System.out.println(noOfDays);
    }

    static String returnHigherLower(int count){
        if (count < 3) {
            return "Lower";
        } else if (count > 3) {
            return "Higher";
        } else {
            return "Same";
        }
    }
    static void printNumbers(int newCount){
        for (int i = 0; i < newCount; i++) {
            System.out.println(i);
        }
    }
    static int numberOfDays(LocalDate christmas, LocalDate halloween){
        int daysToGo = christmas.getDayOfYear() - halloween.getDayOfYear();
        return daysToGo;
    }
}