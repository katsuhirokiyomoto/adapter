package checkgate;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

     Gurdman gurdman = new Gurdman();
     CheckGate checkgate = new CheckGate(gurdman);


     //田中さん
     Item item1 = new Item("包丁", State.KEEN);
     Item item2 = new Item("洋服", State.NONMETAL);
     Item item3 = new Item("本", State.NONMETAL);

     ItemList itemlist1 = new ItemList();
     itemlist1.addItem(item1);
     itemlist1.addItem(item2);
     itemlist1.addItem(item3);

      Customer tanaka = new Customer("田中", itemlist1, checkgate);

      //花子さん
      Item item4 = new Item("眼鏡", State.NONMETAL);
      Item item5 = new Item("楽器", State.METAL);
      Item item6 = new Item("本", State.NONMETAL);

      ItemList itemlist2 = new ItemList();
      itemlist2.addItem(item4);
      itemlist2.addItem(item5);
      itemlist2.addItem(item6);

      Customer hanako = new Customer("花子", itemlist2, checkgate);


      //太郎さん
      Item item7 = new Item("コンパス", State.KEEN);
      Item item8 = new Item("PC", State.METAL);
      Item item9 = new Item("枕", State.NONMETAL);
      Item item10 = new Item("本", State.NONMETAL);

      ItemList itemlist3 = new ItemList();
      itemlist3.addItem(item7);
      itemlist3.addItem(item8);
      itemlist3.addItem(item9);
      itemlist3.addItem(item10);

      Customer taro = new Customer("太郎", itemlist3, checkgate);

      tanaka.pass();
      hanako.pass();
      taro.pass();


	}//main ここまで

}
