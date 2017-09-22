import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class TracePoints {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static int numberOfWords(final String words) {
        return 0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String words = urlToString("https://www.google.com");
        //words = words.replaceAll("(?s)<[^>]*>(\\s*<[^>]*>)*", " ");
        System.out.println(words);
    }
}
