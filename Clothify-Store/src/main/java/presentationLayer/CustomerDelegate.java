package presentationLayer;

import bisinessLayer.BoFactory;
import bisinessLayer.Customer.CustomerBo;
import bisinessLayer.EmailSender.EmailBo;
import bisinessLayer.Order.OrderBo;

import bisinessLayer.employee.EmpolyeeBo;
import bisinessLayer.model.*;
import bisinessLayer.password.PasswordBo;
import bisinessLayer.product.ProductBo;
import bisinessLayer.supplier.SupplierBo;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.util.Duration;
import util.BoType;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;


public class CustomerDelegate implements Initializable {
    public Label lblCloseLoginOption;
    public Text lblUserLogin;
    public PasswordField txtPassword;
    public TextField txtEmail;
    public Button btnLogin;
    public Button btnResetPassword;
    public Button btnUserLogin;
    public Label lblFirstBackGround;
    public ImageView DashBoardBackground;
    public TableView tblOrder;
    public TableColumn tblColOrderID;
    public TableColumn tblColProductID;
    public TableColumn tblColProductDesc;
    public TableColumn tblColTotal;
    public TableColumn tblColQuantity;
    public TableColumn tblColPaymentMethod;
    public TextField txtQuantity;
    public Text lblProductID;
    public Text lblQuantity;
    public Text lblPaymentMethod;
    public Text lblTotal;
    public TextField txtTotal;
    public Button btnClearTextBox;
    public Button btnQuantityAdd;
   
    public Line lineDashBoard;
    public Button btnPlaceOrder;
    public Button btnPlaceNewOrder;
    public Label lblNetTotalTag;
    public Label lblNetTotal;
    public Label lblRsTag;
    public Label OrtherSettingBackground;
    public ImageView imgAccountSettings;
    public ImageView imgSupplierSettings;
    public ImageView imgProductSettings;
    public Button btnAccountSettings;
    public Button btnProductSettings;
    public Button btnSupplierSettings;
    public Line lineMain;
    public Text lblUserDashBoard;
    public Button btnAddToCart;
    public ImageView b;
    public Text lblCustomerName;
    public Text lblCustomerEmail;
    

    public ComboBox ChoiceBoxProductID;
    public ComboBox choiceBoxPaymentMethod;
    public JFXTextField txtCustomerEmail;
    public JFXTextField txtCustomerName;
    public Text lblOrderID;
    public Label txtOrderID;
    public Label lblProductDetails;
    public Label Time;
    public Label lbldate;
    public Label lblOrderDetail;
    public ImageView accountSettingsBackground;
    public Button btnChangePassword;
    public Button btnLogOut;
    public Button AccountSettingsBack;
    public Label lblUserName;
    public Label lblAccountSettingUserName;
    public Label lblUserNumber;
    public ImageView imgSupplierSettings1;
    public Button btnAddSupplier;
    public Button btnRemoveSupplier;
    public Button btnUpdateSupplier;
    public Label lblSupplierSetting;
    public Button btnSupplierSettingsBack;
    public Button btnAddSupplier1;
    public TextField txtSupplierName;
    public TextField txtSpplierCompany;
    public TextField txtSupplierEmail;
    public Label lblFillSupplierDetails;
    public Button btnAddSupplierToDataBase;
    public Button btnAddSupplierBack;
    public Label lblSupplierName;
    public Label lblSupplierCompany;
    public Label lblSupplierEMail;
    public ImageView imgProductSettings1;
    public Button brnSupplierSettingsBack;
    public Button btnUpdateDetails;
    public TextField btnEnterSuppierID;
    public CheckBox cheakByName;
    public CheckBox chekByID;
    public Button btnUpdateSupplier1;
    public TextField txtSupplierName2;
    public TextField txtSupplierEmail2;
    public TextField txtSupplierCompany;
    public Label lblSupplierID;
    public Button btnSupplierProductUpdate;
    public Button btnUpdateSupplierDataBase;
    public Button btnSupplierUpdate2Back;
    public TextField txtSupplier3Name;
    public TextField txtSupplierEmail3;
    public TableView tableSupplierPastProducts;
    public TableColumn tblSupplerPastProductID;
    public TableColumn tblSupplierPastDescription;
    public TableView tblSupplierCurrentProducts;
    public TableColumn tblSupplierCurrentProductID;
    public TableColumn tblSupplierCurrentDescription;
    public ComboBox choiceBoxProductID;
    public Button btnAddNewProducts;
    public Button btnUpdateProductList;
    public Button btnSupplierUpdateBack4OnAction;
    public Label lblupdateProductList;
    public ComboBox choiceBoxUpdateSupplierProducts;
    public Button btnRemoveSupplier1;
    public Button btnRemoveSuppilerBack;
    public Button btnDelateSupplier;
    public TextField txtRemoveSupplierID;
    public Label labelRemoveSupplierID;
    public Label lblProductSettings;
    public Button btnProductDetails;
    public Button btnUpdateProduct;
    public Button btnAddProduct;
    public Button btnRemoveProduct;
    public Button btnProductSettingsback;
    public ImageView imgProductSettings3;
    public CheckBox cheakBoxProductName;
    public CheckBox cheakBoxproductID;
    public TextField txtProductID;
    public Button btnSearchProduct;
    public Button btnProductDetailsBack;
    public Button btnProductIDLastBack;
    public TextField txtProductSettingUnitPrice;
    public Label lblProductSettingUnitPrice;
    public TextField txtProductSettingSize;
    public TextField txtProductSettingQTY;
    public TextField txtProductSettingDesc;
    public TextField txtProductSettingID;
    public Label lblProductSettingSize;
    public Label lblProductSettingQTYOnHand;
    public Label lblProductSettingDesc;
    public Label lblProductSettingID;
    public Button btnLastAddProductBack;
    public ComboBox choiceBoxproductAddCategory;
    public Button btnLastAddProduct;
    public Label lblproductAddCategory;
    public TextField txtproductAddName;
    public TextField txtproductAddSize;
    public TextField txtproductAddQuantity;
    public TextField txtproductAddUnitPrice;
    public Label lblproductAddSize;
    public Label lblproductAddUnitPrice;
    public Label lblproductAddQuantity;
    public Label lblproductAddName;
    public Button btnRemoveProductDelate;
    public Button btnProductupdateDetails;
    public Button btnProductUpdatelastback;
    public Button btnLastUpdate;
    public JFXCheckBox cheakTypeNewOrder;
    public JFXCheckBox cheakTypeReturnOrder;
    public ComboBox comboBoxReturnOrderItem;
    public Button btnReturn;
    public TextField txtReturnProductQuantity;
    public Label lblReturnProductQuantity;
    public Label lblreturnItems;
    public TableView tblOrder1;
    public TableColumn tblColOrderID1;
    public TableColumn tblColProductID1;
    public TableColumn tblColProductDesc1;
    public TableColumn tblColQuantity1;
    public TableColumn tblColPaymentMethod1;
    public TableColumn tblColTotal1;
    public ImageView returnCustomerBackground;
    public Label lblReturnCustomer;
    public Label lblReturnOrderID;
    public Button BtnReturnOrderAdd;
    public TextField txtReturnOrderID;
    public Button btnAdminLogin;
    public Button btnAdminChangeUserOnAction;
    public Button btnAdminEmployeeSetting;
    public ImageView imgAdminChangeUser;
    public ImageView imgAdminEmployeeSetting;
    public Button btnAdminAccountSetting;
    public Button btnRemoveempolyee;
    public Button btnAddEmpolye;
    public Button btnUpdateEmpolyee;
    public Button btnEmpolyeeSettingBack;
    public Label lblEmpolyeeSetting;
    public ImageView imgAdminEmployeeSetting1;
    public Label lblAddEmployeeSalary;
    public Label lblEmployeeJobRole;
    public Label lblAddEmployeeName;
    public TextField txtAddEmployeeSalary;
    public TextField txtEmployeeJobRole;
    public TextField txtAddEmployeeEmail;
    public TextField txtAddEmployeeName;
    public Button btnAddEmployeeBack;
    public Button btnAddEmployeeToDataBase;
    public CheckBox choiseSelectAsUser;
    public Label lblAddEmployeeEmail;
    public Button btnAdminChangeUser;
    public Button btnUpdateEmployeeback;
    public Button btnUpdateEmployee;
    public TextField TxtUpdateEmployee;
    public CheckBox choiceBoxUpdateByName;
    public CheckBox choiceBoxupdateByID;
    public Button btnUpdateEmployeeSearch;
    public Button btnUpdateEmployeeToDataBase;
    public Button btnUpdateEmployeeLastBack;
    public Label lblUpdateEmployeeID;
    public Label lblRemoveEmployee;
    public TextField txtRemoveEmployee;
    public Button btnDelateEmployee;
    public Button btnRemoveEmployeeBack;
    public Button btnLoginAsAnotherUserBack;
    public ComboBox comboBoxSelectAnotherUser;
    public Button btnLoginAsAnotherUser;
    public Label lblAotherUserLoginSelect;
    public Label lblLoginAsAnotherUser;
    public ImageView imgAdminChangeUser1;
    public Button btnAdminBack;
    public Button btnAdminAccountSettingBack;
    public Button btnLogOutAdminAccount;
    public Label lblAdminEmployeeID;
    public TextField txtAdminUserID;
    public Label lblAdminUserID;
    public TextField txtAdminSettingName;
    public Label lblAdminSettingName;
    public TextField txtAdminEmployeID;
    public Button btnAdmin1Login;
    public Button btnResetPasswordBack;
    public Button btnResetPasswordConfirm;
    public TextField txtResetPasswordEmail;
    public Label lblResetpasswordEmail;
    public Label lblResetpassword;
    public Button btnOtpEnterBack;
    public TextField txtOTPEnter;
    public Button btnOTPConfirmation;
    public Label lblEnterOtp;
    public Label lblEnterNewPassword;
    public Button changePasswordLastBack;
    public Button btnChangePasswordLast;
    public TextField txtreenterPassword;
    public TextField txtEnternewPassword;


    private ObservableList<Table> tableItem = FXCollections.observableArrayList();
    private Supplier supplierDetails;
    private ObservableList<Product> product ;
    private ObservableList<Suppliertable> supplierNewProducts =FXCollections.observableArrayList();
    private String SelectedMethod ="byID";
    private static String employeeID=null;
    private static ObservableList<User> userDetails=null;
    private static User userDetail=new User();
    private static Integer otp=null;
    private static Integer givenOTP=null;
    private String email=null;

