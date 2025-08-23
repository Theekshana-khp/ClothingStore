package daoLayer.password;

import daoLayer.SuperDao;

public interface PasswordDao extends SuperDao {
    public Boolean savePassword(String password,String email);
}
