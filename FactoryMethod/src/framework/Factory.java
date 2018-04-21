package framework;

public abstract class Factory {
  public final Product create(String name) {
     Product p = createProduct(name);
     registerProduct(p);
     return p;

  }//createここまで
  public abstract Product createProduct(String name);
  public abstract void registerProduct(Product product);
}//class Factoryここまで
