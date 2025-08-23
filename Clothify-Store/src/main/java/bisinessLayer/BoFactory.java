package bisinessLayer;

import bisinessLayer.Customer.impl.CostomerBoImpl;
import bisinessLayer.EmailSender.impl.EmailBoImpl;
import bisinessLayer.Order.impl.OrderBoImpl;
import bisinessLayer.employee.impl.EmployeeBoImpl;
import bisinessLayer.password.impl.passwordBoImpl;
import bisinessLayer.product.impl.ProductBoImpl;
import bisinessLayer.supplier.impl.SupplierBoImpl;
import util.BoType;

public class BoFactory {
    private static BoFactory instance;
    private BoFactory(){}

    public static  BoFactory getInstence(){
        if(instance==null){
            return instance=new BoFactory();
        }
        return instance;
    }

    public <T extends SuperBo>T getBo(BoType type){
        switch (type){
            case CUSTOMER:return (T) new CostomerBoImpl();
            case ORDER:return (T) new OrderBoImpl();
            case SUPPLIER:return (T)new SupplierBoImpl();
            case PRODUCT:return (T) new ProductBoImpl();
            case Employee:return (T) new EmployeeBoImpl();
            case PASSWORD:return (T) new passwordBoImpl();
            case EMAIL:return (T) new EmailBoImpl();
        }
        return null;
    }
}
