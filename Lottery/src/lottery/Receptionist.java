package lottery;

public class Receptionist {
	private final LotteryBox lotterybox;

	Receptionist(LotteryBox lotterybox){
		this.lotterybox = lotterybox;
	}

	public  Lottery request(User user) {
		System.out.println(user.getName()+"さんが宝くじを買います。");

		// FutureLotteryのインスタンスを作成
		final FutureLottery future = new FutureLottery();

		// ReallLotteryのインスタンスを作成するためのスレッドを起動する。

		new Thread() {
			public void run() {
				int c;
			c = lotterybox.takeLottery();

			 RealLottery real = new RealLottery(c);
			 future.setRealLottery(real);

			}// run ここまで

		}.start();
		System.out.println(user.getName()+"さんご購入ありがとうございます。");
		System.out.println("結果はのちに報告します");
		return future;
	}// request ここまで

}// class Receptionist ここまで
