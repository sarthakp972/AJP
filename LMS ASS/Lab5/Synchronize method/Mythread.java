package thread;

public class Mythread extends Thread{

	int n;
	functiondemo fd;
	public Mythread(int n, functiondemo fd, String name ) {
		super(name);
//		  System.out.println("");
		this.n=n;
		this.fd=fd;
		
		
	}
	
	public void run() {
		fd.sum(n);
	}
}
