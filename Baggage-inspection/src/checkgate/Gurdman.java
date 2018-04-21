package checkgate;

public class Gurdman {
	ItemList citemlist = null ;
	boolean resultKeen;

  public void checkitem(Customer customer) {

	System.out.println("ガードマンによる取り調べを行います。\n");

	citemlist = customer.giveItemList();
	(customer.getItemList()).removeKeen(citemlist);

  }// checkitem ここまで

}//class Gurdman ここまで
