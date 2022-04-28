package pile;

public class Stack {

	private int[] data;
	private int count;
	public Stack() {
		// TODO Auto-generated constructor stub
		//this.count = 1;
		
		this.data = new int[1];
	
		
	}
	
	public int getCount() {
		return this.count;
	}
	
	public int getCapacity() {
		return this.data.length;
	}
	
	public boolean isEmpty() {
		return this.count==0;
	}
	public boolean isFull() {
		return this.count==this.data.length;
	}
	
	public int[] resize(int taille) {
		int[] newData = new int[taille];
		int i=0;
		for(int a:data) {
			newData[i++]=a;
		}
		this.count=i;
		return newData;
	}
	
	public void push(int val) {
		if(this.isFull()) {
			this.data = this.resize(this.count*2);
		}
		this.data[this.count]=val;
		this.count++;
		
	}
	
	public void printData() {
		for(int v:this.data) {
			System.out.print(v+ " ");
		}
		System.out.println();
	}
	
	public int pop() {
		if(this.isEmpty()) {
			return -1;
		}
		if(this.count < this.data.length/2) {
			this.data = this.resize(this.data.length/2);
		}
		this.count--;
		return this.data[this.count];
	}

}
