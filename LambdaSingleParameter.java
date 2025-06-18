interface StringOperation {
    String operate(String str);
}
public class LambdaSingleParameter {
    public static void main(String[] args) {
        StringOperation toUpperCase = str -> str.toUpperCase();
        StringOperation addExclamation = str -> str + "!";
        String input = "hello";
        String upperCaseResult = toUpperCase.operate(input);
        String exclamationResult = addExclamation.operate(input);
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + upperCaseResult);
        System.out.println("Exclamation: " + exclamationResult);
    }
}