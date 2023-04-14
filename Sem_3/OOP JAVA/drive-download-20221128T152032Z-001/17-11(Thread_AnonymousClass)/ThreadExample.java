import java.util.concurrent.*;
import java.util.concurrent.Executors;

class ArrayResource{
	private int[] arr = new int[5];
	private int index =0;
	synchronized void insert(int ele) {
		
		arr[index] = ele;
		System.out.println("inserted:"+ele);
		index++;
		
	}
	void print() {
		for(int i=0;i<5;i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
	}
}
class MyThread implements Runnable{
	Thread t = new Thread(this);
	ArrayResource arr;
	int ele;
	MyThread(ArrayResource arr, int ele){
		this.arr = arr;
		this.ele = ele;
	}
	@Override
	public void run() {
		arr.insert(ele);
		
	}
	
}
public class ThreadExample {
	public static void main(String[] args) throws InterruptedException {
		ArrayResource arr = new ArrayResource();
		ExecutorService es = Executors.newCachedThreadPool();
		MyThread mt[] = new MyThread[5];
		for(int i = 0; i< 5; i++) {
			mt[i] = new MyThread(arr, i+1);
			es.execute(mt[i]);
		}	
		
		new Runnable() {
			
			Thread t = new Thread(this);
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("anonymous:"+i);
				}
			}
			
			
		}.t.start();
		
		es.awaitTermination(2,TimeUnit.SECONDS);
		arr.print();
	};
}
