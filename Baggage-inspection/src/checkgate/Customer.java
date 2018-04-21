package checkgate;


	public class Customer {

		  private CheckGate checkgate;
	      private String name;
	      private ItemList itemlist;
	      boolean ResultInspection = false;

	       Customer(String name, ItemList itemlist,  CheckGate checkgate){

	             this.name = name;
	             this.itemlist = itemlist;
	             this.checkgate = checkgate;

	       }// コンストラクタここまで

			public boolean takeInspection(ItemList itemlist) {
	           if(itemlist.countItem() == 0) {
	           ResultInspection = true;
	           }
	           else {

	        	   ResultInspection = itemlist.checkNonMetal();
	           }


		       return ResultInspection;
		  }

		  public  ItemList giveItemList(){

	              ItemList gitemlist;
	              gitemlist = itemlist.clone();

	         return gitemlist;
		  }// giveItemList ここまで

		  public ItemList getItemList() {

		  return itemlist;

		  }//getItemList ここまで


		  public void pass(){
			  checkgate.inspect(this);
	          Table.returnItems(itemlist);
	          itemlist.displayItems();
		  }// passここまで

		  public String toString() {
			  return name;
		  }

	}



