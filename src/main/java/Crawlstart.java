package prj;
import java.net.URLEncoder;

public class Crawlstart {
	public static void main(String[] args){
		try{
			String s = "안녕하세요 안녕하세요 조형락입니다 저는 한양대학교 학생입니다.하하";
			s = URLEncoder.encode(s,"UTF-8");
			Crawl.startmama(s);
		}catch(Exception e){
			
		}
	}
}
