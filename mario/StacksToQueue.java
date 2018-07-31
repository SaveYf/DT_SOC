class StacksToQueue{
	int []stack1 =new int[5];
	int []stack2 = new int[5];
	int top1 = -1;
	int top2 = -1;
	int stack1length = 0;
	public void push(int date){
		if(top1 == 4){
			 System.out.print("栈满");
			 return;
		}
		top1 ++;
		stack1[top1] = date;
		stack1length++;
	}
	public int pop(){
		if(top1 == -1 && top2 == -1){
			System.out.print("栈空");
			return 0;
			}
		if(top1 >= 0 && top2 ==-1){
			for(int i =0;i <stack1length ;i++){
			top2 ++;
			stack2[top2] = stack1[top1];
			top1 --;
			}
		}
		return stack2[top2--];
					
	}
	public static void main (String[]args){
		StacksToQueue t = new StacksToQueue();
		t.push(1);
		t.push(2);
		t.push(3);
		t.push(4);
		for(int i =0;i<5;i++){
			System.out.println(t.stack1[i]);
		}
		t.pop();
		System.out.println(t.stack2[t.top2+1]);
		t.pop();
		System.out.println(t.stack2[t.top2+1]);
	}
}