package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _07_Soru extends JDBCParent{
    // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
    // aynı mysql sonuç ekranında olduğu gibi

    @Test
    public void Test1() throws SQLException {
        DBConnectionOpen();
        ResultSet rs=sorguEkrani.executeQuery("select * from language");

        ResultSetMetaData rsmd=rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.print(rsmd.getColumnName(i)+"\t");

        System.out.println();
        while (rs.next()){
            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.print(rs.getString(i)+"\t");

            System.out.println();
        }


        DBConnectionClose();
    }


    @Test
    public void Test2() throws SQLException {  //2.Çözüm
        DBConnectionOpen();
        ResultSet rs=sorguEkrani.executeQuery("select * from language");

        ResultSetMetaData rsmd=rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.print(rsmd.getColumnName(i)+"\t");

        System.out.println();

        rs.last();
        int sonSatirNo=rs.getRow();

        for (int i = 1; i <= sonSatirNo; i++) {

            rs.absolute(i);
            //bulunduğun satırdaki bütün kolonları yazdır
            for (int j = 1; j <= rsmd.getColumnCount(); j++)
                System.out.print(rs.getString(j)+"\t");

            System.out.println();
        }


        DBConnectionClose();

    }
}
