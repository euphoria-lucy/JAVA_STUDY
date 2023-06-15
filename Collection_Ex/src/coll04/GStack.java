package coll04;

public class GStack<T> {

	int tos;
	Object [] stck;
	public GStack() {
		tos = 0; // index 
		stck = new Object [10]; // 10개의 기억공간 할당
	}
	
	public void push(T item) {
		if (tos == 10)
			return ;
		stck[tos] = item;
		tos++;
	}
	
	public T pop() {
		if (tos == 0) 
			return null;
		tos--;
		return (T)stck[tos];
	}
	
}
