package thread;

public class Caller {

	public static void main(String[] args) {
				
		functiondemo fd1= new functiondemo();
		Mythread mt1=new Mythread(5, fd1, "th1");
		Mythread mt2=new Mythread(8, fd1, "th1");
		mt1.start();
		mt2.start();
	}
	
}
