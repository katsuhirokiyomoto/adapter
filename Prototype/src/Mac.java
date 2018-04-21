import framework.PC;

public class Mac implements PC {
	private String version=null;
	public Mac(String version) {
		this.version=version;
	}
  public void use(){
	  System.out.println("Mac"+version+"へようこそ");
  }//use ここまで
  public PC createClone() {
	  PC p = null;
    try {
        p=(PC)clone();
    }//tryここまで
    catch(CloneNotSupportedException e) {}
    return p;
  }//createCloneここまで
}
