import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// This Jsoup WebScraper demo was written to print the daily trending of Github


public class GithubTrend {

    public static void main(String[] args) throws Exception {  
        final Document document = Jsoup.connect("https://github.com/trending?since=weekly%5D").get();
        for (Element row : document.select("div.Box article.Box-row")) {
        	final String title = row.select("h1").text();
        	System.out.print("title:"+title);//for quick test
            final String number = row.select("a").get(2).text();
            System.out.print("  number:"+number);//for quick test
            final String language = row.select("span[itemprop]").text();
            System.out.println("  language:"+language);//for quick test
        }

     
    }

}


