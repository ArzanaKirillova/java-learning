package lv.acodemy;

public class ifStatements {
    public static void main(String[] args) {
        // Even or Odd (if)
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("The number is even.");

            // Check if a number is positive or negative

            number = -5;
            if (number >= 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");

                // Grade checker (if-else-if)
                // 90> = A
                // 75 -> 89 = B
                // 50 -> 74 = C
                // < 50 = F

                // 1) Create score variable;
                // 2) Create logic if(score >= 90) -> A
                // else-if(score >= 75) -> B
                // else-if(score >= 50) -> C
                // else -> F

                int score = 68;
                if (score >= 90) {
                    System.out.println("Grade: A");
                } else if (score >= 75) {
                    System.out.println("Grade: B");
                } else if (score >= 50) {
                    System.out.println(score >= 50);
                    System.out.println("Grade: C");
                } else {
                    System.out.println("Grade: F");
                }
                int age = 15;
                if (age >= 18) {
                    System.out.println("You can buy alcohol");
                } else {
                    System.out.println("You can't buy alcohol");
                }

                // Task #2: Check if a number can be divides by 5;
                number = 10;
                if (number % 5 == 0) {
                    System.out.println("Number can be divided by 5");
                }

                // Task #3: Check pass of fail
                // if score >= 50 (passed)
                // all other cases (failed)

                score = 30;
                if (score >= 50) {
                    System.out.println("You passed!");
                } else {
                    System.out.println("You failed!");
                }

                // Traffic light system
                // Green -> Go
                // Yellow -> Slow down
                // Red -> Stop
                // String color;
                // if(color.equals("Green")) { }

                String color = "yellow";
                if (color.equals("green")) {
                    System.out.println("Go!");
                } else if (color.equals("yellow")) {
                    System.out.println("Slow down!");
                } else if (color.equals("red")) {
                    System.out.println("Stop!");
                }



            }
        }
    }
}