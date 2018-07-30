class getStackMin {
    public void stack(){
        int maxSize =a;
        int []stack = new int [a-1];
        int top = -1;
        int []getMin;
    }
    
    public void push(int date){
        if(stack[a-1].length =maxSize){
            System.out.print("This stack is full");
        }return;
        if(stack[a-1].length = 0){
            top ++;
            stack[top] = date;
            getMin[top] = stack[top];
        }
        if(stack[a-1].length > 0){
            top ++;
            stack[top] = date;
            if(stack[top-1]<stack[top]){
                getMin[top] = stack[top-1];
            }
            else
                getMin[top] = stack[top];  
        }
    }

    public int pullGetMin(){
        return getMin[top--];
    }
}