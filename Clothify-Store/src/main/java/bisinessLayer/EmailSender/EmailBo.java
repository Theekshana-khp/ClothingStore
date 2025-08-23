package bisinessLayer.EmailSender;

import bisinessLayer.SuperBo;

public interface EmailBo extends SuperBo {
    public Boolean sendmail(String email,String emailBody);
}
