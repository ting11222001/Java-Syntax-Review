/*
 * https://www.youtube.com/watch?v=WTzjTskDFMg
 * 
 * https://www.programiz.com/java-programming/stack
 */

import java.util.*;

public class ValidParantheses {
  public boolean isValid(String s) {
    HashMap<Character, Character> lookUp = new HashMap<>();
    lookUp.put(')', '(');
    lookUp.put('}', '{');
    lookUp.put(']', '[');

    Stack<Character> stacks = new Stack<>();

    for (char c : s.toCharArray()) {
      if (lookUp.containsKey(c)) {
        if (!stacks.empty() && stacks.peek() == lookUp.get(c)) {
          stacks.pop();
        } else {
          return false;
        }
      } else {
        stacks.push(c);
      }
    }

    if (!stacks.empty()) {
      return false;
    }

    return true;
  }
}
