import framework.PC;
public class Windows implements PC{
	private String version=null;
	public Windows(String version) {
		this.version=version;
	}
  public void use(){
	  System.out.println("Windows"+version+"へようこそ");
  }//use ここまで
  public PC createClone() {
	  PC p = null;
    try {
        p=(PC)clone();
    }//tryここまで
    catch(CloneNotSupportedException e) {}
    return p;
  }//createCloneここまで
}//class Windowsここまで
