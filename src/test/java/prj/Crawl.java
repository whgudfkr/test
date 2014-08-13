package prj;

import org.snu.ids.ha.index.Keyword;
import org.snu.ids.ha.index.KeywordExtractor;
import org.snu.ids.ha.index.KeywordList;

public class Crawl {
	public static void startmama(String content) {
		Crawl momo = new Crawl();
		momo.keTest(content);
	}

	public void keTest(String string) {
		KeywordExtractor ke = new KeywordExtractor();
		KeywordList kl = ke.extractKeyword(string, true);
		for (int i = 0; i < kl.size(); i++) {
			Keyword kwrd = kl.get(i);
			if (kwrd.getTag().compareTo("NNG") == 0
					|| kwrd.getTag().compareTo("NNP") == 0)
				System.out.println(kwrd.getString()+"\t"+kwrd.getCnt());

		}
	}

}