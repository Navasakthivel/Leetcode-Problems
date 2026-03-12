

class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String op : ops) {
            switch (op) {
                case "+":
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    int sum = last + secondLast;
                    stack.push(last); 
                    stack.push(sum);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }
        
        int total = 0;
        for (int score : stack) {
            total += score;
        }
        return total;
    }
}