    OrderBo orderInstence=BoFactory.getInstence().getBo(BoType.ORDER);
    CustomerBo customerInstence=BoFactory.getInstence().getBo(BoType.CUSTOMER);
    SupplierBo supplierInstence=BoFactory.getInstence().getBo(BoType.SUPPLIER);
    ProductBo productInstence=BoFactory.getInstence().getBo(BoType.PRODUCT);
    EmpolyeeBo employeeInstence=BoFactory.getInstence().getBo(BoType.Employee);
    PasswordBo passwordInstence=BoFactory.getInstence().getBo(BoType.PASSWORD);
    EmailBo emailinstence=BoFactory.getInstence().getBo(BoType.EMAIL);
    ObservableList<Table> returnOrderDetails;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadProductID();
        loadPaymentMethod();
        getOrderID();
        loadDateAndTime();
    }

    private void loadPaymentMethod() {
        ObservableList<String> payMentMethod = FXCollections.observableArrayList();
        payMentMethod.add("Cash");
        payMentMethod.add("Bank Transfer");
        payMentMethod.add("Credit Card");
        payMentMethod.add("Debit Card");
        payMentMethod.add("Cheak");
        payMentMethod.add("Gift Voucher");

        choiceBoxPaymentMethod.setItems(payMentMethod);
    }

    private void loadProductID() {
        product = FXCollections.observableArrayList();
        ObservableList<String> ProductID = FXCollections.observableArrayList();
        product=orderInstence.getProduct();
        for(Product productDetails:product){
            ProductID.add(productDetails.getProductID());
        }
        ChoiceBoxProductID.setItems(ProductID);
        choiceBoxUpdateSupplierProducts.setItems(ProductID);
    }

    public void btnUserLoginOnAction(ActionEvent actionEvent) {
        lblCloseLoginOption.setVisible(true);
        lblUserLogin.setVisible(true);
        txtEmail.setVisible(true);
        txtPassword.setVisible(true);
        btnLogin.setVisible(true);
        btnResetPassword.setVisible(true);
        lblUserLogin.setText("User Login");
    }

    public void btnDragDetectted(MouseEvent mouseEvent) {
        btnUserLogin.setStyle("-fx-background-color:#dff9fb");
    }

    public void btnUserLoginOnMouseEntered(MouseEvent mouseEvent) {
        btnUserLogin.setStyle("-fx-background-color:#05c46b");
    }

    public void btnUserLoginOnMouseExited(MouseEvent mouseEvent) {
        btnUserLogin.setStyle("-fx-background-color:#218c74");
    }

    public void btnLoginOnMouseEntered(MouseEvent mouseEvent) {
        btnLogin.setStyle("-fx-background-color:#05c46b");

    }

    public void btnLoginOnMouseExited(MouseEvent mouseEvent) {
        btnLogin.setStyle("-fx-background-color:#218c74");

    }

    public void btnLoginOnAction(ActionEvent actionEvent) {

        Boolean isUser=false;
        String email=txtEmail.getText();
        String password=txtPassword.getText();

        password=passwordInstence.getEncriptedPassword(password);

        loadUser();

        for(User user:userDetails){
            if(user.getEmail().equals(email)){
                if(user.getPassword().equals(password)){
                    isUser=true;
                    user.setPassword("");
                    userDetail=user;
                }
            }
        }
        if(isUser) {
            lblFirstBackGround.setVisible(true);
            DashBoardBackground.setVisible(true);
            tblOrder.setVisible(true);
            txtOrderID.setVisible(true);
            txtQuantity.setVisible(true);
            lblOrderID.setVisible(true);
            lblProductID.setVisible(true);
            lblPaymentMethod.setVisible(true);
            lblTotal.setVisible(true);
            choiceBoxPaymentMethod.setVisible(true);
            txtTotal.setVisible(true);
            btnClearTextBox.setVisible(true);
            btnQuantityAdd.setVisible(true);
            ChoiceBoxProductID.setVisible(true);
            btnAddToCart.setVisible(true);
            lineDashBoard.setVisible(true);
            btnPlaceNewOrder.setVisible(true);
            btnPlaceNewOrder.setVisible(true);
            lblNetTotalTag.setVisible(true);
            lblNetTotal.setVisible(true);
            lblRsTag.setVisible(true);
            OrtherSettingBackground.setVisible(true);
            imgAccountSettings.setVisible(true);
            imgProductSettings.setVisible(true);
            imgSupplierSettings.setVisible(true);
            btnAccountSettings.setVisible(true);
            btnProductSettings.setVisible(true);
            btnSupplierSettings.setVisible(true);
            lineMain.setVisible(true);
            lblUserDashBoard.setVisible(true);
            btnPlaceOrder.setVisible(true);
            lblQuantity.setVisible(true);
            lblCustomerEmail.setVisible(true);
            lblCustomerName.setVisible(true);
            txtCustomerEmail.setVisible(true);
            txtCustomerName.setVisible(true);
            tblColPaymentMethod.setVisible(true);
            tblColTotal.setVisible(true);
            tblColQuantity.setVisible(true);
            tblColProductDesc.setVisible(true);
            tblColOrderID.setVisible(true);
            tblColProductID.setVisible(true);
            b.setVisible(true);
            lblProductDetails.setVisible(true);
            lbldate.setVisible(true);
            Time.setVisible(true);
            lblOrderDetail.setVisible(true);
            cheakTypeNewOrder.setVisible(true);
            cheakTypeReturnOrder.setVisible(true);
            txtPassword.setText("");
            txtEmail.setText("");

            new Alert(Alert.AlertType.INFORMATION,"You Login As "+userDetail.getName()).show();
        }else {
            new Alert(Alert.AlertType.WARNING,"Invalied Login ,Try Again !! ").show();
            txtEmail.setText("");
            txtPassword.setText("");
        }
    }

    public void btnOnActionAddToCart(ActionEvent actionEvent) {

        loadTable();
        setNetTotal();
        ChoiceBoxProductID.setValue("");
        ChoiceBoxProductID.setPromptText("Product ID");
        txtQuantity.setText("");
        txtTotal.setText("");
    }

    public void getOrderID(){
        txtOrderID.setText(orderInstence.getOrderID());
    }

    public void loadTable(){
        tblColOrderID.setCellValueFactory(new PropertyValueFactory<>("OrderID"));
        tblColProductID.setCellValueFactory(new PropertyValueFactory<>("ProductId"));
        tblColProductDesc.setCellValueFactory(new PropertyValueFactory<>("ProductDescription"));
        tblColQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        tblColTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
        tblColPaymentMethod.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));

        Table detail =new Table(
                txtOrderID.getText(),
                ChoiceBoxProductID.getValue().toString(),
                getProductDesc(ChoiceBoxProductID.getValue().toString()),
                Integer.parseInt(txtTotal.getText()),
                Integer.parseInt(txtQuantity.getText()),
                choiceBoxPaymentMethod.getValue().toString()
        );
        tableItem.add(detail);
        tblOrder.setItems(tableItem);
    }

    private String getProductDesc(String id) {
       for(Product productDetail: product){
           if(productDetail.getProductID().equals(id)){
               return productDetail.getProductName();
           }
       }
       return null;
    }

    public void AddOnAction(ActionEvent actionEvent) {
        Integer quantity=Integer.parseInt(txtQuantity.getText());
        String id=ChoiceBoxProductID.getValue().toString();
        Integer total = 0;
        L1:for(Product productDetail: product){
            if(productDetail.getProductID()==id){
                total=productDetail.getUnitPrice();
                break L1;
            }
        }
        txtTotal.setText((total*quantity)+"");
    }
    private void loadDateAndTime() {
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");

        lbldate.setText(f.format(date));

        Timeline timeline = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            LocalTime time = LocalTime.now();
            Time.setText(
                    time.getHour() + " : " + time.getMinute() + " : " + time.getSecond()
            );
        }),

                new KeyFrame(Duration.seconds(1))

        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void setNetTotal(){
        Integer netTotal=0;
        for(Table total: tableItem){
            netTotal+=total.getTotal();
        }
        lblNetTotal.setText(netTotal+"");
    }

    public void placeOrderOnAction(ActionEvent actionEvent) {

        Customer customer=new Customer(
                txtCustomerName.getText(),
                txtCustomerEmail.getText()
        );

        Orders orders =new Orders(
                txtOrderID.getText(),
                userDetail.getUserID(),
                Double.parseDouble(lblNetTotal.getText()),
                lbldate.getText(),
                Time.getText()
                );

        if(customer==null||orders==null) {
            new Alert(Alert.AlertType.WARNING, "Fill The order").show();

        }else{
            PlaceOrder order = new PlaceOrder(
                    customer,
                    orders,
                    tableItem
            );

            Boolean isAdd = orderInstence.placeOrder(order);
            if (isAdd) {
                new Alert(Alert.AlertType.CONFIRMATION, "Order Added ! ").show();

                txtCustomerName.setText("");
                txtCustomerEmail.setText("");
                choiceBoxPaymentMethod.setValue("");
                ChoiceBoxProductID.setValue("");
                choiceBoxPaymentMethod.setPromptText("Payment Method");
                ChoiceBoxProductID.setPromptText("Product ID");
                txtQuantity.setText("");
                txtTotal.setText("");
                lblNetTotal.setText("0");
                getOrderID();
                tableItem.clear();

            } else {
                new Alert(Alert.AlertType.CONFIRMATION, "Order Not Added ! ").show();
                txtCustomerName.setText("");
                txtCustomerEmail.setText("");
                choiceBoxPaymentMethod.setValue("");
                ChoiceBoxProductID.setValue("");
                choiceBoxPaymentMethod.setPromptText("Payment Method");
                ChoiceBoxProductID.setPromptText("Product ID");
                txtQuantity.setText("");
                txtTotal.setText("");
                lblNetTotal.setText("0");
                getOrderID();
                tableItem.clear();
            }
        }
    }

    public void btnLogoutOnAction(ActionEvent actionEvent) {
        lblCloseLoginOption.setVisible(false);
        lblUserLogin.setVisible(false);
        txtEmail.setVisible(false);
        txtPassword.setVisible(false);
        btnLogin.setVisible(false);
        btnResetPassword.setVisible(false);
        lblFirstBackGround.setVisible(false);
        DashBoardBackground.setVisible(false);
        tblOrder.setVisible(false);
        txtOrderID.setVisible(false);
        txtQuantity.setVisible(false);
        lblOrderID.setVisible(false);
        lblProductID.setVisible(false);
        lblPaymentMethod.setVisible(false);
        lblTotal.setVisible(false);
        choiceBoxPaymentMethod.setVisible(false);
        txtTotal.setVisible(false);
        btnClearTextBox.setVisible(false);
        btnQuantityAdd.setVisible(false);
        ChoiceBoxProductID.setVisible(false);
        btnAddToCart.setVisible(false);
        lineDashBoard.setVisible(false);
        btnPlaceNewOrder.setVisible(false);
        btnPlaceNewOrder.setVisible(false);
        lblNetTotalTag.setVisible(false);
        lblNetTotal.setVisible(false);
        lblRsTag.setVisible(false);
        OrtherSettingBackground.setVisible(false);
        imgAccountSettings.setVisible(false);
        imgProductSettings.setVisible(false);
        imgSupplierSettings.setVisible(false);
        btnAccountSettings.setVisible(false);
        btnProductSettings.setVisible(false);
        btnSupplierSettings.setVisible(false);
        lineMain.setVisible(false);
        lblUserDashBoard.setVisible(false);
        btnPlaceOrder.setVisible(false);
        lblQuantity.setVisible(false);
        lblCustomerEmail.setVisible(false);
        lblCustomerName.setVisible(false);
        txtCustomerEmail.setVisible(false);
        txtCustomerName.setVisible(false);
        tblColPaymentMethod.setVisible(false);
        tblColTotal.setVisible(false);
        tblColQuantity.setVisible(false);
        tblColProductDesc.setVisible(false);
        tblColOrderID.setVisible(false);
        tblColProductID.setVisible(false);
        b.setVisible(false);
        lblProductDetails.setVisible(false);
        lbldate.setVisible(false);
        Time.setVisible(false);
        lblOrderDetail.setVisible(false);
        accountSettingsBackground.setVisible(false);
        btnChangePassword.setVisible(false);
        btnLogOut.setVisible(false);
        lblAccountSettingUserName.setVisible(false);
        lblUserName.setVisible(false);
        AccountSettingsBack.setVisible(false);
        lblUserNumber.setVisible(false);
        cheakTypeNewOrder.setVisible(false);
        cheakTypeReturnOrder.setVisible(false);
        btnAdminBack.setVisible(false);
    }

    public void btnChangePasswordOnAction(ActionEvent actionEvent) {
    }

    public void btnAccountSettingsOnAction(ActionEvent actionEvent) {
        imgProductSettings.setVisible(false);
        imgSupplierSettings.setVisible(false);
        btnProductSettings.setVisible(false);
        btnSupplierSettings.setVisible(false);
        btnChangePassword.setVisible(true);
        btnLogOut.setVisible(true);
        lblAccountSettingUserName.setVisible(true);
        lblUserName.setVisible(true);
        AccountSettingsBack.setVisible(true);
        lblUserNumber.setVisible(true);

        String userID = userDetail.getUserID();

        if(Integer.parseInt(userDetail.getUserID())<10){
            userID="0"+userDetail.getUserID();
        }

        lblUserNumber.setText(userID);
        lblUserName.setText(userDetail.getName());
    }

    public void btnAccountSettingGoBackOnAction(ActionEvent actionEvent) {
        imgProductSettings.setVisible(true);
        imgSupplierSettings.setVisible(true);
        btnProductSettings.setVisible(true);
        btnSupplierSettings.setVisible(true);
        btnChangePassword.setVisible(false);
        btnLogOut.setVisible(false);
        lblAccountSettingUserName.setVisible(false);
        lblUserName.setVisible(false);
        AccountSettingsBack.setVisible(false);
        lblUserNumber.setVisible(false);
    }

    public void btnSupplierSettingsOnAction(ActionEvent actionEvent) {
        imgAccountSettings.setVisible(false);
        btnAccountSettings.setVisible(false);
        imgSupplierSettings.setVisible(false);
        btnSupplierSettings.setVisible(false);
        imgProductSettings.setVisible(false);
        btnProductSettings.setVisible(false);
        lblSupplierSetting.setVisible(true);
        imgSupplierSettings1.setVisible(true);
        btnAddSupplier.setVisible(true);
        btnRemoveSupplier.setVisible(true);
        btnUpdateSupplier.setVisible(true);
        btnSupplierSettingsBack.setVisible(true);
    }

    public void btnAddSupplierOnAction(ActionEvent actionEvent) {

        btnAddSupplier.setVisible(false);
        btnUpdateSupplier.setVisible(false);
        btnRemoveSupplier.setVisible(false);
        btnSupplierSettingsBack.setVisible(false);
        btnSupplierSettingsBack.setVisible(false);
        btnAddSupplier1.setVisible(true);
        lblFillSupplierDetails.setVisible(true);
        lblSupplierName.setVisible(true);
        lblSupplierEMail.setVisible(true);
        lblSupplierCompany.setVisible(true);
        txtSupplierName2.setVisible(true);
        txtSupplierEmail2.setVisible(true);
        txtSpplierCompany.setVisible(true);
        btnSupplierSettingsBack.setVisible(true);
        btnAddSupplierToDataBase.setVisible(true);
        btnAddSupplierBack.setVisible(true);
    }

    public void btnSupplierSettingsBackOnAction(ActionEvent actionEvent) {

        imgAccountSettings.setVisible(true);
        btnAccountSettings.setVisible(true);
        imgSupplierSettings.setVisible(true);
        btnSupplierSettings.setVisible(true);
        imgProductSettings.setVisible(true);
        btnProductSettings.setVisible(true);
        lblSupplierSetting.setVisible(false);
        imgSupplierSettings1.setVisible(false);
        btnAddSupplier.setVisible(false);
        btnRemoveSupplier.setVisible(false);
        btnUpdateSupplier.setVisible(false);
        btnSupplierSettingsBack.setVisible(false);
        btnAddSupplierBack.setVisible(false);

    }

    public void btnAddSupplierToDataBaseOnAction(ActionEvent actionEvent) {
        Supplier supplier=new Supplier(
                txtSupplierName2.getText(),
                txtSupplierEmail2.getText(),
                txtSpplierCompany.getText()
        );
        Boolean isAdded=supplierInstence.addNewSupplier(supplier);

        if(isAdded) {
            new Alert(Alert.AlertType.CONFIRMATION, "Supplier Added ! ").show();
            txtSpplierCompany.setText("");
            txtSupplierEmail2.setText("");
            txtSupplierName2.setText("");
        }else{
            new Alert(Alert.AlertType.CONFIRMATION, "Supplier Not Added! ").show();
            txtSpplierCompany.setText("");
            txtSupplierEmail2.setText("");
            txtSupplierName2.setText("");
        }

    }

    public void btnAddSupplierBackOnAction(ActionEvent actionEvent) {

        btnAddSupplier.setVisible(true);
        btnUpdateSupplier.setVisible(true);
        btnRemoveSupplier.setVisible(true);
        btnSupplierSettingsBack.setVisible(true);
        btnAddSupplier1.setVisible(false);
        lblFillSupplierDetails.setVisible(false);
        lblSupplierName.setVisible(false);
        lblSupplierEMail.setVisible(false);
        lblSupplierCompany.setVisible(false);
        txtSupplierName2.setVisible(false);
        txtSupplierEmail2.setVisible(false);
        txtSpplierCompany.setVisible(false);
        btnSupplierSettingsBack.setVisible(false);
        btnAddSupplierToDataBase.setVisible(false);
        btnAddSupplierBack.setVisible(false);
        btnSupplierSettingsBack.setVisible(true);

    }

    public void btnUpdateSupplierOnAction(ActionEvent actionEvent) {
        btnUpdateSupplier.setVisible(false);
        btnAddSupplier.setVisible(false);
        btnRemoveSupplier.setVisible(false);
        btnSupplierSettingsBack.setVisible(false);
        btnAddSupplierBack.setVisible(false);
        btnAddSupplierBack.setVisible(false);
        lblSupplierSetting.setVisible(true);
        imgSupplierSettings1.setVisible(true);
        btnUpdateSupplier1.setVisible(true);
        cheakByName.setVisible(true);
        chekByID.setVisible(true);
        btnEnterSuppierID.setVisible(true);
        btnUpdateDetails.setVisible(true);
        btnSupplierSettingsBack.setVisible(true);
        brnSupplierSettingsBack.setVisible(true);
    }

    public void brnSupplierSettingsBackOnAction(ActionEvent actionEvent) {
        cheakByName.setVisible(false);
        chekByID.setVisible(false);
        btnUpdateSupplier1.setVisible(false);
        btnEnterSuppierID.setVisible(false);
        btnUpdateDetails.setVisible(false);
        brnSupplierSettingsBack.setVisible(false);
        btnUpdateSupplier.setVisible(true);
        btnAddSupplier.setVisible(true);
        btnRemoveSupplier.setVisible(true);
        btnSupplierSettingsBack.setVisible(true);
        lblSupplierSetting.setVisible(true);
        btnEnterSuppierID.setText("");

    }

    public void btnUpdateDetailsOnAction(ActionEvent actionEvent) {
        lblSupplierSetting.setVisible(false);
        imgSupplierSettings1.setVisible(false);
        btnUpdateSupplier1.setVisible(false);
        cheakByName.setVisible(false);
        chekByID.setVisible(false);
        btnEnterSuppierID.setVisible(false);
        btnUpdateDetails.setVisible(false);
        brnSupplierSettingsBack.setVisible(false);
        btnSupplierSettingsBack.setVisible(false);
        lblSupplierSetting.setVisible(true);
        imgSupplierSettings1.setVisible(true);
        lblSupplierID.setVisible(true);
        txtSupplierEmail3.setVisible(true);
        txtSupplier3Name.setVisible(true);
        txtSupplierCompany.setVisible(true);
        btnSupplierProductUpdate.setVisible(true);
        btnSupplierUpdate2Back.setVisible(true);
        btnUpdateSupplierDataBase.setVisible(true);

        String method=btnEnterSuppierID.getText();
        loadSupplierDetails(method);

    }

    private void loadSupplierDetails(String method) {
        if(SelectedMethod.equals("byID")){
            supplierDetails =supplierInstence.getSupplierDetailByID(method);
        }else{
            supplierDetails=supplierInstence.getSupplierDetailByName((method));
        }
        loadSupplierDetailTables(supplierDetails);
    }

    private void loadSupplierDetailTables(Supplier supplierDetails) {
        txtSupplierEmail3.setText(supplierDetails.getSupplierEmail());
        txtSupplier3Name.setText(supplierDetails.getSupplierName());
        txtSupplierCompany.setText(supplierDetails.getCompany());
        lblSupplierID.setText(supplierDetails.getSupplierId());

        loadSupplierPastTable();
        loadproductList();
    }

    public void btnUpdateSupplierDataBaseOnAction(ActionEvent actionEvent) {
    }

    public void btnSupplierUpdate2BackOnAction(ActionEvent actionEvent) {
        lblSupplierSetting.setVisible(true);
        imgSupplierSettings1.setVisible(true);
        btnUpdateSupplier1.setVisible(true);
        cheakByName.setVisible(true);
        chekByID.setVisible(true);
        btnEnterSuppierID.setVisible(true);
        btnUpdateDetails.setVisible(true);
        brnSupplierSettingsBack.setVisible(true);
        btnSupplierSettingsBack.setVisible(true);
        lblSupplierSetting.setVisible(false);
        imgSupplierSettings1.setVisible(false);
        lblSupplierID.setVisible(false);
        txtSupplierEmail3.setVisible(false);
        txtSupplier3Name.setVisible(false);
        txtSupplierCompany.setVisible(false);
        btnSupplierProductUpdate.setVisible(false);
        btnSupplierUpdate2Back.setVisible(false);
        btnUpdateSupplierDataBase.setVisible(false);
        lblSupplierSetting.setVisible(true);
        imgSupplierSettings1.setVisible(true);
    }

    public void btnSpplierProductUpdateOnAction(ActionEvent actionEvent) {
        lblSupplierSetting.setVisible(true);
        imgSupplierSettings1.setVisible(false);
        lblSupplierID.setVisible(false);
        txtSupplierEmail3.setVisible(false);
        txtSupplier3Name.setVisible(false);
        txtSupplierCompany.setVisible(false);
        btnSupplierProductUpdate.setVisible(false);
        btnSupplierUpdate2Back.setVisible(false);
        btnUpdateSupplierDataBase.setVisible(false);
        tableSupplierPastProducts.setVisible(true);
        lblupdateProductList.setVisible(true);
        tblSupplierCurrentDescription.setVisible(true);
        choiceBoxUpdateSupplierProducts.setVisible(true);
        btnAddNewProducts.setVisible(true);
        tblSupplierCurrentProducts.setVisible(true);
        btnUpdateProductList.setVisible(true);
        btnSupplierUpdateBack4OnAction.setVisible(true);


    }

    private void loadproductList() {
    }

    private void loadSupplierPastTable() {

        ObservableList<Suppliertable> supplierTableItems= FXCollections.observableArrayList();

        tblSupplerPastProductID.setCellValueFactory(new PropertyValueFactory<>("productID"));
        tblSupplierPastDescription.setCellValueFactory(new PropertyValueFactory<>("productDesc"));

        loadProductID();
        for(String productList:supplierDetails.getProductList()){
            Suppliertable tableitem=new Suppliertable(
                    productList,
                    getProductDesc(productList)
            );
            supplierTableItems.add(tableitem);
        }
        tableSupplierPastProducts.setItems(supplierTableItems);
    }

    public void btnAddNewProductsOnAction(ActionEvent actionEvent) {

        tblSupplierCurrentProductID.setCellValueFactory(new PropertyValueFactory<>("productID"));
        tblSupplierCurrentDescription.setCellValueFactory(new PropertyValueFactory<>("productDesc"));


        Suppliertable tableitems =new Suppliertable(
                choiceBoxUpdateSupplierProducts.getValue().toString(),
                getProductDesc(choiceBoxUpdateSupplierProducts.getValue().toString())
        );
        supplierNewProducts.add(tableitems);
        tblSupplierCurrentProducts.setItems(supplierNewProducts);
    }

    public void btnUpdateProductListOnAction(ActionEvent actionEvent) {

        Boolean isAdded=supplierInstence.updateSupplierProducts(supplierNewProducts,supplierDetails.getSupplierId());

        if(isAdded) {
            new Alert(Alert.AlertType.CONFIRMATION, "Supplier Products Updated ! ").show();
            supplierNewProducts.clear();
            loadSupplierPastTable();
        }else{
            new Alert(Alert.AlertType.WARNING, "Supplier Products Not Updated! ").show();

        }
        supplierNewProducts=FXCollections.observableArrayList();
    }

    public void btnSupplierUpdateBack4OnActionOnAction(ActionEvent actionEvent) {

        lblSupplierSetting.setVisible(true);
        imgSupplierSettings1.setVisible(true);
        lblSupplierID.setVisible(true);
        txtSupplierEmail3.setVisible(true);
        txtSupplier3Name.setVisible(true);
        txtSupplierCompany.setVisible(true);
        btnSupplierProductUpdate.setVisible(true);
        btnSupplierUpdate2Back.setVisible(true);
        btnUpdateSupplierDataBase.setVisible(true);
        tableSupplierPastProducts.setVisible(false);
        lblupdateProductList.setVisible(false);
        tblSupplierCurrentDescription.setVisible(false);
        choiceBoxUpdateSupplierProducts.setVisible(false);
        btnAddNewProducts.setVisible(false);
        tblSupplierCurrentProducts.setVisible(false);
        btnUpdateProductList.setVisible(false);
        btnSupplierUpdateBack4OnAction.setVisible(false);

    }

    public void CheakByIdOnAction(ActionEvent actionEvent) {
        cheakByName.setSelected(false);
        btnEnterSuppierID.setPromptText("Enter Supplier ID");
        SelectedMethod ="byID";
    }

    public void cheakByNameOnAction(ActionEvent actionEvent) {
        chekByID.setSelected(false);
        btnEnterSuppierID.setPromptText("Enter Supplier Name");
        SelectedMethod ="byName";
    }

    public void btnRemoveSupplierOnAction(ActionEvent actionEvent) {

        btnAddSupplier.setVisible(false);
        btnUpdateSupplier.setVisible(false);
        btnRemoveSupplier.setVisible(false);
        btnSupplierSettingsBack.setVisible(false);
        btnRemoveSupplier1.setVisible(true);
        labelRemoveSupplierID.setVisible(true);
        txtRemoveSupplierID.setVisible(true);
        btnDelateSupplier.setVisible(true);
        btnRemoveSuppilerBack.setVisible(true);

    }

    public void btnRemoveSuppilerBackonAction(ActionEvent actionEvent) {
        btnAddSupplier.setVisible(true);
        btnUpdateSupplier.setVisible(true);
        btnRemoveSupplier.setVisible(true);
        btnSupplierSettingsBack.setVisible(true);
        btnRemoveSupplier1.setVisible(false);
        labelRemoveSupplierID.setVisible(false);
        txtRemoveSupplierID.setVisible(false);
        btnDelateSupplier.setVisible(false);
        btnRemoveSuppilerBack.setVisible(false);
        txtRemoveSupplierID.setText("");
    }

    public void btnDelateSupplierOnAction(ActionEvent actionEvent) {
        loadSupplierDetails(txtRemoveSupplierID.getText());
        Boolean isAdded=supplierInstence.RemoveSupplier(supplierDetails);

        if(isAdded) {
            new Alert(Alert.AlertType.CONFIRMATION, "Supplier Delate Sucssfully ! ").show();
            txtRemoveSupplierID.setText("");
        }else{
            new Alert(Alert.AlertType.WARNING, "Supplier Not Deleted ").show();
            txtRemoveSupplierID.setText("");
        }
    }

    public void btnProductSettingsOnAction(ActionEvent actionEvent) {
        imgAccountSettings.setVisible(false);
        btnAccountSettings.setVisible(false);
        imgSupplierSettings.setVisible(false);
        btnSupplierSettings.setVisible(false);
        imgProductSettings.setVisible(false);
        btnProductSettings.setVisible(false);
        lblProductSettings.setVisible(true);
        imgProductSettings3.setVisible(true);
        btnUpdateProduct.setVisible(true);
        btnAddProduct.setVisible(true);
        btnRemoveProduct.setVisible(true);
        btnProductDetails.setVisible(true);
        btnProductSettingsback.setVisible(true);
    }

    public void btnProductSettingsbackOnAction(ActionEvent actionEvent) {
        imgAccountSettings.setVisible(true);
        btnAccountSettings.setVisible(true);
        imgSupplierSettings.setVisible(true);
        btnSupplierSettings.setVisible(true);
        imgProductSettings.setVisible(true);
        btnProductSettings.setVisible(true);
        lblProductSettings.setVisible(false);
        imgProductSettings3.setVisible(false);
        btnUpdateProduct.setVisible(false);
        btnAddProduct.setVisible(false);
        btnRemoveProduct.setVisible(false);
        btnProductDetails.setVisible(false);
        btnProductSettingsback.setVisible(false);
        btnProductDetails.setText("Product Details");

    }

    public void btnProductDetailsOnAction(ActionEvent actionEvent) {
        btnAddProduct.setVisible(false);
        btnRemoveProduct.setVisible(false);
        btnUpdateProduct.setVisible(false);
        btnProductSettingsback.setVisible(false);
        cheakBoxProductName.setVisible(true);
        cheakBoxproductID.setVisible(true);
        txtProductID.setVisible(true);
        btnSearchProduct.setVisible(true);
        btnProductDetailsBack.setVisible(true);
    }

    public void btnUpdateProductOnAction(ActionEvent actionEvent) {
        btnAddProduct.setVisible(false);
        btnRemoveProduct.setVisible(false);
        btnUpdateProduct.setVisible(false);
        btnProductSettingsback.setVisible(false);
        cheakBoxProductName.setVisible(true);
        cheakBoxproductID.setVisible(true);
        txtProductID.setVisible(true);
        btnProductDetails.setText("Update Product");
        btnProductDetailsBack.setVisible(true);
        btnProductupdateDetails.setVisible(true);

    }

    public void btnAddProductOnAction(ActionEvent actionEvent) {
        btnProductDetails.setVisible(false);
        btnRemoveProduct.setVisible(false);
        btnUpdateProduct.setVisible(false);
        btnProductDetails.setVisible(false);
        btnProductSettingsback.setVisible(false);
        btnAddProduct.setVisible(false);
        lblproductAddName.setVisible(true);
        txtproductAddName.setVisible(true);
        lblproductAddSize.setVisible(true);
        txtproductAddSize.setVisible(true);
        lblproductAddUnitPrice.setVisible(true);
        txtproductAddUnitPrice.setVisible(true);
        lblproductAddQuantity.setVisible(true);
        txtproductAddQuantity.setVisible(true);
        lblproductAddCategory.setVisible(true);
        choiceBoxproductAddCategory.setVisible(true);
        btnLastAddProduct.setVisible(true);
        btnLastAddProductBack.setVisible(true);
        
        loadAddProductCategory();

    }

    private void loadAddProductCategory() {
        ObservableList<String> CategoryNameList=productInstence.getCategoryList();
        choiceBoxproductAddCategory.setItems(CategoryNameList);
    }

    public void btnRemoveProductOnAction(ActionEvent actionEvent) {
        btnAddProduct.setVisible(false);
        btnRemoveProduct.setVisible(false);
        btnUpdateProduct.setVisible(false);
        btnProductSettingsback.setVisible(false);
        cheakBoxProductName.setVisible(true);
        cheakBoxproductID.setVisible(true);
        txtProductID.setVisible(true);
        btnProductDetails.setText("Remove Product");
        btnProductDetailsBack.setVisible(true);
        btnRemoveProductDelate.setVisible(true);

    }

    public void btnSearchProductOnAction(ActionEvent actionEvent) {
        btnProductDetails.setVisible(false);
        cheakBoxProductName.setVisible(false);
        cheakBoxproductID.setVisible(false);
        txtProductID.setVisible(false);
        btnSearchProduct.setVisible(false);
        btnProductSettingsback.setVisible(false);
        btnAddProduct.setVisible(false);
        btnRemoveProduct.setVisible(false);
        btnUpdateProduct.setVisible(false);
        btnProductSettingsback.setVisible(false);
        cheakBoxProductName.setVisible(false);
        btnProductDetailsBack.setVisible(false);
        cheakBoxproductID.setVisible(false);
        txtProductID.setVisible(false);
        btnSearchProduct.setVisible(false);
        btnProductDetailsBack.setVisible(false);
        lblProductSettingID.setVisible(true);
        txtProductSettingID.setVisible(true);
        lblProductSettingDesc.setVisible(true);
        txtProductSettingDesc.setVisible(true);
        lblProductSettingQTYOnHand.setVisible(true);
        txtProductSettingQTY.setVisible(true);
        lblProductSettingSize.setVisible(true);
        txtProductSettingSize.setVisible(true);
        lblProductSettingUnitPrice.setVisible(true);
        txtProductSettingUnitPrice.setVisible(true);
        btnProductIDLastBack.setVisible(true);

        loadPrductDetails();
    }

    private void loadPrductDetails() {
        if(SelectedMethod.equals("byID")){
           Product productdetails=productInstence.getProductdetails(txtProductID.getText(),"byID");
           txtProductSettingID.setText(productdetails.getProductID());
           txtProductSettingDesc.setText(productdetails.getProductName());
           txtProductSettingSize.setText(productdetails.getSize());
           txtProductSettingQTY.setText(productdetails.getQuantityOnHand()+"");
           txtProductSettingUnitPrice.setText(productdetails.getUnitPrice()+"");
        }else {
               
        }
    }

    public void btnProductDetailsBackoAction(ActionEvent actionEvent) {
        btnAddProduct.setVisible(true);
        btnRemoveProduct.setVisible(true);
        btnUpdateProduct.setVisible(true);
        btnProductSettingsback.setVisible(false);
        cheakBoxProductName.setVisible(true);
        cheakBoxproductID.setVisible(true);
        txtProductID.setVisible(false);
        btnSearchProduct.setVisible(true);
        btnProductDetailsBack.setVisible(false);
        cheakBoxProductName.setVisible(false);
        cheakBoxproductID.setVisible(false);
        txtProductSettingID.setVisible(false);
        btnSearchProduct.setVisible(false);
        btnProductSettingsback.setVisible(true);
        btnRemoveProductDelate.setVisible(false);
        btnProductDetails.setText("Product Details");
        btnProductupdateDetails.setVisible(true);
        btnProductupdateDetails.setVisible(false);

    }

    public void btnProductIDLastBackOnAction(ActionEvent actionEvent) {
        btnAddProduct.setVisible(false);
        btnRemoveProduct.setVisible(false);
        btnUpdateProduct.setVisible(false);
        btnProductSettingsback.setVisible(false);
        cheakBoxProductName.setVisible(true);
        btnProductDetailsBack.setVisible(true);
        cheakBoxproductID.setVisible(true);
        txtProductID.setVisible(true);
        btnSearchProduct.setVisible(true);
        btnProductDetailsBack.setVisible(true);
        lblProductSettingID.setVisible(false);
        txtProductSettingID.setVisible(false);
        lblProductSettingDesc.setVisible(false);
        txtProductSettingDesc.setVisible(false);
        lblProductSettingQTYOnHand.setVisible(false);
        txtProductSettingQTY.setVisible(false);
        lblProductSettingSize.setVisible(false);
        txtProductSettingSize.setVisible(false);
        lblProductSettingUnitPrice.setVisible(false);
        txtProductSettingUnitPrice.setVisible(false);
        btnProductIDLastBack.setVisible(false);
        btnProductDetails.setVisible(true);
    }

    public void btnLastAddProductBackOnAction(ActionEvent actionEvent) {
        btnProductDetails.setVisible(true);
        btnRemoveProduct.setVisible(true);
        btnUpdateProduct.setVisible(true);
        btnProductDetails.setVisible(true);
        btnProductSettingsback.setVisible(true);
        btnAddProduct.setVisible(true);
        lblproductAddName.setVisible(false);
        txtproductAddName.setVisible(false);
        lblproductAddSize.setVisible(false);
        txtproductAddSize.setVisible(false);
        lblproductAddUnitPrice.setVisible(false);
        txtproductAddUnitPrice.setVisible(false);
        lblproductAddQuantity.setVisible(false);
        txtproductAddQuantity.setVisible(false);
        lblproductAddCategory.setVisible(false);
        choiceBoxproductAddCategory.setVisible(false);
        btnLastAddProduct.setVisible(false);
        btnLastAddProductBack.setVisible(false);
    }

    public void btnLastAddProductOnAction(ActionEvent actionEvent) {
        Product newProduct=new Product(
           txtproductAddName.getText(),
           txtproductAddSize.getText(),
           Integer.parseInt(txtproductAddQuantity.getText()),
           Integer.parseInt(txtproductAddUnitPrice.getText()),
           choiceBoxproductAddCategory.getValue().toString()
        );
        Boolean isAdded=productInstence.addNewProduct(newProduct);
        if(isAdded) {
            new Alert(Alert.AlertType.CONFIRMATION, "Product Added Sucssfully ! ").show();
            txtRemoveSupplierID.setText("");
        }else{
            new Alert(Alert.AlertType.WARNING, "Product Not Added").show();
            txtRemoveSupplierID.setText("");
        }
    }

    public void btnremoveProductDelateOnAction(ActionEvent actionEvent) {
        Boolean isAdded=productInstence.removeproduct(txtProductID.getText());
        if(isAdded) {
            new Alert(Alert.AlertType.CONFIRMATION, "Product Removed Sucssfully ! ").show();
            txtRemoveSupplierID.setText("");
        }else{
            new Alert(Alert.AlertType.WARNING, "Product Not Removed").show();
            txtRemoveSupplierID.setText("");
        }
    }

    public void btnProductupdateDetailsOmAction(ActionEvent actionEvent) {
        btnProductupdateDetails.setVisible(false);
        cheakBoxProductName.setVisible(false);
        cheakBoxproductID.setVisible(false);
        txtProductID.setVisible(false);
        btnProductupdateDetails.setVisible(false);
        btnProductDetailsBack.setVisible(false);
        btnProductDetails.setVisible(false);
        lblProductSettingID.setVisible(true);
        txtProductSettingID.setVisible(true);
        lblProductSettingDesc.setVisible(true);
        txtProductSettingDesc.setVisible(true);
        lblProductSettingQTYOnHand.setVisible(true);
        txtProductSettingQTY.setVisible(true);
        lblProductSettingSize.setVisible(true);
        txtProductSettingSize.setVisible(true);
        lblProductSettingUnitPrice.setVisible(true);
        txtProductSettingUnitPrice.setVisible(true);
        btnProductUpdatelastback.setVisible(true);
        btnLastUpdate.setVisible(true);

        loadPrductDetails();
    }

    public void btnProductUpdatelastbackOnAction(ActionEvent actionEvent) {
        btnProductupdateDetails.setVisible(true);
        cheakBoxProductName.setVisible(true);
        cheakBoxproductID.setVisible(true);
        txtProductID.setVisible(true);
        btnProductupdateDetails.setVisible(true);
        btnProductDetailsBack.setVisible(true);
        btnProductDetails.setVisible(true);
        lblProductSettingID.setVisible(false);
        txtProductSettingID.setVisible(false);
        lblProductSettingDesc.setVisible(false);
        txtProductSettingDesc.setVisible(false);
        lblProductSettingQTYOnHand.setVisible(false);
        txtProductSettingQTY.setVisible(false);
        lblProductSettingSize.setVisible(false);
        txtProductSettingSize.setVisible(false);
        lblProductSettingUnitPrice.setVisible(false);
        txtProductSettingUnitPrice.setVisible(false);
        btnProductUpdatelastback.setVisible(false);
        btnLastUpdate.setVisible(false);
    }

    public void btnLastUpdateOnAction(ActionEvent actionEvent) {
        Product updateProduct=new Product(
                txtProductSettingID.getText(),
                txtProductSettingDesc.getText(),
                txtProductSettingSize.getText(),
                Integer.parseInt(txtProductSettingQTY.getText()),
                Integer.parseInt(txtProductSettingUnitPrice.getText())
        );
        Boolean isAdded=productInstence.UpdateProduct(updateProduct);
        if(isAdded) {
            new Alert(Alert.AlertType.CONFIRMATION, "Product Updated Sucssfully ! ").show();
            txtRemoveSupplierID.setText("");
        }else{
            new Alert(Alert.AlertType.WARNING, "Product Not Updated").show();
            txtRemoveSupplierID.setText("");
        }
    }

    public void btnAccountSettingsOnmouseEntered(MouseEvent mouseEvent) {
        btnAccountSettings.setStyle("-fx-background-color: #94f0f7");
    }

    public void btnProductSettingsEnterd(MouseEvent mouseEvent) {
        btnProductSettings.setStyle("-fx-background-color: #94f0f7");

    }

    public void btnProductSettingsExist(MouseEvent mouseEvent) {
        btnProductSettings.setStyle("-fx-background-color: #dff9fb");
    }

    public void btnAccountSettingsOnmouseExisted(MouseEvent mouseEvent) {
        btnAccountSettings.setStyle("-fx-background-color: #dff9fb");
    }

    public void btnSupplierSettingsentered(MouseEvent mouseEvent) {
        btnSupplierSettings.setStyle("-fx-background-color: #94f0f7");

    }

    public void btnSupplierSettingsExisted(MouseEvent mouseEvent) {
        btnSupplierSettings.setStyle("-fx-background-color: #dff9fb");
    }

    public void btnAddToCartEnterrd(MouseEvent mouseEvent) {
        btnAddToCart.setStyle("-fx-background-color: #94f0f7");
    }

    public void btnAddToCartExited(MouseEvent mouseEvent) {
        btnAddToCart.setStyle("-fx-background-color: #dff9fb");
    }

    public void btnClearTextBoxEntered(MouseEvent mouseEvent) {
        btnClearTextBox.setStyle("-fx-background-color: #94f0f7");
    }

    public void btnClearTextBoxExited(MouseEvent mouseEvent) {
        btnClearTextBox.setStyle("-fx-background-color: #dff9fb");
    }

    public void AddOnActionEntered(MouseEvent mouseEvent) {
        btnQuantityAdd.setStyle("-fx-background-color: #94f0f7");
    }

    public void AddOnActionExited(MouseEvent mouseEvent) {
        btnQuantityAdd.setStyle("-fx-background-color: #dff9fb");
    }

    public void btnPlaceNewOrderEnterd(MouseEvent mouseEvent) {
        btnPlaceNewOrder.setStyle("-fx-background-color:#fc5c65");
    }

    public void btnPlaceNewOrderExited(MouseEvent mouseEvent) {
        btnPlaceNewOrder.setStyle("-fx-background-color:#b71540");

    }

    public void btnPlaceOrderEntered(MouseEvent mouseEvent) {
        btnPlaceOrder.setStyle("-fx-background-color:#05c46b");
    }

    public void btnPlaceOrderExited(MouseEvent mouseEvent) {
        btnPlaceOrder.setStyle("-fx-background-color:#218c74");
    }

    public void btnLogOutEntered(MouseEvent mouseEvent) {
        btnLogOut.setStyle("-fx-background-color:#EA2027");

    }

    public void btnLogOutExited(MouseEvent mouseEvent) {
        btnLogOut.setStyle("-fx-background-color: #b71540");
    }


    public void cheakTypeReturnOrderOnAction(ActionEvent actionEvent) {
        returnCustomerBackground.setVisible(true);
        cheakTypeNewOrder.setSelected(false);
        tblOrder.setVisible(true);
        txtOrderID.setVisible(false);
        lblNetTotalTag.setVisible(false);
        lblRsTag.setVisible(false);
        lblNetTotal.setVisible(false);
        lblReturnCustomer.setVisible(true);
        lblReturnOrderID.setVisible(true);
        lblreturnItems.setVisible(true);
        comboBoxReturnOrderItem.setVisible(true);
        lblReturnProductQuantity.setVisible(true);
        txtReturnOrderID.setVisible(true);
        txtReturnProductQuantity.setVisible(true);
        btnReturn.setVisible(true);
        BtnReturnOrderAdd.setVisible(true);
        tblOrder1.setVisible(true);
        tblOrder.setVisible(false);
        tblColOrderID1.setVisible(true);
        tblColPaymentMethod1.setVisible(true);
        tblColProductDesc1.setVisible(true);
        tblColProductID1.setVisible(true);
        tblColQuantity1.setVisible(true);
        tblColTotal1.setVisible(true);
    }

    public void cheakTypeNewOrderOnAction(ActionEvent actionEvent) {
        returnCustomerBackground.setVisible(false);
        cheakTypeReturnOrder.setSelected(false);
        cheakTypeNewOrder.setSelected(true);
        tblOrder.setVisible(true);
        txtOrderID.setVisible(true);
        lblNetTotalTag.setVisible(true);
        lblRsTag.setVisible(true);
        lblNetTotal.setVisible(true);
        lblReturnCustomer.setVisible(false);
        txtReturnOrderID.setVisible(false);
        lblReturnOrderID.setVisible(false);
        lblreturnItems.setVisible(false);
        comboBoxReturnOrderItem.setVisible(false);
        lblReturnProductQuantity.setVisible(false);
        txtReturnProductQuantity.setVisible(false);
        btnReturn.setVisible(false);
        BtnReturnOrderAdd.setVisible(false);
        tblOrder1.setVisible(false);
        tblOrder.setVisible(true);
    }


    public void btnReturnOnAction(ActionEvent actionEvent) {
        Integer retunQuantity=Integer.parseInt(txtReturnProductQuantity.getText());
        Integer retunTotal=getretunItemTotal(comboBoxReturnOrderItem.getValue().toString());

        ReturnOrder returnOrder= new ReturnOrder(
            txtReturnOrderID.getText(),
            getreturnProductID(comboBoxReturnOrderItem.getValue().toString()),
            Integer.parseInt(txtReturnProductQuantity.getText()),
            retunTotal*retunQuantity*1.000
        );

        Boolean isAdded=orderInstence.returnOrder(returnOrder);
        if(isAdded) {
            new Alert(Alert.AlertType.CONFIRMATION, "Order Retured Sucssfully ! ").show();
            txtRemoveSupplierID.setText("");
        }else{
            new Alert(Alert.AlertType.WARNING, "Order Not Returned").show();
            txtRemoveSupplierID.setText("");
        }

   }

    public void BtnReturnOrderAddOnAction(ActionEvent actionEvent) {
        String Id=txtReturnOrderID.getText();
        returnOrderDetails=orderInstence.getReturnOrderDetails(Id);
        ObservableList<String> loadItemList=FXCollections.observableArrayList();

        tblColOrderID1.setCellValueFactory(new PropertyValueFactory<>("OrderID"));
        tblColProductID1.setCellValueFactory(new PropertyValueFactory<>("ProductId"));
        tblColProductDesc1.setCellValueFactory(new PropertyValueFactory<>("ProductDescription"));
        tblColQuantity1.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        tblColTotal1.setCellValueFactory(new PropertyValueFactory<>("total"));
        tblColPaymentMethod1.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));

        for(Table retundetail:returnOrderDetails){
            loadItemList.add(retundetail.getProductDescription());
        }

        comboBoxReturnOrderItem.setItems(loadItemList);
        tblOrder1.setItems(returnOrderDetails);

    }
    public String getreturnProductID(String Name) {
        for(Table returnOrders:returnOrderDetails) {
            if (Name .equals(returnOrders.getProductDescription())){
                return returnOrders.getProductId();
            }
        }
        return null;
    }

    public Integer getretunItemTotal(String name){
        for(Table returnOrders:returnOrderDetails) {
            if (name .equals(returnOrders.getProductDescription())){
                return returnOrders.getTotal()/returnOrders.getQuantity();
            }
        }
        return null;
    }


    public void btnAdminLoginOnAction(ActionEvent actionEvent) {

        lblCloseLoginOption.setVisible(true);
        lblUserLogin.setVisible(true);
        txtEmail.setVisible(true);
        txtPassword.setVisible(true);
        btnAdmin1Login.setVisible(true);
        btnResetPassword.setVisible(true);
        lblUserLogin.setText("Admin Login");
    }

    public void btnAdminChangeUserOnActionOnAction(ActionEvent actionEvent) {

    }

    public void btnAdminEmployeeSettingOnAction(ActionEvent actionEvent) {
       imgAccountSettings.setVisible(false);
        btnAdminAccountSetting.setVisible(false);
        imgAdminEmployeeSetting.setVisible(false);
        btnAdminEmployeeSetting.setVisible(false);
        imgAdminChangeUser.setVisible(false);
        btnAdminChangeUser.setVisible(false);
        lblEmpolyeeSetting.setVisible(true);
        imgAdminEmployeeSetting1.setVisible(true);
        btnAddEmpolye.setVisible(true);
        btnUpdateEmpolyee.setVisible(true);
        btnRemoveempolyee.setVisible(true);
        btnEmpolyeeSettingBack.setVisible(true);
    }

    public void btnAdminAccountSettingOnAction(ActionEvent actionEvent) {
        lblAdminSettingName.setVisible(true);
        txtAdminSettingName.setVisible(true);
        lblAdminUserID.setVisible(true);
        txtAdminUserID.setVisible(true);
        lblAdminEmployeeID.setVisible(true);
        btnLogOutAdminAccount.setVisible(true);
        btnAdminAccountSettingBack.setVisible(true);
        txtAdminEmployeID.setVisible(true);
        imgAdminEmployeeSetting.setVisible(false);
        imgAdminChangeUser.setVisible(false);
        btnAdminEmployeeSetting.setVisible(false);
        btnAdminChangeUser.setVisible(false);

    }

    public void btnUpdateEmpolyeeOnAction(ActionEvent actionEvent) {
        btnAddEmpolye.setVisible(false);
        btnUpdateEmpolyee.setVisible(false);
        btnRemoveempolyee.setVisible(false);
        btnEmpolyeeSettingBack.setVisible(false);
        choiceBoxupdateByID.setVisible(true);
        choiceBoxUpdateByName.setVisible(true);
        TxtUpdateEmployee.setVisible(true);
        btnUpdateEmployeeSearch.setVisible(true);
        btnUpdateEmployeeback.setVisible(true);

    }

    public void btnAddEmpolyeOnAction(ActionEvent actionEvent) {
        btnAddEmpolye.setVisible(false);
        btnUpdateEmpolyee.setVisible(false);
        btnRemoveempolyee.setVisible(false);
        btnEmpolyeeSettingBack.setVisible(false);
        lblAddEmployeeName.setVisible(true);
        txtAddEmployeeName.setVisible(true);
        lblAddEmployeeEmail.setVisible(true);
        txtAddEmployeeEmail.setVisible(true);
        lblEmployeeJobRole.setVisible(true);
        txtEmployeeJobRole.setVisible(true);
        lblAddEmployeeSalary.setVisible(true);
        txtAddEmployeeSalary.setVisible(true);
        choiseSelectAsUser.setVisible(true);
        btnAddEmployeeToDataBase.setVisible(true);
        btnAddEmployeeBack.setVisible(true);
    }

    public void btnEmpolyeeSettingBackOnAction(ActionEvent actionEvent) {
        imgAccountSettings.setVisible(true);
        btnAdminAccountSetting.setVisible(true);
        imgAdminEmployeeSetting.setVisible(true);
        btnAdminEmployeeSetting.setVisible(true);
        imgAdminChangeUser.setVisible(true);
        btnAdminChangeUser.setVisible(true);
        btnAdminChangeUser.setVisible(true);
        lblEmpolyeeSetting.setVisible(false);
        imgAdminEmployeeSetting1.setVisible(false);
        btnAddEmpolye.setVisible(false);
        btnUpdateEmpolyee.setVisible(false);
        btnRemoveempolyee.setVisible(false);
        btnEmpolyeeSettingBack.setVisible(false);
    }
    public void btnRemoveempolyeeOnAction(ActionEvent actionEvent) {
        btnAddEmpolye.setVisible(false);
        btnUpdateEmpolyee.setVisible(false);
        btnRemoveempolyee.setVisible(false);
        btnEmpolyeeSettingBack.setVisible(false);
        lblRemoveEmployee.setVisible(true);
        txtRemoveEmployee.setVisible(true);
        btnDelateEmployee.setVisible(true);
        btnRemoveEmployeeBack.setVisible(true);
    }

    public void btnAddEmployeeBackOnAction(ActionEvent actionEvent) {
        btnAddEmpolye.setVisible(true);
        btnUpdateEmpolyee.setVisible(true);
        btnRemoveempolyee.setVisible(true);
        btnEmpolyeeSettingBack.setVisible(true);
        lblAddEmployeeName.setVisible(false);
        txtAddEmployeeName.setVisible(false);
        lblAddEmployeeEmail.setVisible(false);
        txtAddEmployeeEmail.setVisible(false);
        lblEmployeeJobRole.setVisible(false);
        txtEmployeeJobRole.setVisible(false);
        lblAddEmployeeSalary.setVisible(false);
        txtAddEmployeeSalary.setVisible(false);
        choiseSelectAsUser.setVisible(false);
        btnAddEmployeeToDataBase.setVisible(false);
        btnAddEmployeeBack.setVisible(false);
    }

    public void btnAddEmployeeToDataBaseOnActio(ActionEvent actionEvent) {
        Employee newEmployee= new Employee(
            txtAddEmployeeName.getText(),
            txtAddEmployeeEmail.getText(),
            txtEmployeeJobRole.getText(),
            Double.parseDouble(txtAddEmployeeSalary.getText())
        );
        Boolean isSelected=choiseSelectAsUser.isSelected();
        Boolean isAdd=employeeInstence.AddEmployee(newEmployee,isSelected);

        if(isAdd) {
            new Alert(Alert.AlertType.CONFIRMATION, "Employee Added Sucssfully ! ").show();
            txtRemoveSupplierID.setText("");
        }else{
            new Alert(Alert.AlertType.WARNING, "Employee Not Added").show();
            txtRemoveSupplierID.setText("");
        }
    }

    public void btnAdminChangeUserOnAction(ActionEvent actionEvent) {
        imgAccountSettings.setVisible(false);
        imgAdminEmployeeSetting.setVisible(false);
        imgAdminChangeUser.setVisible(false);
        btnAdminAccountSetting.setVisible(false);
        btnAdminEmployeeSetting.setVisible(false);
        btnAdminChangeUser.setVisible(false);
        imgAdminChangeUser1.setVisible(true);
        lblAotherUserLoginSelect.setVisible(true);
        comboBoxSelectAnotherUser.setVisible(true);
        btnLoginAsAnotherUser.setVisible(true);
        btnLoginAsAnotherUserBack.setVisible(true);
        lblLoginAsAnotherUser.setVisible(true);

        loadUser();
    }

    private void loadUser() {
        userDetails=employeeInstence.getUsersDetails();
        ObservableList<String> userNames=FXCollections.observableArrayList();
        for(User user:userDetails){
            userNames.add(user.getName());
        }
        comboBoxSelectAnotherUser.setItems(userNames);
    }

    public void btnUpdateEmployeebackOnAction(ActionEvent actionEvent) {
        btnAddEmpolye.setVisible(true);
        btnUpdateEmpolyee.setVisible(true);
        btnRemoveempolyee.setVisible(true);
        btnEmpolyeeSettingBack.setVisible(true);
        choiceBoxupdateByID.setVisible(false);
        choiceBoxUpdateByName.setVisible(false);
        TxtUpdateEmployee.setVisible(false);
        btnUpdateEmployeeSearch.setVisible(false);
        btnUpdateEmployeeback.setVisible(false);
    }


    public void btnUpdateEmployeeSearchOnAction(ActionEvent actionEvent) {
        choiceBoxupdateByID.setVisible(false);
        choiceBoxUpdateByName.setVisible(false);
        TxtUpdateEmployee.setVisible(false);
        btnUpdateEmployeeSearch.setVisible(false);
        btnUpdateEmployeeback.setVisible(false);
        lblAddEmployeeName.setVisible(true);
        txtAddEmployeeName.setVisible(true);
        lblAddEmployeeEmail.setVisible(true);
        txtAddEmployeeEmail.setVisible(true);
        lblEmployeeJobRole.setVisible(true);
        txtEmployeeJobRole.setVisible(true);
        lblAddEmployeeSalary.setVisible(true);
        txtAddEmployeeSalary.setVisible(true);
        choiseSelectAsUser.setVisible(true);
        btnUpdateEmployeeLastBack.setVisible(true);
        btnUpdateEmployeeToDataBase.setVisible(true);
        //lblUpdateEmployeeID.setVisible(true);

        String value=TxtUpdateEmployee.getText();
        String method;
        if(choiceBoxupdateByID.isSelected()){
            method="byID";
        }else{
            method="byName";
        }
        Employee employee=employeeInstence.getEmployeeDetails(value,method);

        txtAddEmployeeName.setText(employee.getName());
        //lblUpdateEmployeeID.setText("ID = "+employee.getID());
        txtEmployeeJobRole.setText(employee.getJobRole());
        txtAddEmployeeSalary.setText(employee.getSalary()+"");
        txtAddEmployeeEmail.setText(employee.getEmail());
        choiseSelectAsUser.setSelected(employee.getUser());
        employeeID=employee.getID();
    }

    public void btnUpdateEmployeeToDataBaseOnAction(ActionEvent actionEvent) {
        Employee newEmployee= new Employee(
                txtAddEmployeeName.getText(),
                txtAddEmployeeEmail.getText(),
                txtEmployeeJobRole.getText(),
                Double.parseDouble(txtAddEmployeeSalary.getText()),
                choiseSelectAsUser.isSelected()
        );
        newEmployee.setID(employeeID);

        Boolean isAdd=employeeInstence.UpdateEmployee(newEmployee);

        if(isAdd) {
            new Alert(Alert.AlertType.CONFIRMATION, "Employee Updated Sucssfully ! ").show();
            txtRemoveSupplierID.setText("");
        }else{
            new Alert(Alert.AlertType.WARNING, "Employee Not Updated").show();
            txtRemoveSupplierID.setText("");
        }
    }

    public void btnUpdateEmployeeLastBackOnAction(ActionEvent actionEvent) {
        choiceBoxupdateByID.setVisible(true);
        choiceBoxUpdateByName.setVisible(true);
        TxtUpdateEmployee.setVisible(true);
        btnUpdateEmployeeSearch.setVisible(true);
        btnUpdateEmployeeback.setVisible(true);
        lblAddEmployeeName.setVisible(false);
        txtAddEmployeeName.setVisible(false);
        lblAddEmployeeEmail.setVisible(false);
        txtAddEmployeeEmail.setVisible(false);
        lblEmployeeJobRole.setVisible(false);
        txtEmployeeJobRole.setVisible(false);
        lblAddEmployeeSalary.setVisible(false);
        txtAddEmployeeSalary.setVisible(false);
        choiseSelectAsUser.setVisible(false);
        btnUpdateEmployeeLastBack.setVisible(false);
        btnUpdateEmployeeToDataBase.setVisible(false);
        //lblUpdateEmployeeID.setVisible(false);

    }

    public void choiceBoxupdateByIDOnAction(ActionEvent actionEvent) {
        choiceBoxUpdateByName.setSelected(false);
        TxtUpdateEmployee.setPromptText("Enter ID");
    }

    public void choiceBoxUpdateByNameOnAction(ActionEvent actionEvent) {
        choiceBoxupdateByID.setSelected(false);
        TxtUpdateEmployee.setPromptText("Enter Name");
    }

    public void btnDelateEmployeeOnAction(ActionEvent actionEvent) {
        String ID=txtRemoveEmployee.getText();
        Boolean isAdd=employeeInstence.delateEmployee(ID);

        if(isAdd) {
            new Alert(Alert.AlertType.CONFIRMATION, "Employee Deleted Sucssfully ! ").show();
            txtRemoveSupplierID.setText("");
        }else{
            new Alert(Alert.AlertType.WARNING, "Employee Not Deleted").show();
            txtRemoveSupplierID.setText("");
        }
    }

    public void btnRemoveEmployeeBackOnAction(ActionEvent actionEvent) {
        btnAddEmpolye.setVisible(true);
        btnUpdateEmpolyee.setVisible(true);
        btnRemoveempolyee.setVisible(true);
        btnEmpolyeeSettingBack.setVisible(true);
        lblRemoveEmployee.setVisible(false);
        txtRemoveEmployee.setVisible(false);
        btnDelateEmployee.setVisible(false);
        btnRemoveEmployeeBack.setVisible(false);
    }

    public void btnLoginAsAnotherUserBackOnAction(ActionEvent actionEvent) {
        imgAccountSettings.setVisible(true);
        imgAdminEmployeeSetting.setVisible(true);
        imgAdminChangeUser.setVisible(true);
        btnAdminAccountSetting.setVisible(true);
        btnAdminEmployeeSetting.setVisible(true);
        btnAdminChangeUser.setVisible(true);
        imgAdminChangeUser1.setVisible(false);
        lblAotherUserLoginSelect.setVisible(false);
        comboBoxSelectAnotherUser.setVisible(false);
        btnLoginAsAnotherUser.setVisible(false);
        btnLoginAsAnotherUserBack.setVisible(false);
        lblLoginAsAnotherUser.setVisible(false);


    }


    public void btnLoginAsAnotherUserOnAction(ActionEvent actionEvent) {
        String UserName=comboBoxSelectAnotherUser.getValue().toString();

        for(User user:userDetails){
            if(UserName.equals(user.getName())){
               userDetail=user;
            }
        }

        lblLoginAsAnotherUser.setVisible(false);
        imgAdminChangeUser1.setVisible(false);
        lblAotherUserLoginSelect.setVisible(false);
        comboBoxSelectAnotherUser.setVisible(false);
        btnLoginAsAnotherUser.setVisible(false);
        btnLoginAsAnotherUserBack.setVisible(false);
        imgAccountSettings.setVisible(true);
        imgSupplierSettings.setVisible(true);
        imgProductSettings.setVisible(true);
        btnAccountSettings.setVisible(true);
        btnSupplierSettings.setVisible(true);
        btnProductSettings.setVisible(true);
        btnAdminBack.setVisible(true);
    }

    public void btnAdminBackOnAction(ActionEvent actionEvent) {
        btnAdminBack.setVisible(false);
        imgAccountSettings.setVisible(false);
        imgSupplierSettings.setVisible(false);
        imgProductSettings.setVisible(false);
        btnAccountSettings.setVisible(false);
        btnSupplierSettings.setVisible(false);
        btnProductSettings.setVisible(false);
        imgAccountSettings.setVisible(true);
        btnAdminAccountSetting.setVisible(true);
        imgAdminEmployeeSetting.setVisible(true);
        btnAdminEmployeeSetting.setVisible(true);
        imgAdminChangeUser.setVisible(true);
        btnAdminChangeUser.setVisible(true);
        btnAdminChangeUser.setVisible(true);

        for(User user:userDetails){
            if(user.getEmployeeID().equals("ADMIN")){
                userDetail=user;
            }
        }
    }

    public void btnAdminAccountSettingBackOnAction(ActionEvent actionEvent) {
        lblAdminSettingName.setVisible(false);
        txtAdminSettingName.setVisible(false);
        lblAdminUserID.setVisible(false);
        txtAdminUserID.setVisible(false);
        lblAdminEmployeeID.setVisible(false);
        btnLogOutAdminAccount.setVisible(false);
        btnAdminAccountSettingBack.setVisible(false);
        txtAdminEmployeID.setVisible(false);
        imgAdminEmployeeSetting.setVisible(true);
        imgAdminChangeUser.setVisible(true);
        btnAdminEmployeeSetting.setVisible(true);
        btnAdminChangeUser.setVisible(true);

        txtAdminEmployeID.setText(userDetail.getEmployeeID());
        txtAdminSettingName.setText(userDetail.getName());
        txtAdminUserID.setText(userDetail.getUserID());
    }

    public void btnLogOutAdminAccountOnAction(ActionEvent actionEvent) {
        imgAccountSettings.setVisible(false);
        lblFirstBackGround.setVisible(false);
        DashBoardBackground.setVisible(false);
        tblOrder.setVisible(false);
        txtOrderID.setVisible(false);
        txtQuantity.setVisible(false);
        lblOrderID.setVisible(false);
        lblProductID.setVisible(false);
        lblPaymentMethod.setVisible(false);
        lblTotal.setVisible(false);
        choiceBoxPaymentMethod.setVisible(false);
        txtTotal.setVisible(false);
        btnClearTextBox.setVisible(false);
        btnQuantityAdd.setVisible(false);
        ChoiceBoxProductID.setVisible(false);
        btnAddToCart.setVisible(false);
        lineDashBoard.setVisible(false);
        btnPlaceNewOrder.setVisible(false);
        btnPlaceNewOrder.setVisible(false);
        lblNetTotalTag.setVisible(false);
        lblNetTotal.setVisible(false);
        lblRsTag.setVisible(false);
        OrtherSettingBackground.setVisible(false);
        imgAdminChangeUser.setVisible(false);
        imgAdminEmployeeSetting.setVisible(false);
        btnAdminAccountSetting.setVisible(false);
        btnAdminChangeUser.setVisible(false);
        btnAdminEmployeeSetting.setVisible(false);
        lineMain.setVisible(false);
        lblUserDashBoard.setVisible(false);
        btnPlaceOrder.setVisible(false);
        lblQuantity.setVisible(false);
        lblCustomerEmail.setVisible(false);
        lblCustomerName.setVisible(false);
        txtCustomerEmail.setVisible(false);
        txtCustomerName.setVisible(false);
        tblColPaymentMethod.setVisible(false);
        tblColTotal.setVisible(false);
        tblColQuantity.setVisible(false);
        tblColProductDesc.setVisible(false);
        tblColOrderID.setVisible(false);
        tblColProductID.setVisible(false);
        b.setVisible(false);
        lblProductDetails.setVisible(false);
        lbldate.setVisible(false);
        Time.setVisible(false);
        lblOrderDetail.setVisible(false);
        cheakTypeNewOrder.setVisible(false);
        cheakTypeReturnOrder.setVisible(false);
        cheakTypeNewOrder.setVisible(false);
        cheakTypeReturnOrder.setVisible(false);
        lblAdminSettingName.setVisible(false);
        txtAdminSettingName.setVisible(false);
        lblAdminUserID.setVisible(false);
        txtAdminUserID.setVisible(false);
        lblAdminEmployeeID.setVisible(false);
        btnLogOutAdminAccount.setVisible(false);
        btnAdminAccountSettingBack.setVisible(false);
        txtAdminEmployeID.setVisible(false);
        lblUserLogin.setVisible(false);
        txtPassword.setVisible(false);
        txtEmail.setVisible(false);
        btnLogin.setVisible(false);
        btnResetPassword.setVisible(false);
        lblCloseLoginOption.setVisible(false);
    }

    public void btnAdmin1LoginOnAction(ActionEvent actionEvent) {

        Boolean isUser=false;
        String email=txtEmail.getText();
        String password=txtPassword.getText();


        password=passwordInstence.getEncriptedPassword(password);

        loadUser();

        for(User user:userDetails){
            if(user.getEmail().equals(email)){
                if(user.getPassword().equals(password)){
                    if(user.getEmployeeID().equals("ADMIN")){
                        isUser = true;
                        user.setPassword("");
                        userDetail = user;
                    }
                }
            }
        }

        if(isUser) {
            imgAccountSettings.setVisible(true);
            lblFirstBackGround.setVisible(true);
            DashBoardBackground.setVisible(true);
            tblOrder.setVisible(true);
            txtOrderID.setVisible(true);
            txtQuantity.setVisible(true);
            lblOrderID.setVisible(true);
            lblProductID.setVisible(true);
            lblPaymentMethod.setVisible(true);
            lblTotal.setVisible(true);
            choiceBoxPaymentMethod.setVisible(true);
            txtTotal.setVisible(true);
            btnClearTextBox.setVisible(true);
            btnQuantityAdd.setVisible(true);
            ChoiceBoxProductID.setVisible(true);
            btnAddToCart.setVisible(true);
            lineDashBoard.setVisible(true);
            btnPlaceNewOrder.setVisible(true);
            btnPlaceNewOrder.setVisible(true);
            lblNetTotalTag.setVisible(true);
            lblNetTotal.setVisible(true);
            lblRsTag.setVisible(true);
            OrtherSettingBackground.setVisible(true);
            imgAdminChangeUser.setVisible(true);
            imgAdminEmployeeSetting.setVisible(true);
            btnAdminAccountSetting.setVisible(true);
            btnAdminChangeUser.setVisible(true);
            btnAdminEmployeeSetting.setVisible(true);
            lineMain.setVisible(true);
            lblUserDashBoard.setVisible(true);
            btnPlaceOrder.setVisible(true);
            lblQuantity.setVisible(true);
            lblCustomerEmail.setVisible(true);
            lblCustomerName.setVisible(true);
            txtCustomerEmail.setVisible(true);
            txtCustomerName.setVisible(true);
            tblColPaymentMethod.setVisible(true);
            tblColTotal.setVisible(true);
            tblColQuantity.setVisible(true);
            tblColProductDesc.setVisible(true);
            tblColOrderID.setVisible(true);
            tblColProductID.setVisible(true);
            b.setVisible(true);
            lblProductDetails.setVisible(true);
            lbldate.setVisible(true);
            Time.setVisible(true);
            lblOrderDetail.setVisible(true);
            cheakTypeNewOrder.setVisible(true);
            cheakTypeReturnOrder.setVisible(true);
            cheakTypeNewOrder.setVisible(true);
            cheakTypeReturnOrder.setVisible(true);
            txtPassword.setText("");
            txtEmail.setText("");
            btnAdmin1Login.setVisible(false);

            new Alert(Alert.AlertType.INFORMATION, "You Are Login As "+userDetail.getName()).show();
        }else{
            new Alert(Alert.AlertType.WARNING, "InValid Login , Try Again Later !!").show();
            txtPassword.setText("");
            txtEmail.setText("");
        }
    }

    public void btnResetPasswordBackOnAction(ActionEvent actionEvent) {
        lblUserLogin.setVisible(true);
        txtPassword.setVisible(true);
        txtEmail.setVisible(true);
        btnLogin.setVisible(true);
        btnAdmin1Login.setVisible(true);
        btnResetPassword.setVisible(true);
        lblResetpassword.setVisible(false);
        lblResetpasswordEmail.setVisible(false);
        txtResetPasswordEmail.setVisible(false);
        btnResetPasswordBack.setVisible(false);
        btnResetPasswordConfirm.setVisible(false);
    }

    public void btnResetPasswordConfirmOnAction(ActionEvent actionEvent) {
        lblResetpassword.setVisible(false);
        lblResetpasswordEmail.setVisible(false);
        txtResetPasswordEmail.setVisible(false);
        btnResetPasswordBack.setVisible(false);
        btnResetPasswordConfirm.setVisible(false);
        lblEnterOtp.setVisible(true);
        txtOTPEnter.setVisible(true);
        btnOtpEnterBack.setVisible(true);
        btnOTPConfirmation.setVisible(true);

         email=txtResetPasswordEmail.getText();
        Random random=new Random();
        otp =random.nextInt(1000);

        String emailbody = "Your OTP is "+otp;
        emailinstence.sendmail(email,emailbody);
    }

    public void btnResetPasswordonAction(ActionEvent actionEvent) {
        lblUserLogin.setVisible(false);
        txtPassword.setVisible(false);
        txtEmail.setVisible(false);
        btnLogin.setVisible(false);
        btnAdmin1Login.setVisible(false);
        btnResetPassword.setVisible(false);
        lblResetpassword.setVisible(true);
        lblResetpasswordEmail.setVisible(true);
        txtResetPasswordEmail.setVisible(true);
        btnResetPasswordBack.setVisible(true);
        btnResetPasswordConfirm.setVisible(true);
    }

    public void btnOtpEnterBackOnAction(ActionEvent actionEvent) {

        lblResetpassword.setVisible(true);
        lblResetpasswordEmail.setVisible(true);
        txtResetPasswordEmail.setVisible(true);
        btnResetPasswordBack.setVisible(true);
        btnResetPasswordConfirm.setVisible(true);
        lblEnterOtp.setVisible(false);
        txtOTPEnter.setVisible(false);
        btnOtpEnterBack.setVisible(false);
        btnOTPConfirmation.setVisible(false);
    }

    public void btnOTPConfirmationOnAction(ActionEvent actionEvent) {
       Boolean isOtpCorrect=((otp+"").equals(txtOTPEnter.getText()));

        if(isOtpCorrect){
            lblEnterOtp.setVisible(false);
            txtOTPEnter.setVisible(false);
            btnOtpEnterBack.setVisible(false);
            btnOTPConfirmation.setVisible(false);
            lblEnterNewPassword.setVisible(true);
            txtEnternewPassword.setVisible(true);
            txtreenterPassword.setVisible(true);
            changePasswordLastBack.setVisible(true);
            btnChangePasswordLast.setVisible(true);
        }else{
            new Alert(Alert.AlertType.WARNING, " OPT InCorrect ").show();
        }


    }

    public void changePasswordLastBackOnAction(ActionEvent actionEvent) {
        lblEnterOtp.setVisible(true);
        txtOTPEnter.setVisible(true);
        btnOtpEnterBack.setVisible(true);
        btnOTPConfirmation.setVisible(true);
        lblEnterNewPassword.setVisible(false);
        txtEnternewPassword.setVisible(false);
        txtreenterPassword.setVisible(false);
        changePasswordLastBack.setVisible(false);
        btnChangePasswordLast.setVisible(false);
    }

    public void btnChangePasswordLastonAction(ActionEvent actionEvent) {
        String enterPassword=txtEnternewPassword.getText();
        String reEnterPassword=txtreenterPassword.getText();

        if(enterPassword.equals(reEnterPassword)){
            if(enterPassword.length()>= 8){
                Boolean isAdd=passwordInstence.saveNewPassword(enterPassword,email);
                if(isAdd){
                    new Alert(Alert.AlertType.INFORMATION, "Password Changed").show();
                    lblEnterNewPassword.setVisible(false);
                    txtEnternewPassword.setVisible(false);
                    txtreenterPassword.setVisible(false);
                    changePasswordLastBack.setVisible(false);
                    btnChangePasswordLast.setVisible(false);

                    txtEnternewPassword.setText("");
                    txtreenterPassword.setText("");
                    txtResetPasswordEmail.setText("");
                    txtOTPEnter.setText("");
                    lblCloseLoginOption.setVisible(false);
                }else{
                    new Alert(Alert.AlertType.WARNING, "Password Not Change").show();
                }
            }else {
                new Alert(Alert.AlertType.WARNING, "Password should be have minimum 8 characters").show();

            }
        }else{
            new Alert(Alert.AlertType.WARNING, "password and ReEntered Password Is Not Match !!").show();
        }
    }

    public void newPasswordOnKeyTyped(KeyEvent keyEvent) {
    }
}
