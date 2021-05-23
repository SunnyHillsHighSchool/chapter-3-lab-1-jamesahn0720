//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

class Main {
  public static void main(String[] args) {
    //add test cases  
     String testCase = "a b c d e f g h i";
    StackTest test = new StackTest(testCase);
    System.out.println("["+testCase+"]\n\n"+"popping all items from the stack\n");
    test.popEmAll();

    testCase = "1 2 3 4 5 6 7 8 9 10";
    test.setStack(testCase);
    System.out.println("["+testCase+"]\n\n"+"popping all items from the stack\n");
    test.popEmAll();

    testCase = "# $ % ^ * ( ) ) _";
    test.setStack(testCase);
    System.out.println("["+testCase+"]\n\n"+"popping all items from the stack\n");
    test.popEmAll(); 
  }
}
