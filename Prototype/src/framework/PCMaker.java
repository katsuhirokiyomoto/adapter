package framework;

import java.util.HashMap;

public class PCMaker {
private HashMap<String, PC> pclist = new HashMap<>();
public void register(String name, PC pc){
	pclist.put(name, pc);
}//registerここまで

public PC create(String pcname) {
     PC p = (PC)pclist.get(pcname);
     return p.createClone();
}
}//class PCMakerここまで
