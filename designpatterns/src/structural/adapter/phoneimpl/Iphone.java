package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {
	private boolean connector;

	@Override
	public void recharge() {
		
		if(connector)
		{
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else
		{
			System.out.println("Connect Lightning phone");
		}

	}

	@Override
	public void useLightning() {
		
		connector = true;
		System.out.println("Lightning connected");


	}

}
