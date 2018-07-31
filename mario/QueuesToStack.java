class QueuesToStack{
	int []queue1 = new int[5];
	int []queue2 = new int[5];
	int top1 = -1;
	int top2 = -1;
	public void push (int date){
		if(queue1.length == 4 ||queue2.length ==4){
			System.out.print("栈满");
			return;
		}
		if(top1 == -1 && top2 == -1){
			top1 ++;
			queue1[top1] = date;
		}
		if(top1 == -1 && top2 != -1){
			top2 ++;
			queue2[top2] = date;
		}
		else
			top1 ++;
			queue1[top1] = date;
	} 
	public void pop(){
		if(queue1.length == 0 && queue2.length ==0){
			System.out.print("栈空");
			return;
		}
		if(queue1.length == 0 && queue2.length !=0){
			for(int i =0; i<queue2.length -1; i--){
				top1 ++;
				queue1[top1] = queue2[top2];
				top2 --;
			}
		}
		if(queue1.length !=0 && queue2.length == 0){
			for(int i =0; i<queue1.length -1; i--){
				top2 ++;
				queue2[top2] = queue1[top1];
				top1 --;
			}
		}
	}
	public static void main (String[] args){
		QueuesToStack t = new QueuesToStack();
		t.push(1);
		t.push(2);
		t.push(3);
		t.push(4);
		t.pop();
		t.pop();
		System.out.print("hhhh");
	}
}