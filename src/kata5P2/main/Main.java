package kata5P2.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import kata5P2.model.Histogram;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReaderDDBB;
/*import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;*/

public class Main {

    public static void main(String[] args) throws FileNotFoundException, 
            IOException,
            SQLException,
            ClassNotFoundException {
    /*    String filename = "C:\\Users\\Entrar\\Desktop\\emails.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();*/
        
        ArrayList<String> newMailArray = MailListReaderDDBB.readDDBB();
        Histogram<String> histogram = MailHistogramBuilder.build(newMailArray);
        new HistogramDisplay(histogram).execute();
        
    }
}
