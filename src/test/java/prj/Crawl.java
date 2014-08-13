package prj;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl {
	public static void main(String[] args) {

		try {
			Document doc = Jsoup.connect("http://kde.hanyang.ac.kr").get();
			Elements link = doc.select("a");
			for(Element e : link){
				String s = e.attr("href");
				System.out.println(s);
			}
		} catch (Exception e) {

		}
	}

}
