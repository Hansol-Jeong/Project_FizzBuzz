import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(int n) {
      List<String> res = new ArrayList<>(n);

      for (int i = 0; i <= n; i++) {
        if (i % 15 == 0) {
          res.add("FizzBuzz");
        } else if (i % 5 == 0) {
          res.add("Buzz");
        } else if (i % 3 == 0) {
          res.add("Fizz");
        } else {
          res.add(String.valueOf(i));
        }
      } // end for 
      
      return res;
    }
}

class main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(100);

    }
}
