import java.util.*;

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}


class LinkedListStack {
	
     Node top = null;

    boolean isEmpty() {
		
        return top == null;
    }

    
    void push(int data) {
		 
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to the stack");
    }

    
    int pop() {
		
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }else{
			int poppedValue = top.data;
			top = top.next;
			return poppedValue;
		}
	}

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return top.data;
    }
	
	void printStack(){
		
		if(isEmpty()){
			System.out.println("Nothing to print");
			return;
			
		}else{
			
			System.out.print("[");
			Node temp = top;
			while(temp.next != null){
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.print(temp.data);
			System.out.println("]");
			}
			
		}
	}


class Main {
	
    public static void main(String[] args) {
		
		LinkedListStack s = new LinkedListStack();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stack size:");
		int size = sc.nextInt();
		
		char ch;
		
		do{
			
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.empty");
			System.out.println("5.printStack");
			
			System.out.println("Enter your choice");
			int choice  = sc.nextInt();
			
			switch(choice){
				
				case 1:{
					
					System.out.println("Enter elements for stack");
					int data = sc.nextInt();
					s.push(data);
				}
				break;
				
				case 2:{
					
						int flag = s.pop();
						if(flag != -1){
							
							System.out.println(flag + "pop");
						}
					}
					break;
				
				case 3:{
					
						int flag = s.peek();
						if(flag != -1){
							
							System.out.println(flag);
						}
				}
						break;
						
				case 4:{
					
						boolean val = s.isEmpty();
						if(val)
							System.out.println("Empty");
						else
							System.out.println("Not empty");
					}
					break;
				
				case 5:{
					
					s.printStack();
					break;
				}
				default: 
					
					System.out.println("Wrong choice");
					break;
			}
			System.out.println("do you want to continue?");
			ch = sc.next().charAt(0);
			
		}while(ch == 'Y'|| ch == 'y');
	}
}
