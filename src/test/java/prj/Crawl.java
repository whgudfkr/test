package prj;

import kr.co.shineware.nlp.komoran.core.analyzer.Komoran;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl {
	public static void main(String[] args) {

		try {
			Komoran km = new Komoran("/home/whgudfkr/test/models");
			Document doc = Jsoup.connect("http://www.naver.com").get();
			Elements link = doc.select("a");
			for(Element e : link){
				String s = e.attr("href");
				System.out.println(s);
			}
		} catch (Exception e) {

		}
	}

}
