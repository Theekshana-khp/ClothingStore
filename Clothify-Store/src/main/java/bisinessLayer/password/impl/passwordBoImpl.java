package bisinessLayer.password.impl;

import bisinessLayer.password.PasswordBo;
import daoLayer.DaoFactory;
import daoLayer.password.PasswordDao ;
import util.DaoType;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

    public class passwordBoImpl implements PasswordBo{
    PasswordDao instence= DaoFactory.getInstance().getDao(DaoType.PASSWORD);
        public String getEncriptedPassword(String password){

            String encryptedpassword = null;
            try{
                MessageDigest m = MessageDigest.getInstance("MD5");

                m.update(password.getBytes());
                byte[] bytes = m.digest();

                StringBuilder s = new StringBuilder();
                for(int i=0; i< bytes.length ;i++)
                {
                    s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                }

                encryptedpassword = s.toString();
            }
            catch (NoSuchAlgorithmException e)
            {
                e.printStackTrace();
            }
            return encryptedpassword;
        }

        public Boolean saveNewPassword(String password,String email){
            return instence.savePassword(getEncriptedPassword(password),email);
        }
    }
