import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class dic {

    public static void main(String[] args) throws IOException {
        String baseUrl = "https://www.ijunoon.com/dictionary/";

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String url = baseUrl + input;
        System.out.println("URL: " +url);

        Document doc = Jsoup.connect(url).get();
        //      System.out.println("doc");
//        System.out.println(doc);


        Elements roman=doc.getElementsByClass("r");
        Elements urdu=doc.getElementsByClass("u");
        Elements word=doc.getElementsByClass("l");
        Elements meaning=doc.getElementsByClass("m");


        /*  for (Element rom:roman) {
            System.out.println(rom.text());
        }
*/

        String[] urdu_trans;
        System.out.println("Roman and Urdu");
        if (roman.size() == urdu.size()) {
            for(int i=0;i<roman.size();i++) {
                System.out.println(roman.eq(i).text());
                System.out.println(urdu.eq(i).text());
                System.out.println(word.eq(i).text());
                System.out.println(meaning.eq(i).text());
            }
        }

    }
}