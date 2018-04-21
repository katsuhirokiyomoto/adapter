package membercard;

import java.util.ArrayList;
import java.util.List;

import framework.Factory;
import framework.Product;

public class MemberCardFactory extends Factory {
	private List<String> users = new ArrayList<>();
	public Product createProduct(String name) {
      return new MemberCard(name);
	}
     public void registerProduct(Product product) {
    	 users.add(((MemberCard)product).getName());
     }
}//class MemberCardFactoryここまで
