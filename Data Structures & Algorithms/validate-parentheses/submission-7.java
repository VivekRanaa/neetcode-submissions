class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[') stack.push(ch);
            else if(!stack.empty() && ((stack.peek()=='{' && ch=='}')||(stack.peek()=='(' && ch==')')||(stack.peek()=='[' && ch==']'))){
                stack.pop();
                continue;
            } 
            else return false;
        }
        if(stack.empty()) return true;
        else return false;
    }
}
