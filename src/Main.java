

public class Main extends Thread{
	
	public static void main(String arg[]){
		
		Thread obj1=new Main();
		obj1.setName("1");
		Thread obj2=new Main();
		obj2.setName("2");
		Thread obj3=new Main();
		obj3.setName("3");
		
		obj1.start();
		obj2.start();
		obj3.start();
	}
	
	
	@Override
	public void run(){
			
		this.fun();
			
	}
			
	public void fun(){
		
		synchronized(Main.class){ 
			for(int i=0;i<10;i++){
				System.out.println("inside fun : "+this.getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}		
	}	
	
public  synchronized void fun1(){
	for(int i=0;i<10;i++)
		System.out.println("inside fun1..."+this.getName());
	}


public   void fun2(){
	for(int i=0;i<10;i++)
	System.out.println("inside fun2......"+this.getName());
}
	

}
