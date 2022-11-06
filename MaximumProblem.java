
public class MaximumProblem {
    public static void findMax(Integer number1, Integer number2, Integer number3) {
        Integer maximumNumber;

        if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0) {
            maximumNumber = number1;
        } else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0) {
            maximumNumber = number2;
        } else {
            maximumNumber = number3;
        }
        System.out.println("Maximum number for Integer is: " + maximumNumber);

    }

    public static void findMax(Float number1, Float number2, Float number3) {
        Float maximumNumber;

        if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0) {
            maximumNumber = number1;
        } else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0) {
            maximumNumber = number2;
        } else {
            maximumNumber = number3;
        }
        System.out.println("Maximum number for float is: " + maximumNumber);

    }
    public static void findMax(String string1, String string2, String string3) {
        String maximumNumber;

        if (string1.compareTo(string2) > 0 && string1.compareTo(string3) > 0) {
            maximumNumber = string1;
        } else if (string2.compareTo(string1) > 0 && string2.compareTo(string3) > 0) {
            maximumNumber = string2;
        } else {
            maximumNumber = string3;
        }
        System.out.println("Maximum String is : " + maximumNumber);

    }


    public static void main(String[] args) {
        Integer number1 = 20, number2 = 25, number3 = 10;
        findMax(number1, number2, number3);

        Float firstnumber1 = 20.5f, secondnumber2 = 25.6f, thirdnumber3 = 100.4f;
        findMax(firstnumber1, secondnumber2, thirdnumber3);

        String string1 = "Apple", string2 = "Peach", string3 = "Banana";
        findMax(string1, string2, string3);

    }
}