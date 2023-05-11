public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int count = 3;
        String name = "Cathy1";
        boolean isHappy = true;
        boolean done = false;
        int newCount = count * 2;
        newCount++;
        if (isHappy) {
            System.out.println("That's great");
        } else {
            System.out.println("I'm sorry");
        }
        if (count < 3) {
            System.out.println("Lower");
        } else if (count > 3) {
            System.out.println("Higher");
        } else {
            System.out.println("Same");
        }
        for (int i = 0; i < newCount; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
}
