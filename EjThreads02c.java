
public class EjThreads02c  implements Runnable{
	
	private final static int MAX= 3;
	private String name;
	
	public EjThreads02c(String name) 
	{
		System.out.println("IMplementando la interfaz Runnable.");
		this.name = name;
	}
	
	public void run() 
	{
		System.out.println("EL nombre es: "+name);
		
	}
	
	public static void main(String[] args) 
	{
		Thread[] ta= new Thread[MAX];
		
		for(int i=0;i< ta.length; i++) 
		{
			ta[i] = new Thread(new EjThreads02c("Threads"+i));
		}
		
		for(int i=0;i< ta.length; i++) 
		{
			ta[i].start();
		}
		
	}

}
