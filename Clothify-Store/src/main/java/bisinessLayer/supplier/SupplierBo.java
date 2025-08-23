package bisinessLayer.supplier;

import bisinessLayer.SuperBo;
import bisinessLayer.model.Supplier;
import bisinessLayer.model.Suppliertable;
import javafx.collections.ObservableList;

public interface SupplierBo extends SuperBo {
    public Boolean addNewSupplier(Supplier supplier);
    public Supplier getSupplierDetailByID(String method);
    public Supplier getSupplierDetailByName(String method);
    public Boolean updateSupplierProducts(ObservableList<Suppliertable> productList,String supplierID);
    public  Boolean RemoveSupplier(Supplier productList);
}
