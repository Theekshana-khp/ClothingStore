package bisinessLayer.password;

import bisinessLayer.SuperBo;

public interface PasswordBo extends SuperBo {
    public String getEncriptedPassword(String password);
    public Boolean saveNewPassword(String password,String email);
}
