
public class SaleMachine {

	int beerQuantity;
	int orangeQuantity;
	int money50;
	int money100;
	String msg;
	
	public SaleMachine() {
		beerQuantity = 3;
		orangeQuantity = 3;
		money50 = 5;
		money100 = 3;
	}
	
	public void setQuantity(int i, int m) {
		if(i==0)
			beerQuantity = m;
		if(i==1)
			orangeQuantity = m;
	}

	public String buy(String type,int money) {
		if(type.equalsIgnoreCase("beer")) {
			sale(0,money);
		}
		else if(type.equalsIgnoreCase("orange")) {
			sale(1,money);
		}
		else
			msg = "目前不提供该饮料。";
		return msg;
	}
	
	
	public void sale(int t, int money) {
		int q = 0;
		if(t == 0) 
			q = beerQuantity;
		if(t==1)
			q = orangeQuantity;
		if(q>0) {
			if(money==50) {
				msg="请取饮料";
				q--;
				money50++;
			}
			else if(money==100) {
				if(money50==0)
					msg = "对不起，目前不能找钱，请投 5 角硬币。";
				else {
					msg = "请取饮料，并取回找钱。";
					q--;
					money100++;
					money50--;
				}
			}
			else
				msg = "请投 5 角或者 1 元的硬币。";
		}
		else
			msg="目前该饮料已经售完。";
		setQuantity(t,q);
		
	}
}
