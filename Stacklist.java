import java.util.*;
import java.io.*;

public class StackList {
    
    public StackList() {
    }

    public boolean checkMatch() {
        Stack<String>stack = new Stack<>();
        int openCount = 0;
        int closeCount = 0;

        try {
            File file = new File("C:\\Margallo\\Symbols.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    String symbol = line.charAt(i)+"";

                    if (symbol.matches("[\\[\\{\\(]")) {
                        stack.push(symbol);
                        openCount++;
                    } else if (symbol.matches("[\\)\\}\\]]")) {
                        stack.push(symbol);
                        closeCount++;

                        if (openCount < closeCount) {
                            return false;
                        }
                    }
                }
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (openCount != closeCount) {
            return false;
        }
        return true;
    }

    public boolean checkBalance() {
        Stack<Character> charStack = new Stack<>();
        try {
            File file = new File("C:\\user\\Margallo\\Stacklist.java\\BSIT - 2B Files\\Data Structure Activities\\Symbols.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);

                    if (isOpeningSymbol(symbol)) {
                        charStack.push(symbol);
                    } else if (isClosingSymbol(symbol)) {
                        if (charStack.isEmpty() || !isMatchingPair(charStack.pop(), symbol)) {
                            return false;
                        }
                    }
                }
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return charStack.isEmpty();
    }

    private boolean isOpeningSymbol(char symbol) {
        return symbol == '{' || symbol == '[' || symbol == '(';
    }

    private boolean isClosingSymbol(char symbol) {
        return symbol == '}' || symbol == ']' || symbol == ')';
    }

    private boolean isMatchingPair(char opening, char closing) {
        return (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']') ||
               (opening == '(' && closing == ')');
    }
    
    public static void main(String[] args) {
        StackList stackList = new StackList();

        System.out.println("Matched: " + stackList.checkMatch());
        System.out.println("Balanced: " + stackList.checkBalance());
    }
}
