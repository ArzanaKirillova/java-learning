package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

       // This is my comment

       /*
       This is first line
       This is second line
       This is third line
        */
        // int (integer) - whole number / natural number
        int age = 31;
        int currentYear = 2024;
        // currentYear = camel case (lower camel case)
        // current_year = snake case - never do like this!
        // current-year = kebab case - never do like this!

        int inventoryItemCount = 100;
        System.out.println("My age is " + age);
        System.out.println("Current year is " + currentYear);
        System.out.println(inventoryItemCount);

        // double (fractional number)
        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;

        System.out.println(temperature);
        System.out.println(price);
        System.out.println(distance);

        // char (symbols)

        char grade = 'A';
        char myInitial = 'A';
        char currencySymbol = '$';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);
        System.out.println("" + grade + " " + myInitial + " " + currencySymbol);

        //boolean (logical type, can keep only two values: true or false)
        // how to name? has or is
        // Example: isSummer / if(isSummer) {} / isLoggedIn;
        boolean isSummer = false;
        System.out.println(isSummer);

        // long
        long phoneNumber = 21431211;

        //float
        float interestRate = 4.5f;

        // Arithmetic operators

        int a = 10;
        int b = 5;
        int sum = a + b; // add
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println(difference);

        int m = 7;
        int n = 3;
        int result = m * n;
        System.out.println(result);

        // Divide
        int num1 = 10;
        int num2 = 3;
        int division = num1 / num2;
        System.out.println(division);

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3 / num4;
        System.out.println(divResult);

        // % (remainder of a division)

        int f = 10;
        int g = 3;
        int remainder = f % g;
        System.out.println(remainder);

        int number = 8;
        boolean isEven = (number % 2 == 0); // == comparison operator
        System.out.println(isEven);
        int number1 = 16;
        boolean isNotEven = (number1 % 3 == 0);
        System.out.println(isNotEven);

        // Increment ++
        // ++preIncrement
        // Decrement --
        // --decrement

        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement = counter++;
        int preIncrement = ++counter;
        System.out.println(postIncrement);
        System.out.println(preIncrement);



        String name = "Arzana";
        String lastName = "Kirillova";

        System.out.println(name);
        System.out.println(lastName);

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        // %s - for String
        // %d - for numbers
        // %b - boolean
        //

        System.out.println(String.format("My name is: %s, My surname is %s", name, lastName));
        System.out.printf("My name is :%s, My surname is %s\n", name, lastName);
        System.out.printf("My name is :%s, My surname is %s%n", name, lastName);

        var myCurrentAge = 31;
        var text = "Hello World";

        String myVar;
        myVar = "Hello, World";


    }
}
