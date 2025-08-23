package bisinessLayer.supplier.impl;

import bisinessLayer.model.Supplier;
import bisinessLayer.model.Suppliertable;
import bisinessLayer.supplier.SupplierBo;
import daoLayer.DaoFactory;
import daoLayer.supplier.supplierDao;
import javafx.collections.ObservableList;
import util.DaoType;

public class SupplierBoImpl implements SupplierBo {

    supplierDao instence =DaoFactory.getInstance().getDao(DaoType.SUPPLIER);
    public Boolean addNewSupplier(Supplier supplier){

        supplier.setSupplierId(getNextSupplierID());
        return  instence.saveNewCustomer(supplier);

    }

    public String getNextSupplierID(){

        Integer currentID=Integer.parseInt(instence.getSupplierID());
        Integer newID=currentID+1;
        return newID+"";
    }

    public Supplier getSupplierDetailByID(String method){
        return instence.getSupplierDetailsByID(method);
    }

    public Supplier getSupplierDetailByName(String method){

        return instence.getSupplierDetailsByName(method);
    }

    public Boolean updateSupplierProducts(ObservableList<Suppliertable> productList,String supplierID){
        return instence.updateSupplierProducts(productList,supplierID);
    }

    public  Boolean RemoveSupplier(Supplier productList){
        return instence.removeSupplier(productList);
    }
}
