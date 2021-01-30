import java.util.Scanner;

public class EjercicioTaller1 implements Runnable{
	
	private Integer limSup;
	
	private Integer numeroActual;
	
	private String name;
	
	public EjercicioTaller1(String name,int limSuperior, int numeroActual) 
	{
		System.out.println("Implementando la interfaz Runnable.");
		this.name=name;
		limSup=limSuperior;
		this.numeroActual=numeroActual;
	}
	
	public void run() 
	{
		int actual=numeroActual;
		try 
		{
			while(actual<limSup) {
				System.out.println(name +": "+actual);
				Thread.sleep(1000);
				actual++;
				actual++;
			}
		}
		catch(Exception e) {}
		
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Ingrese el limite superior");
		Scanner scannerObj = new Scanner(System.in);
		int limS=Integer.parseInt((scannerObj.nextLine()).trim());
		Thread t0 = new Thread(new EjercicioTaller1("Thread 1",limS,1));
		Thread t1 = new Thread(new EjercicioTaller1("Thread 2",limS,2));
		t0.start();
		t1.start();
		scannerObj.close();
		
	}
}
