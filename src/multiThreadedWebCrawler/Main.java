package multiThreadedWebCrawler;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WebCrawler> bots = new ArrayList<>();
		bots.add(new WebCrawler("https://www.cnn.com/",1));
		bots.add(new WebCrawler("https://timesofindia.indiatimes.com/", 2));
		bots.add(new WebCrawler("https://www.canada.ca/en/immigration-refugees-citizenship/services/immigrate-canada/express-entry/submit-profile/rounds-invitations.html", 3));
		
		for(WebCrawler w: bots) {
			try {
				w.getThread().join();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
