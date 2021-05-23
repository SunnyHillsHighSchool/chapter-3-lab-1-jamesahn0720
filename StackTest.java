//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
 private Stack<String> stack;

 public StackTester()
 {
  setStack("");
 }

 public StackTester(String line)
 {
  stack = new Stack<String>();
   String[] arr = line.split(" ");
   for(String x : arr)
   {
     stack.push(x);
   }
 }
 
 public void setStack(String line)
 {
   stack = new Stack<String>();
   String[] arr = line.split(" ");
   for(String x : arr)
   {
     stack.push(x);
   }
 }

 public void popEmAll()
 {
   while(!stack.empty())
   {
     System.out.print(stack.pop()+" ");
   }
   System.out.println("\n");
 }

 //add a toString
 public String toString()
 {
   return "";
 }
}
