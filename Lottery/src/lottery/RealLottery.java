package lottery;

public class RealLottery implements Lottery{
	private final String result;

	RealLottery(int c){
		try {
           Thread.sleep(3000);
		}//try ここまで
		catch(InterruptedException ex) {}
		result=LotteryNumber.getResult(c);
	}//コンストラクタここまで


	public String getResult() {
		return result+"です";
	}// getResult ここまで
}// RealLottery ここまで
