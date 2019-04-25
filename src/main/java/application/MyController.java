package application;

/**
 * This Controller gets used by the UI Tier to perform cool operations on
 * the user's request data.
 *
 * @author Reid
 */
public class MyController {

    /**
     * Perform a cool operation on some input data
     * In this example, reverses the string.
     *
     * @param inputData
     * @return String - reversed inputData
     */
    public String performCoolOperation(String inputData) {
        // Do some cool application logic here...
        return reverseString(inputData);
    }

    /**
     * Reverse a string
     * @param input
     * @return a reversed string
     */
    private String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
