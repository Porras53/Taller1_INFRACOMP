
public class EjThreads02 implements Runnable 
{

	@Override
	public void run() {
		System.out.println("Implementado la interfaz Runnable.");	
	}
	
	public static void main(String[] args) 
	{
		Thread t = new Thread(new EjThreads02());
		
		t.start();
	}
	
}
