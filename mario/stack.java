class stack {
    public stack() {
        int [] arr = new int[3];
        int maxSize = 3;
        int top = -1;
    }
    
    public void push(int date) {
        if(top == maxSize1 - 1){
            System.out.print("This stack is full");
        }
        top ++;
        arr [top] = date;
        
    }
    public int pop() {
        if(top == -1){
            System.out.print("This stack is empty");
        }
        return arr[top--];
    }
}