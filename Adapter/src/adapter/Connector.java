package adapter;

public class Connector extends Calculator {
	 NewSystem system = new NewSystem();
	public void calculate(int number_process) {
		System.out.println(number_process+"個のタスクを受け取りました");
        system.dealTask(number_process);
		System.out.println("すべてのタスク処理が完了しました。");
	}

}//class Connector ここまで
