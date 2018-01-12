package mobileappscompany.w6test;

/**
 * Created by fallaye on 1/12/18.
 */

public class Main {

    public static void main(String[] args) {
        ExpressionMacther em = new ExpressionMacther();

        char exp[] = {'[','(',')',']','{','}', '{', '[','(',')', '(',')',']', '(', ')', '}'};

        if(em.balancedPairs(exp))
            System.out.println("Pairs in order ");
          else
            System.out.println("Not in order");

    }


}
