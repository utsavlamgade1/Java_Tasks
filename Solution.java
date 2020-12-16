public class Solution {
        public String repeatStr(final int repeat, final String string) {
            String repeatWord = "";
            for (int i=0; i<=repeat-1; i++){
                repeatWord+=string;
            }
            return repeatWord;
        }

    public static void main(String[] args) {
            //repeatStr(3,"orange");
        Solution solution = new Solution();

        System.out.println(solution.repeatStr(3,"apple"));
    }
    }


