package isp;

public class EpamPermanentEmployee implements BasicDetails,PFDetails {

	@Override
	public void updateBasicDetails() {
		
		System.out.println("Update basic details");
		
		
	}
	
	@Override
	public void updatePFDetails()
	{
		System.out.println("update PF Details");
	}

}
