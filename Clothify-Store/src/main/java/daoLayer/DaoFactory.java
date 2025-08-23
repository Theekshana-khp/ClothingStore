package daoLayer;

import daoLayer.customer.impl.customerDaoimpl;
import daoLayer.employee.impl.EmployeeDaoImpl;
import daoLayer.order.impl.orderDaoimpl;
import daoLayer.password.impl.PasswordDaoImpl;
import daoLayer.product.impl.ProductDaoImpl;
import daoLayer.supplier.impl.supplierDaoImpl;
import util.DaoType;


public class DaoFactory {
    private static DaoFactory instance;
    private DaoFactory(){}
    public static DaoFactory getInstance(){
        if ( instance==null){
            return instance=new DaoFactory();
        }
        return instance;
    }

    public <T extends SuperDao>T getDao(DaoType type){
        switch (type){
            case CUSTOMER:return (T) new customerDaoimpl();
            case ORDER:return (T) new orderDaoimpl();
            case SUPPLIER:return (T) new supplierDaoImpl();
            case PRODUCT: return (T) new ProductDaoImpl();
            case Employee:return (T) new EmployeeDaoImpl();
            case PASSWORD:return (T) new PasswordDaoImpl();
        }
        return null;
    }
}
