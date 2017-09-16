
class Samplethread implements Runnable{
	String threadName;
	Thread t;
	 Samplethread(String s){
			threadName = s;
	}
	@Override
	public void run() {
		System.out.println("Hy this is my first thread");
		for(int i=1;i<=10;i++)
		{
			System.out.printf("I%d=%d\n",i,i);
		}
		//Sleep(3);
		
	}
	
	public void start(){
		Thread t = new Thread(this,threadName);
		t.start();
	}
	
}
public class Threadrun {

	public static void main(String[] args) {
		Samplethread T = new Samplethread("santram");
	 
		T.start();

	}

}

