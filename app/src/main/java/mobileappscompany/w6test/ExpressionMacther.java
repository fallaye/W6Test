package mobileappscompany.w6test;

/**
 * Created by fallaye on 1/12/18.
 */

public class ExpressionMacther {

    StackOfChars stackOfChars;

    public ExpressionMacther() {

    }

    private boolean testPair(char leftChar, char rightChar){

        if (leftChar == '(' && rightChar == ')')
            return true;
        else if (leftChar == '{' && rightChar == '}')
            return true;
        else if (leftChar == '[' && rightChar == ']')
            return true;
        else
            return false;
    }

    public boolean balancedPairs(char[] expression) {

        stackOfChars = new StackOfChars();
        for(int i=0;i < expression.length; i++) {

            if (expression[i] == '{' || expression[i] == '(' || expression[i] == '[')
                stackOfChars.push(expression[i]);

            if (expression[i] == '}' || expression[i] == ')' || expression[i] == ']')
            {
                if (stackOfChars.isEmpty()) {
                    return false;
                }

                else if ( !testPair(stackOfChars.pop(), expression[i]) ) {
                    return false;
                }
            }

        }

        if (stackOfChars.isEmpty())
            return true;
        else {
            return false;
        }
    }

}
