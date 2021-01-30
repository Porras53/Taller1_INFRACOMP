
public class EjThread01b extends Thread
{

	private String name;
	
	public EjThread01b(String name) 
	{
		System.out.println("Extendiendo la clase Thread.");
		this.name=name;
	}
	
	public void run() 
	{
		System.out.println("EL nombre es: "+ name);
	}
	
	public static void main(String[] args) 
	{
		EjThread01b t0 = new EjThread01b("Thread"+0); 
		EjThread01b t1 = new EjThread01b("Thread"+1); 
		EjThread01b t2 = new EjThread01b("Thread"+2); 
		t0.start();
		t1.start();
		t2.start();
	}

}
