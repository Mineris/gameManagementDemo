package gameManagementDemo;

public class Game {
	
	private int Id;
	private String Name;
	private float Price;
	private String Campaign;
	
	public Game(int id, String name, float price, String campaign) {
		Id = id;
		Name = name;
		Price = price;
		Campaign = campaign;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPrice() {
		
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getCampaign() {
		return Campaign;
	}
	public void setCampaign(String campaign) {
		Campaign = campaign;
	}

}
