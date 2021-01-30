import java.util.Scanner;

public class EjercicioTaller1b extends Thread{
	
private Integer limSup;
	
	private Integer numeroActual;
	
	private String name;
	
	public EjercicioTaller1b(String name,int limSuperior, int numeroActual) 
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
		EjercicioTaller1b t0 = new EjercicioTaller1b("Thread 1",limS,1);
		EjercicioTaller1b t1 = new EjercicioTaller1b("Thread 2",limS,2);
		t0.start();
		t1.start();
		scannerObj.close();
		
	}

}
