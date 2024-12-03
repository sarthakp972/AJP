package thread;

public class functiondemo {

	public synchronized void sum(int n) {
		String name=Thread.currentThread().getName();
		int sum=0;
		for(int i=1; i<=n; i++) {
			System.out.println(name+"is adding  "+i);
			sum+=i;
			
		}
		System.out.println("sum: "+sum);
	}
}
