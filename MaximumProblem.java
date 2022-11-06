
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
        System.out.println("Maximum number is: " + maximumNumber);

    }

    public static void main(String[] args) {
        Integer number1 = 20, number2 = 25, number3 = 10;
        findMax(number1, number2, number3);

    }
}