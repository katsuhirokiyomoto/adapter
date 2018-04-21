
package membercard;
import framework.Product;
public class MemberCard extends Product{
   private String name;
   private int id;
   private static int nextid=1;
   MemberCard(String name){
	System.out.println(name+"さんのカードを作成します");
	this.name=name;
	this.id=nextid;
	nextid++;
   }//コンストラクタここまで

	public void use() {
	System.out.println("カードを使用します");
	System.out.println("利用者名:"+name);
	System.out.println("ID番号:"+id);
	System.out.println("\n");
	}//useここまで

	public String getName() {
		return this.name;
	}//getNameここまで

}//class MemberCardここまで