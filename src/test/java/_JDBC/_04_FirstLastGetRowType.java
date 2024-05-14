package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowType extends JDBCParent {
    @Test
    public void Test1() throws SQLException {
        DBConnectionOpen();

        ResultSet rs = sorguEkrani.executeQuery("select city from city");

        rs.last();
        System.out.println("Son Satır=" + rs.getString(1));

        rs.first();
        System.out.println("İlk Satir=" + rs.getString(1));

        rs.last();
        int kacinciSatirdayim=rs.getRow();
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);

        DBConnectionClose();
    }


}
