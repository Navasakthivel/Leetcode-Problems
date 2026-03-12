class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String s : operations) {
            if (s.equals("+")) {
                int top = st.pop();
                int secondtop = st.peek();
                int sum = top + secondtop;
                st.push(top); 
                st.push(sum);
            } else if (s.equals("D")) {
                st.push(st.peek() * 2);
            } else if (s.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.valueOf(s));
            }
        }
        int res = 0;
        for (int s : st) {
            res += s;
        }
        return res;
    }
}