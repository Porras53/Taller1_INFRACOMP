
public class EjThreads01c extends Thread{

	private final static int MAX= 3;
	
	private String name;
	
	public EjThreads01c(String name) 
	{
		System.out.println("Extendiendo la clase Thread");
		this.name=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjThreads01c [] ta = new EjThreads01c[MAX];
		
		for(int i=0;i<ta.length;i++) 
		{
			ta[i]=new EjThreads01c("Thread"+i);
		}
		
		for(int i=0;i<ta.length;i++) 
		{
			ta[i].start();
		}
	}

}
