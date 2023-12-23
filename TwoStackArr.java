import java.util.*;

class TwoStacks{
	
	int top1;
	int top2;
	int maxSize;
	int StackArr[];
	
	TwoStacks(int size){
		
		this.top1 = -1;
		this.top2 = size;
		this.StackArr = new int[size];
		this.maxSize = size;
	}
	
	void push1(int data){
		
		if(top2 - top1 > 1){
			
			top1++;
			StackArr[top1] = data;
		}else{
			
			System.out.println("Stack OverFlow");
		}
	}
	
	void push2(int data){
		
		if(top2 - top1 > 1){
			
			top2--;
			StackArr[top2] = data;
		}else{
			
			System.out.println("Stack OverFlow");
		}
	}
	
	int pop1(){
		
		if(top1 != -1){
			
			int val = StackArr[top1];
			top1--;
			return val;
		}else{
				System.out.println("Stack is empty");
				return -1;
		}
	}
	
	int pop2(){
		
		if(top2 == maxSize){
			
			System.out.println("Stack is empty");
			return -1;
		}else{
			
			int val = StackArr[top2];
			top2++;
			return val;
		}
	}
}

class Client2{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter Array Size:");
		int size = sc.nextInt();
		
		TwoStacks obj = new TwoStacks(size);
		char ch;
		
		do{
			
			System.out.println("1.push1");
			System.out.println("2.push2");
			System.out.println("3.pop1");
			System.out.println("4.pop2");
			
			System.out.println("Enter choice:");
			int choice = sc.nextInt();
			
			switch(choice){
				
				case 1:{
					
					System.out.println("Enter element to push");
					int data = sc.nextInt();
					obj.push1(data);
				}
				break;
				
				case 2:{
					
					System.out.println("Enter element to push");
					int data = sc.nextInt();
					obj.push2(data);
				}
				break;
				
				case 3:{
					
					int ret = obj.pop1();
					if(ret != -1){
						
						System.out.println(ret + "poped from stack");
					}
				}
				break;
				
				case 4:{
					
					int ret = obj.pop2();
					if(ret != -1){
						
						System.out.println(ret + "poped from stack");
					}
				}
				break;
				
				default:
					
					System.out.println("Wrong Choice");
					break;

			}
			
			System.out.println("Do you want to Continue?");
			ch = sc.next().charAt(0);
				
		}while(ch == 'Y' || ch == 'y');
	}
}