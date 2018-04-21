package adapter;

public class NewSystem {
	public void dealTask(int number_process) {
	  try {
	    for(int i=0; i<number_process; i++) {
		  Thread.sleep(500);
		}//for文ここまで
	  }//tryここまで
	   catch(InterruptedException ex) {}
	   }// dealTaskここまで
}// class NewSystemここまで
