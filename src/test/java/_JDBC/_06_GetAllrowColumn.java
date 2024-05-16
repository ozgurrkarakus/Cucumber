package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _06_GetAllrowColumn extends JDBCParent {
    @Test
    public void test1() throws SQLException {
        DBConnectionOpen();
        ResultSet rs = sorguEkrani.executeQuery("select city_id,city,country_id from city");

        rs.next();
        System.out.println("id=" + rs.getString(1));
        System.out.println("id=" + rs.getString("city_id"));

        int intID = rs.getInt("city_id");
        System.out.println("intID = " + intID);
        DBConnectionClose();


    }
}
