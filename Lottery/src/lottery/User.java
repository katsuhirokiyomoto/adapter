package lottery;

public class User {
	private String name;
	Lottery lottery ;
	final Receptionist receptionist;

	User(String name, Receptionist receptionist){
       this.name=name;
       this.receptionist = receptionist;
	}// コンストラクタここまで

	public String getName() {
		return this.name;
	}// getNameここまで

	public void buyLottery() {
        lottery = receptionist.request(this);
	}

	public void checkResult() {

      System.out.println(getName()+"さんは"+lottery.getResult()); ;
	}// checkresult ここまで
}// class ここまで
