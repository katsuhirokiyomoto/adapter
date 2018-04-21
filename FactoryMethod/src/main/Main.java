package main;

import framework.Factory;
import framework.Product;
import membercard.MemberCardFactory;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     Factory factory = new MemberCardFactory();
     Product membercard1= factory.create("太郎");
     Product membercard2= factory.create("花子");
     Product membercard3= factory.create("次郎");
     membercard1.use();
     membercard2.use();
     membercard3.use();
	}//main ここまで

}// Main ここまで
