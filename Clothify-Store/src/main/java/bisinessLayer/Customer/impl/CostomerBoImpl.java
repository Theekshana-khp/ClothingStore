package bisinessLayer.Customer.impl;

import bisinessLayer.Customer.CustomerBo;
import daoLayer.DaoFactory;
import daoLayer.customer.customerDao;
import util.DaoType;

public class CostomerBoImpl implements CustomerBo{
    customerDao instence=DaoFactory.getInstance().getDao(DaoType.CUSTOMER);

    @Override
    public String getCustomerID(){
        String customerID=instence.getCustomerID();
        Integer ID=Integer.parseInt(customerID);
        Integer newCustomerID=ID+1;
        return newCustomerID+"";
    }


}

