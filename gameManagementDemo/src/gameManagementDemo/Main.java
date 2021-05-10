package gameManagementDemo;


public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Emir", "CANSIZ","101XXXXXXXX","2001");
		Customer customer2 = new Customer(2, "Furkan", "TETÝK", "330XXXXXXXX", "1998");
		
		Campaign campaign1 = new Campaign(1, "Summer", "%70");
		Campaign campaign2 = new Campaign(2, "Japanese Anniversary", "%50");
		
		Game game1 = new Game(1, "Battlefield 1", 399f, campaign2.getCampaignName());
		Game game2 = new Game(2, "Metro Exodus", 239.99f, campaign1.getCampaignName());
		Game game3 = new Game(3, "Sea Of Thieves", 61.5f, campaign2.getCampaignName());
		Game game4 = new Game(4, "Phasmophobia", 23.99f, campaign1.getCampaignName());
		Game game5 = new Game(5, "The Witcher", 74.99f, campaign2.getCampaignName());
		
		ICustomer cust = new CustomerManager();
		GameSale gameSale = new GameSale();
		IReCaptcha ver=new Verification();
		
		cust.add(customer1);
		ver.verification(customer1);
		System.out.println(" ");
		
		cust.add(customer2);
		ver.verification(customer2);
		System.out.println(" ");
		
		Game[] games= {game1, game2, game3, game4, game5};
		
		System.out.println("------------------------------------");
		System.out.println("OYUNLAR");
		System.out.println(" ");
		System.out.println("Normal Fiyatý / Kampanya Fiyatý");
		System.out.println(" ");
		
		for (Game game : games) {
			if(game.getCampaign()=="Summer") {
				float price = game.getPrice()-((70*game.getPrice())/100.0f);
			System.out.println(game.getName() + " - " + game.getPrice() + " TL" +" / "+price+ " TL");}
			
			if(game.getCampaign()=="Japanese Anniversary") {
				float price = game.getPrice()-((50*game.getPrice())/100.0f);
			System.out.println(game.getName() + " - " + game.getPrice() + " TL" +" / "+price+ " TL");}
			
		}
		
		System.out.println("------------------------------------");
		System.out.println(" ");
		
		gameSale.sale(customer1, game3);
		gameSale.sale(customer2, game1);
		System.out.println(" ");
		cust.update(customer2);
		cust.delete(customer1);
		
	}

}
