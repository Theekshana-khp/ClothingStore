package daoLayer.password.impl;

import DataBase.DBConnection;
import daoLayer.password.PasswordDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PasswordDaoImpl implements PasswordDao {
    public Boolean savePassword(String password,String email){
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            PreparedStatement psTm = connection.prepareStatement("UPDATE user SET  password = ? WHERE Email = ?");

            psTm.setString(1,password);
            psTm.setString(2,email);

            return psTm.executeUpdate() > 0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
