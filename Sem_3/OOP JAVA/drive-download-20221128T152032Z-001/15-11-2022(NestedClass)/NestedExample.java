import java.util.ArrayList;
import java.util.Iterator;

class Outer{
	private int x = 10;
	static int sx = 100;
	class Inner{
		private int x = 20;
		static int sx = 200;
		
		public void print() {
			System.out.println("x:"+Outer.this.x+" sx:"+sx);
		}
		
	}
	Outer.Inner in = new Outer.Inner();
}


class CustomStack<T> implements Iterable<T> {
	ArrayList<T> mylist =  new ArrayList<T>();
	void push(T item) {
		mylist.add(item);
		System.out.println("push size is: "+mylist.size());
	}
	T pop() {
		System.out.println("pop size is: "+mylist.size());
		return mylist.remove(mylist.size()-1);
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new CustomIterator<T>(this.mylist);
	}
	private class CustomIterator<T> implements Iterator<T>{
		ArrayList<T> list = new ArrayList<>();
		int cursor = 0;
		CustomIterator(ArrayList<T> list ){
			this.list = list;
		}
		@Override
		public boolean hasNext() {
			if(cursor<list.size())
				return true;
			return false;
		}

		@Override
		public T next() {		
			return list.get(cursor++);
		}
		
	}
}


public class NestedExample {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		System.out.println("static"+in.sx);
		in.print();
		CustomStack<Integer> stack = new CustomStack<>();
		stack.push(10);
		stack.push(20);
		stack.pop();
		stack.push(30);
//		Iterator it = stack.iterator();
		for(Integer i: stack) {
			System.out.println(i);
		}
	}
}
