package checkgate;

public class Table {
 private static  ItemList titemlist = new ItemList();

  public static void putItems(Item item) {
    titemlist.addItem(item);

}// putItems ここまでvoid

  public static void  returnItems(ItemList citemlist) {
      if(titemlist.countItem()==0) {
    	  System.out.println("お預かりの荷物はありません。");
      }//if文ここまで
      else {
    	  for( Item item: titemlist.getItems()) {
       	   citemlist.addItem(item);
       	   //titemlist.removeItem(item);
          }// for文ここまで
    	  System.out.println("お預かりの荷物をすべて返却しました。");
    	  titemlist = new ItemList();
      }// elseここまで
  }// returnItemsここまで
}// class Table ここまで
