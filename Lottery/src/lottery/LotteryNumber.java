package lottery;

public class LotteryNumber {
	static final int FIRST = 1;
	static final int SECOND = 2;
	static final int THIRD = 3;
	static final int FAILURE=0;

	public static int getFIRST() {

		return FIRST;
	}

	public  static int getSECOND() {

		return SECOND;
	}

	public  static int getTHIRD() {

		return THIRD;
	}

	public  static int getFAILURE() {

	return FAILURE;
	}

	public synchronized static String getResult(int number) {

		if(LotteryNumber.getFIRST()== number) {
          return "1等賞";
		}
		else if(LotteryNumber.getSECOND()== number) {
		  return "2等賞";
		}
		else if(LotteryNumber.getTHIRD()== number) {
          return "3等賞";
		}
		else {
         return "はずれ";
		}

	}// getResult ここまで
}
