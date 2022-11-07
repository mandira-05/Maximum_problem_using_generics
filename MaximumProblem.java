
public class MaximumProblem<T extends Comparable<T>> {

    T toCompare1, toCompare2, toCompare3;

    public MaximumProblem(T tocompare1, T tocompare2, T tocompare3) {
        this.toCompare1=tocompare1;
        this.toCompare2=tocompare2;
        this.toCompare3=tocompare3;
    }

    public void testMaximum() {
        MaximumProblem.findMax(this.toCompare1,this.toCompare2,this.toCompare3);
    }

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
        Float firstnumber1 = 20.5f, secondnumber2 = 25.6f, thirdnumber3 = 100.4f;
        String string1 = "Apple", string2 = "Peach", string3 = "Banana";


        new MaximumProblem<Integer>(number1, number2 , number3).testMaximum();
        new MaximumProblem<Float>(firstnumber1,secondnumber2,thirdnumber3).testMaximum();
        new MaximumProblem<String>(string1, string2, string3).testMaximum();

    }
}