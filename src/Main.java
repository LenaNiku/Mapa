import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        HashMap<Character, Integer> symbol = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (symbol.containsKey(c)) {
                    symbol.put(c, symbol.get(c) + 1);
                } else {
                    symbol.put(c, 1);
                }
            }
        }
        int max = -1;
        char maxC = 0;
        for (char cM : symbol.keySet()) {
            if (symbol.get(cM) > max) {
                max = symbol.get(cM);
                maxC = cM;
            }
        }
        System.out.println("Максимальная частота символа " + maxC + " " + max);

        int min = Integer.MAX_VALUE;
        char minC = 0;
        for (char mC : symbol.keySet()) {
            if (symbol.get(mC) < min) {
                min = symbol.get(mC);
                minC = mC;
            }
        }
        System.out.println("Минимальная частота символа " + minC + " " + min);

    }

}


