import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(int n) {
      List<String> res = new ArrayList<>(n);

      for (int i = 0; i <= n; i++) {
        res.add(String.valueOf(i));
        System.out.println(i);
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
