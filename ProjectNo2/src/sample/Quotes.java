package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Quotes {
    private Random randomQuote;
    private static ArrayList<String> quotes = new ArrayList<String>();

    public static String getQuote() {
        /*
        In this method, an arraylist of pre-stored quotes is randomly called summoned by the
        NewQuote Method in Controller.
         */
        Random randomQuote = new Random();
        quotes.add("\"To improve is to change, so to be perfect is to change often.\"");
        quotes.add("\"Sometimes You Have To Fight For The Things That Are Worth Fighting For. \"");
        quotes.add("\"They Say That The Best Blaze Burns Brightest When Circumstances Are At Their Worst.\"");
        quotes.add("\"Always Believe In Yourself. Do This And No Matter Where You Are, You Will Have Nothing To Fear.\"");
        quotes.add("\"It Doesn’t Really Matter What Color Your Dress Is. What Matters Is The Heart Inside.\"");
        quotes.add("\"Everybody, Try Laughing. Then Whatever Scares You Will Go Away!\"");
        quotes.add("\"Life Is Suffering. It Is Hard. The World Is Cursed. But Still, You Find Reasons To Keep On Living\"");
        quotes.add("\"Once You've Met Someone, You Never Really Forget Them. \"");
        quotes.add("\" It’s Funny How You Wake Up Each Day And Never Really Know If It’ll Be One That Will Change Your Life Forever.\"");
        quotes.add("\"Deny Death, And You Deny Life.\"");
        quotes.add("\"“I’ve always liked a girl who speaks from the heart.”\"");
        quotes.add("\"“A heart is a heavy burden.”\"");

        int number = randomQuote.nextInt(quotes.size());
        String quote = quotes.get(number);
        return quote;

    }


}
