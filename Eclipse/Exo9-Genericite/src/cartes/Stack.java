package cartes;

import java.util.Arrays;
import java.util.Random;

public class Stack<T> {

	private Object[] data;
	private int count;

	public Stack() {
		// TODO Auto-generated constructor stub
		this.data = new Object[1];
	}

	public int getCount() {
		return this.count;
	}

	public int getCapacity() {
		return this.data.length;
	}

	public boolean isEmpty() {
		return this.count == 0;
	}

	public boolean isFull() {
		return this.count == this.getCapacity();
	}

	private void resize(int taille) {
		if (taille >= this.count) {
			Object[] newData = new Object[taille];
			int i = 0;
			for (i = 0; i < this.count; i++) {
				newData[i] = this.data[i];
			}

			this.data = newData;
		}else {
			System.exit(-1);
		}
	}

	public void push(T val) {

		if (this.isFull()) {
			this.resize(this.count * 2);
		}

		this.data[this.count] = val;
		this.count += 1;
	}

	public void printData() {
		for (Object v : this.data) {
			System.out.print(v + " ");
		}
		System.out.println();
	}

	public Object pop() {
		Object res = this.data[this.count - 1];
		this.data[this.count - 1] = 0;
		this.count -= 1;
		if ((this.count < this.data.length / 2) && (this.count >= 1)) {
			this.resize(this.data.length / 2);
		}
		return res;
	}
	
	public  void shuffleArray()
	{
	    int index;
	    T temp;
	    Random random = new Random();
	    for (int i = this.data.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = (T) this.data[index];
	        this.data[index] = this.data[i];
	        this.data[i] = temp;
	    }
	}

	@Override
	public String toString() {
		return "Stack [data=" + Arrays.toString(data) + ", count=" + count + "]";
	}

	
}
