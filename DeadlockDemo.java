package Thread;

public class DeadlockDemo {
	  public static void main(String[] args) {  
		    final String r1 = "Arnab";  
		    final String r2 = "Anudip";  
		    // t1 tries to lock r1 then r2  
		    Thread t1 = new Thread() {  
		      public void run() {  
		          synchronized (r1) {  
		           System.out.println("Thread 1: locked r1");  
		  
		           try { 
		        	   Thread.sleep(100);
		           } 
		           catch (Exception e) {}  
		           synchronized (r2) {  
		            System.out.println("Thread 1: locked r2");  
		           }  
		         }  
		      }  
		    };  
		    // t2 tries to lock r2 then r1  
		    Thread t2 = new Thread() {  
		      public void run() {  
		        synchronized (r2) {  
		          System.out.println("Thread 2: locked r2");  
		  
		          try { 
		        	  Thread.sleep(100);
		        	  } 
		          catch (Exception e) {}  
		  
		          synchronized (r1) {  
		            System.out.println("Thread 2: locked r1");  
		          }  
		        }  
		      }  
		    };  
		    t1.start();  
		    t2.start();  
		  }  
		}
