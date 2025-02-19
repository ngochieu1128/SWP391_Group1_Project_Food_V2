/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NghiaHHCE160343@fpt.edu.vn
 */
public class Order {

    private int orderID; // ID of the order
    private String orderNote; // Note associated with the order
    private OrderStatus orderStatus; // Status of the order (pending, accept, reject, pickup, successful)
    private String orderDate; // Date the order was placed
    private int accountID; // ID of the account associated with the order
    private String userFullName; // Full name of the user who placed the order
    private int userPhone; // Phone number of the user who placed the order
    private String userAddress; // Shipping address of the user who placed the order
    private String voucherID; // ID of the voucher used for the order
    private String productSalePercent; // Sale percent of the product in the order
    private String accountOfIDChef; // ID of the chef who prepared the order
    private String accountOfIDShipper; // ID of the shipper who delivered the order

    /**
     * Default constructor for Order class
     */
    public Order() {
    }

    /**
     * Constructor for Order class with parameters
     *
     * @param orderID ID of the order
     * @param orderNote Note of the order
     * @param orderStatus Status of the order
     * @param orderDate Date of the order
     * @param accountID ID of the account
     * @param userFullName Full name of the user
     * @param userPhone Phone number of the user
     * @param userAddress Address of the user
     * @param voucherID ID of the voucher
     * @param productSalePercent Sale percent of the product
     * @param accountOfIDChef ID of the chef account
     * @param accountOfIDShipper ID of the shipper account
     */
    public Order(int orderID, String orderNote, OrderStatus orderStatus, String orderDate, int accountID, String userFullName, int userPhone, String userAddress, String voucherID, String productSalePercent, String accountOfIDChef, String accountOfIDShipper) {
        this.orderID = orderID;
        this.orderNote = orderNote;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.accountID = accountID;
        this.userFullName = userFullName;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.voucherID = voucherID;
        this.productSalePercent = productSalePercent;
        this.accountOfIDChef = accountOfIDChef;
        this.accountOfIDShipper = accountOfIDShipper;
    }

    /**
     * Get the ID of the order
     *
     * @return ID of the order
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Set the ID of the order
     *
     * @param orderID ID of the order
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * Get the note of the order
     *
     * @return Note of the order
     */
    public String getOrderNote() {
        return orderNote;
    }

    /**
     * Set the note of the order
     *
     * @param orderNote Note of the order
     */
    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    /**
     * Get the status of the order
     *
     * @return Status of the order
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Set the status of the order
     *
     * @param orderStatus Status of the order
     */
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Get the date of the order
     *
     * @return Date of the order
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Set the date of the order
     *
     * @param orderDate Date of the order
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Get the account ID of the user.
     *
     * @return the account ID of the user.
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     * Set the account ID of the user.
     *
     * @param accountID the account ID of the user to be set.
     */
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    /**
     * Get the full name of the user.
     *
     * @return the full name of the user.
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * Set the full name of the user.
     *
     * @param userFullName the full name of the user to be set.
     */
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    /**
     * Get the phone number of the user.
     *
     * @return the phone number of the user.
     */
    public int getUserPhone() {
        return userPhone;
    }

    /**
     * Set the phone number of the user.
     *
     * @param userPhone the phone number of the user to be set.
     */
    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * Get the address of the user.
     *
     * @return the address of the user.
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * Set the address of the user.
     *
     * @param userAddress the address of the user to be set.
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * Get the ID of the voucher.
     *
     * @return the ID of the voucher.
     */
    public String getVoucherID() {
        return voucherID;
    }

    /**
     * Set the ID of the voucher.
     *
     * @param voucherID the ID of the voucher to be set.
     */
    public void setVoucherID(String voucherID) {
        this.voucherID = voucherID;
    }

    /**
     * Get the sale percentage of the product.
     *
     * @return the sale percentage of the product.
     */
    public String getProductSalePercent() {
        return productSalePercent;
    }

    /**
     * Set the sale percentage of the product.
     *
     * @param productSalePercent the sale percentage of the product to be set.
     */
    public void setProductSalePercent(String productSalePercent) {
        this.productSalePercent = productSalePercent;
    }

    /**
     * Get the account ID of the chef.
     *
     * @return the account ID of the chef.
     */
    public String getAccountOfIDChef() {
        return accountOfIDChef;
    }

    /**
     * Set the account ID of the chef.
     *
     * @param accountOfIDChef the account ID of the chef to be set.
     */
    public void setAccountOfIDChef(String accountOfIDChef) {
        this.accountOfIDChef = accountOfIDChef;
    }

    /**
     * Getter method for accountOfIDShipper attribute
     *
     * @return accountOfIDShipper, the identifier of the shipper account
     * associated with this order
     */
    public String getAccountOfIDShipper() {
        return accountOfIDShipper;
    }

    /**
     * Setter method for accountOfIDShipper attribute
     *
     * @param accountOfIDShipper, the identifier of the shipper account to be
     * associated with this order
     */
    public void setAccountOfIDShipper(String accountOfIDShipper) {
        this.accountOfIDShipper = accountOfIDShipper;
    }

}
