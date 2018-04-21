package lottery;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		LotteryBox lotterybox = new LotteryBox(10);

		Receptionist receptionist = new Receptionist(lotterybox);

		// 各ユーザーの定義
		User tanaka = new User("田中", receptionist);
		User okamoto = new User("岡本", receptionist);
		User hanako = new User("花子", receptionist);
		User kawamura = new User("川村", receptionist);
		User sato = new User("佐藤", receptionist);
		User ito = new User("伊藤", receptionist);
		User yamashita = new User("山下", receptionist);
		User kobayashi= new User("小林", receptionist);
		User takahashi= new User("高橋", receptionist);
		User yamada= new User("山田", receptionist);

		tanaka.buyLottery();
		okamoto.buyLottery();
		hanako.buyLottery();
		kawamura.buyLottery();
		sato.buyLottery();
		ito.buyLottery();
		yamashita.buyLottery();
		kobayashi.buyLottery();
		takahashi.buyLottery();
		yamada.buyLottery();



		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException ex) {}


		tanaka.checkResult();
		okamoto.checkResult();
		hanako.checkResult();
		kawamura.checkResult();
		sato.checkResult();
		ito.checkResult();
		yamashita.checkResult();
		kobayashi.checkResult();
		takahashi.checkResult();
		yamada.checkResult();


	}// main ここまで



}// class Main ここまで
