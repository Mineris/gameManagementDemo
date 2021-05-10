package gameManagementDemo;

public class CampaignManager implements ICampaign{

	
	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Kampanya eklendi: " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
			
		System.out.println("Kampanya g�ncellendi: " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Kampanya silindi: " + campaign.getCampaignName());
	}

}