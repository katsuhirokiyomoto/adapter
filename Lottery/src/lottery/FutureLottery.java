package lottery;

public class FutureLottery implements Lottery {

	private RealLottery reallottery = null;
	private boolean ready = false;

	public synchronized void setRealLottery(RealLottery reallottery) {
        if(ready) {
        	return;
        }// ifここまで
         this.reallottery = reallottery;
         this.ready = true;
         notifyAll();
	}// setLottery ここまで

	public synchronized String getResult() {
		while(!ready){
			try {
				wait();
			}//try ここまで
			catch(InterruptedException ex) {
			}// catch ここまで
		}// while ここまで
		return reallottery.getResult();
	}



}// class FutureLottery ここまで
