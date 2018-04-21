package checkgate;

public class CheckGate {
	private boolean testresult = false;
    private Gurdman gurdman;


     CheckGate(Gurdman gurdman){
    	 this.gurdman = gurdman;
     }//コンストラクタここまで

	public void inspect(Customer customer) {
		testresult=false;
		System.out.println(customer+"さんの手荷物検査を行います。\n");
		out: while(testresult == false){
          testresult = customer.takeInspection(customer.getItemList());
         if(testresult == true) {
        	 break out;
         }// ifここまで
           System.out.println(customer+"さんは金属探知機に引っかかりました。\n");

           gurdman.checkitem(customer);

		}//while文ここまで
		System.out.println(customer+"さんは手荷物検査に合格しました。");
	}// inspect ここまで




}//class CheckGateここまで
