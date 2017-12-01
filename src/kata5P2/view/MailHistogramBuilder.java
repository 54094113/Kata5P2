package kata5P2.view;

import java.util.ArrayList;
import kata5P2.model.Histogram;

public class MailHistogramBuilder {
    public static Histogram<String> build (ArrayList<String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String mail1 : mail) {
            histo.increment(mail1.split("@")[1]);
        }
        return histo;
    }
}
