package checkgate;

public class Item implements Cloneable{

	 private String name;
	 private State type;
	Item(String name, State type){
		this.name = name;
		this.type = type;
	 }//コンストラクタここまで

	 public State get() {return type;}

	 public Item clone() {

		 Item item = new Item(this.name, this.type);

		 return item;
	 }// clone ここまで



	 public boolean equals(Object o) {
		 if((o instanceof Item)&& (((Item)o).name ==this.name )&& (((Item)o).type ==this.type )) {
           return true;
		 }
		 else {
		   return false;
		 }//else ここまで
	 }

	 public  boolean  isNonMetal() {
		 if(this.type == State.NONMETAL) {
	      return true;
		 }
		 else { return false;}

	 }// isMetal ここまで

	 public  boolean  isKeen() {
		 if(this.type ==State.KEEN) {
	      return true;
		 }
		 else { return false;}

	 }// isKeen ここまで

	 public String toString() {
		 return name+":"+"(" + type + ")";
	 }


}// class Itemここまで
