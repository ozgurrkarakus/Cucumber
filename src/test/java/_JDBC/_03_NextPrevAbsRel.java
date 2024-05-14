package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent {

    @Test
    public void Test1() throws SQLException {
        DBConnectionOpen();
        ResultSet rs = sorguEkrani.executeQuery("select * from language");

        rs.next();
        System.out.println("1. satir = " + rs.getString(2));

        rs.next();
        System.out.println("1. satir = " + rs.getString(2));

        rs.previous();
        System.out.println("1. satir = " + rs.getString(2));


    }

    @Test
    public void Test2() throws SQLException {
        DBConnectionOpen();
        ResultSet rs = sorguEkrani.executeQuery("select * from film");

        rs.absolute(10);
        System.out.println("10.Satır=" + rs.getString("title"));

        rs.absolute(5);
        System.out.println("5.Satır=" + rs.getString("title"));

        rs.relative(5);
        System.out.println("10.Satır=" + rs.getString("title"));

        rs.next();
        DBConnectionClose();

    }
}
