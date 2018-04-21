import framework.PC;
import framework.PCMaker;
public class Main {
  public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
  PCMaker pcmaker = new PCMaker();
  Windows winpc = new Windows("10");
  Mac mac= new Mac("7");
  pcmaker.register("windows10", winpc);
  pcmaker.register("mac7", mac);

  //クローンを作成
  PC pc1= pcmaker.create("windows10");
  PC pc2= pcmaker.create("mac7");
  pc1.use();
  pc2.use();
	}//mainここまで

}//Mainここまで
