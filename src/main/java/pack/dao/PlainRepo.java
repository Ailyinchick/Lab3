package pack.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pack.model.Plain;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PlainRepo implements DaoRepos<Plain> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    public int getCapacity() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsac", "root", "123qwe");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select getCapacity()");
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (ClassNotFoundException ex1) {
            System.out.println("Class not found EX " + ex1.getMessage());
        } catch (SQLException ex2) {
            System.out.println("SQL EX " + ex2.getMessage());
        }
        return 1;
    }

    public int getC_capacity() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsac", "root", "123qwe");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select getC_capacity()");
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (ClassNotFoundException ex1) {
            System.out.println("Class not found EX " + ex1.getMessage());
        } catch (SQLException ex2) {
            System.out.println("SQL EX " + ex2.getMessage());
        }
        return 1;
    }


    public List<Plain> sortedPlains() {
        List<Plain> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsac", "root", "123qwe");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from sorted_plains");
            while (rs.next()) {
                Plain plain = new Plain();
                plain.setId(rs.getInt(1));
                plain.setCapasity(rs.getInt(2));
                plain.setC_capasity(rs.getInt(3));
                plain.setFlyrange(rs.getInt(4));
                plain.setFuelconsume(rs.getInt(5));
                plain.setType(rs.getString(6));
                list.add(plain);
            }
        } catch (ClassNotFoundException ex1) {
            System.out.println("Class not found EX " + ex1.getMessage());
        } catch (SQLException ex2) {
            System.out.println("SQL EX " + ex2.getMessage());
        }
        return list;
    }



    public List<Plain> getByFuelCons(int x1, int x2) {
        List<Plain> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsac", "root", "123qwe");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("call getByFconsume(" + x1 + ", " + x2 + ")");
            while (rs.next()) {
                Plain plain = new Plain();
                plain.setId(rs.getInt(1));
                plain.setCapasity(rs.getInt(2));
                plain.setC_capasity(rs.getInt(3));
                plain.setFlyrange(rs.getInt(4));
                plain.setFuelconsume(rs.getInt(5));
                plain.setType(rs.getString(6));
                list.add(plain);
            }
        } catch (ClassNotFoundException ex1) {
            System.out.println("Class not found EX " + ex1.getMessage());
        } catch (SQLException ex2) {
            System.out.println("SQL EX " + ex2.getMessage());
        }
        return list;
    }

}
