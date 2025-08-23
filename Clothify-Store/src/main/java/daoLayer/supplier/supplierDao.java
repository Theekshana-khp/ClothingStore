package daoLayer.supplier;

import bisinessLayer.model.Supplier;
import bisinessLayer.model.Suppliertable;
import daoLayer.SuperDao;
import javafx.collections.ObservableList;

public interface supplierDao extends SuperDao {
    public Boolean saveNewCustomer(Supplier supplier);
    public String getSupplierID();
    public Supplier getSupplierDetailsByID (String method);
    public Supplier getSupplierDetailsByName (String method);
    public Boolean updateSupplierProducts(ObservableList<Suppliertable> products,String supplierID);
    public Boolean removeSupplier(Supplier supplier);
}
