package gameManagementDemo;

public class Campaign {
	private int Id;
	private String CampaignName;
	private String Detail;
	
	public Campaign(int id, String campaignName, String detail) {
		Id = id;
		CampaignName = campaignName;
		Detail = detail;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCampaignName() {
		return CampaignName;
	}

	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}

	public String getDetail() {
		return Detail;
	}

	public void setDetail(String detail) {
		Detail = detail;
	}

}
