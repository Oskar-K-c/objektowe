package TASKS.LAB14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public boolean authenticateUser(String username, String pin, String role) throws SQLException {
        String sql = "SELECT * FROM users WHERE username=? AND pin=? AND role=?";
        try(Connection conn =DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,username);
            stmt.setString(2,pin);
            stmt.setString(3,role);

            ResultSet rs = stmt.executeQuery();
            return rs.next();
        }
    }


    public void addUser(String nazw, String pin) throws SQLException{
          String sql = "INSERT INTO users (username,pin,balance,role) VALUES(?,?,0,'user')";
          try(Connection conn =DatabaseConnection.getConnection();
          PreparedStatement stmt = conn.prepareStatement(sql)){
              stmt.setString(1,nazw);
              stmt.setString(2,pin);
              stmt.executeUpdate();
              System.out.println("Użytkownik dodany!");
          }
    }

    public void wplata(String username, double amount) throws SQLException{
        String sql = "UPDATE users SET balance=balance+? WHERE username=?";
        try(Connection conn =DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setDouble(1,amount);
            stmt.setString(2,username);
            stmt.executeUpdate();
            System.out.println("Wpłata wykonana!");
            checkBalance(username);
        }
    }

    public void wyplata(String username, double kwotawyplaty) throws SQLException{
        String checkSQL="SELECT balance FROM users WHERE username=?";
        String updateSQL="UPDATE users SET balance=balance-? WHERE username=?";

        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement checkStmt = conn.prepareStatement(checkSQL)){
            checkStmt.setString(1,username);
            ResultSet rs =checkStmt.executeQuery();
            if(rs.next() && rs.getDouble("balance")>=kwotawyplaty){
                try(PreparedStatement updatestmt = conn.prepareStatement(updateSQL)){
                    updatestmt.setDouble(1,kwotawyplaty);
                    updatestmt.setString(2,username);
                    updatestmt.executeUpdate();
                    System.out.println("Wypłata wykonana!");
                    checkBalance(username);
                }
            }else{
                System.out.println("Nie masz wystarczających środków na koncie!");
            }
        }
    }

    public void changePin(String username, String newpin) throws SQLException{
        String sql ="UPDATE users SET pin=? WHERE username=?";
        try(Connection conn =DatabaseConnection.getConnection();
            PreparedStatement stmt =conn.prepareStatement(sql)) {
            stmt.setString(1,newpin);
            stmt.setString(2,username);
            stmt.executeUpdate();
            System.out.println("PIN zmieniono!");
        }

    }

    public void checkBalance(String username) throws SQLException{
        String sql ="SELECT balance FROM users WHERE username=?";
        try(Connection conn =DatabaseConnection.getConnection();
            PreparedStatement stmt =conn.prepareStatement(sql)) {
            stmt.setString(1,username);
            ResultSet rs =stmt.executeQuery();
            if(rs.next()){
                double balance =rs.getDouble("balance");
                System.out.println("Twoje saldo wynosi: "+balance+" PLN");
            }
        }

    }
}
