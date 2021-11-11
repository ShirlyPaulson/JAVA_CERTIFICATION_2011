import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.PreparedStatement;

public class Test2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 5;
        int k = 10;

        int loopIterations = 0;

        while ((i++ < j) || (j < --k)) {

            loopIterations++;
        }
        System.out.println(loopIterations);

        {
            try{
            Connection conn = DriverManager.getConnection(url,userName,pass);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO EMP VALUES(?,?,?) "){
            ps.setObject(1,100, JDBCType.INTEGER);
            ps.setObject(2,"John", JDBCType.VARCHAR);
            ps.setObject(3,"Doe", JDBCType.VARCHAR);
            ps.executeUpdate();
            ps.setInt(1,200);
            ps.setString(2,"Kelly");
            ps.executeUpdate();

        }



    }
}