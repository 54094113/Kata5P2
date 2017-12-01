package kata5P2.view;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MailListReaderDDBB {
    
    public static ArrayList<String> readDDBB() throws SQLException, 
            ClassNotFoundException{
        ArrayList<String> mailList = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        Connection cn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Entrar\\Desktop\\KATA.sDB");
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT mail FROM MAIL;");
        
        while (rs.next()){
            String mail = rs.getString("mail");
            if(!mail.contains("@")) continue;
            mailList.add(mail);
        }
        st.close();
        rs.close();
        cn.close();
        return mailList;
    }
    
}
