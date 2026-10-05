package Piles;

public class NPI {
    public static int evaluer(String expression) {
        Pile<Integer> pile = new Pile<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                pile.empiler(Character.getNumericValue(c));
            } 
            else if (c == '+' || c == '-' || c == '*') {
                int y = pile.depiler(); 
                int x = pile.depiler(); 
                int r = 0;

                switch (c) {
                    case '+':
                        r = x + y;
                        break;
                    case '-':
                        r = x - y;
                        break;
                    case '*':
                        r = x * y;
                        break;
                }

                pile.empiler(r);
            }
        }

        return pile.depiler();
    }

    public static void main(String[] args) {
        String expr1 = "2 3 + 5 * 9 1 3 4 + + 3 * - -";
        System.out.println("Résultat de [" + expr1 + "] = " + evaluer(expr1));

        String expr2 = "52+83-*";
        System.out.println("Résultat de [" + expr2 + "] = " + evaluer(expr2));
	    }
}
