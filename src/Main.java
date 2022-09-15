public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 23;
        int intOperandB = 56;
        int intSum = intOperandA + intOperandB;
         System.out.println("The Sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

         double doubleOperandA = 56.7;
         double doubleOperandB = 43.3;
         double doubleSum = doubleOperandA + doubleOperandB;

         System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        int intProduct = intOperandA * intOperandB;
        System.out.println("The Product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        double doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The Double Product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        int intDifference = intOperandA - intOperandB;
        System.out.println("The Difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        double doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The Double Difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        int intQuotient = intOperandA / intOperandB;
        System.out.println("The Quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        double doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The Double Quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        int intModulo = intOperandA % intOperandB;
        System.out.println("The Modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        double doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The Double Modulo of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}