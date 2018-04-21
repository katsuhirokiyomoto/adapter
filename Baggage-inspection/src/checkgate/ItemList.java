package checkgate;

import java.util.ArrayList;
import java.util.List;

public class ItemList implements Cloneable{

	private List<Item> items= new ArrayList<Item>();


	 public ItemList clone() {
		 ItemList itemlist = new ItemList();
		 for(Item item: this.items) {
             itemlist.addItem(item.clone());
		 }// forここまで

         return itemlist;
	 }// clone ここまで


	  public  boolean checkNonMetal() {
	  int countMetal = 0;
	   for(Item item : items){
          if(item.isNonMetal()==false) {
            countMetal++;
          }// if文ここまで
	   }// for文ここまで
	   return (countMetal == 0);

	  }// checkNonMetal ここまで

	  public void removeKeen(ItemList itemlist) {
		  for(Item item : itemlist.getItems()){

	          if(item.isNonMetal()==false) {
	           if(item.isKeen()== false) {
	           Table.putItems(item);
	           this.removeItem(item);
	           }//if文(内側)ここまで
               else {
              this.removeItem(item);
              System.out.println("危険物があったため破棄しました。");
               }//else文ここまで

	          }// if文(外側)ここまで
		   }// for文ここまで
	  }// checkKeenここまで

      public  void  addItem (Item item) {
    	    	 items.add(item);

      }// addItem ここまで

      public void displayItems() {
    	  int countitem = 0;
        System.out.println("現在の持ち物は下記のとおりです。");
    	  for(Item item: items) {
    		  System.out.println(item);
    		  countitem++;
    	  }// forここまで
    	  System.out.println("合計で"+countitem+"です。");

      }
      public int countItem() {

        return items.size();
      }

      public void  removeItem(Item item) {
        	items.remove(item);

      }// removeItem ここまで

      public List<Item> getItems() {
    	  return items;
      }

}// class ItemList ここまで
