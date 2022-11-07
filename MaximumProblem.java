
public class MaximumProblem {

    public static <T extends Comparable<T>> T findMax(T number1, T number2, T number3) {
        T maximumNumber;

        if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0) {
            maximumNumber = number1;
        } else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0) {
            maximumNumber = number2;
        } else {
            maximumNumber = number3;
        }
        System.out.println("Maximum element is: " + maximumNumber);
        return maximumNumber;
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