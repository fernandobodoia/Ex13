public class Main{
   public static void main(String[] args){
     
      
	    Thread relogio1 = new Thread(new Relogio1());
	    Thread relogio2 = new Thread(new Relogio2());
		relogio2.start();
		relogio1.start();
	
   }	
}

