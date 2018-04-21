package adapter;

public class OldSystem {
   public void dealTask(int number_process) {
	  try {
	    for(int i=0; i<number_process; i++) {
		   Thread.sleep(1000);
		 }//for文ここまで
	  }//tryここまで
      catch(InterruptedException ex) {
      }
   }// dealTaskここまで
}// class Old System ここまで
