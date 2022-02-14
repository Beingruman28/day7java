package day7java;

public interface Interfacedeo {
	
	interface Manager{  
		void files();  
		}  
		//Implementation: by second user  
		class Employee1 implements Manager{  
		public void files(){System.out.println("creating files");}  
		}  
		class Employee2 implements Manager{  
		public void files(){System.out.println("accessing files");}  
		}  
		//Using interface: by third user  
		class TestInterface1{  
		public static void main(String args[]){  
		Manager d=new Employee1();//In real scenario, object is provided by method e.g. getDrawable()  
		d.files();  
		}
		}  
}
