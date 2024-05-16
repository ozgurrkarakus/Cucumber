package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_Soru extends JDBCParent {
    @Test
    public void test1() throws SQLException {
        DBConnectionOpen();

        ResultSet rs = sorguEkrani.executeQuery("select city from city");
        rs.last();
        int sonSatir = rs.getRow();
        for (int i = 1; i <= sonSatir; i++) {
            rs.absolute(i);
            System.out.println(i + ". Satir: " + rs.getString(1));

        }

        DBConnectionClose();
    }

    @Test
    public void test2() throws SQLException {
        DBConnectionOpen();

        ResultSet rs = sorguEkrani.executeQuery("select city from city");
        rs.last();
        int sonSatir = rs.getRow();
        rs.first();
        System.out.println("1. Satir: "+rs.getString(1));

        for (int i = 1; i <= sonSatir; i++) {
            rs.relative(1);
            System.out.println(i + ". Satir: " + rs.getString(1));

        }
        DBConnectionClose();
    }
}