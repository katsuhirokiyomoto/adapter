package lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LotteryBox {

	List<Integer> box  = new ArrayList<>();

	LotteryBox(int size) {
      shuffleLottery(box, size);
	}

	public  void  shuffleLottery(List<Integer> box, int size) {


		for(int i = 0; i<size; i++) {
			box.add(LotteryNumber.getFAILURE());
		}// forここまで


		box.add(1, LotteryNumber.getFIRST());
		box.add(2, LotteryNumber.getSECOND());
		box.add(3, LotteryNumber.getTHIRD());

		Collections.shuffle(box);

	}// shuffleLottery ここまで

	public int takeLottery(){
	    int pos;
	    int W;
	    pos = (int)Math.random()*box.size();
	    W= box.remove(pos);

     return W;
	}// takeLotteryここまで

}
// class LotteryBoxここまで