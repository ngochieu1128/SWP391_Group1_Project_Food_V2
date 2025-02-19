/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NghiaHHCE160343@fpt.edu.vn
 */
public class Account {

    private int accountID; // ID of account
    private String accountEmail; // Email of account
    private String accountPassword; // Password of account
    private AccountStatus accountStatus; // Status of account (actived, pending, removed)
    private String accountName; // Full name associated with the account
    private int accountPhone; // Phone number associated with the account
    private String accountAddress; // Address associated with the account
    private int roleID; // ID of the role associated with the account
    private String roleDescription; // Description of role the account holds

    /**
     *
     * Constructor default
     */
    public Account() {
    }

    /**
     *
     * Constructor with parameters accountID, accountEmail, accountPassword,
     * accountStatus, roleID, and roleDescription
     *
     * @param accountID ID of the account
     * @param accountEmail Email address of the account
     * @param accountPassword Password of the account
     * @param accountStatus Status of the account
     * @param roleDescription Description of the role of the account
     */
    public Account(int accountID, String accountEmail, String accountPassword, AccountStatus accountStatus, String roleDescription) {
        this.accountID = accountID;
        this.accountEmail = accountEmail;
        this.accountPassword = accountPassword;
        this.accountStatus = accountStatus;
        this.roleDescription = roleDescription;
    }

    /**
     * Constructor with all parameter
     * 
     * @param accountID ID of the account
     * @param accountEmail Email address of the account
     * @param accountPassword Password of the account
     * @param accountStatus Status of the account
     * @param roleDescription Description of the role of the account
     * @param AccountName Full name associated with the account
     * @param AccountPhone Phone number associated with the account
     * @param AccountAddress Address associated with the account
     * @param roleID ID of the role associated with the account
     */
    public Account(int accountID, String accountEmail, String accountPassword, AccountStatus accountStatus, String AccountName, int AccountPhone, String AccountAddress, int roleID, String roleDescription) {
        this.accountID = accountID;
        this.accountEmail = accountEmail;
        this.accountPassword = accountPassword;
        this.accountStatus = accountStatus;
        this.accountName = AccountName;
        this.accountPhone = AccountPhone;
        this.accountAddress = AccountAddress;
        this.roleID = roleID;
        this.roleDescription = roleDescription;
    }

    /**
     *
     * Get ID of the account
     *
     * @return int ID of the account
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     *
     * Set ID of the account
     *
     * @param accountID ID of the account
     */
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    /**
     *
     * Get email address of the account
     *
     * @return String email address of the account
     */
    public String getAccountEmail() {
        return accountEmail;
    }

    /**
     *
     * Set email address of the account
     *
     * @param accountEmail email address of the account
     */
    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    /**
     *
     * Get password of the account
     *
     * @return String password of the account
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     *
     * Set password of the account
     *
     * @param accountPassword password of the account
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    /**
     *
     * Get status of the account
     *
     * @return AccountStatus status of the account
     */
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     *
     * Set status of the account
     *
     * @param accountStatus status of the account
     */
    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     *
     * Get description of the role of the account
     *
     * @return int description of the role of the account
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     *
     * Set description of the role of the account
     *
     * @param roleDescription description of the role of the account
     */
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    /**
     * Get full name associated with the account
     * @return accountName full name associated with the account
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Set full name associated with the account
     * @param accountName full name associated with the account
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Get phone number associated with the account
     * @return accountPhone phone number associated with the account
     */
    public int getAccountPhone() {
        return accountPhone;
    }

    /**
     * Set phone number associated with the account
     * @param accountPhone phone number associated with the account
     */
    public void setAccountPhone(int accountPhone) {
        this.accountPhone = accountPhone;
    }

    /**
     * Get address associated with the account
     * @return accountAddress address associated with the account
     */
    public String getAccountAddress() {
        return accountAddress;
    }

    /**
     * Set address associated with the account
     * @param accountAddress address associated with the account
     */
    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    /**
     * Get ID of the role associated with the account
     * @return roleID ID of the role associated with the account
     */
    public int getRoleID() {
        return roleID;
    }

    /**
     * Set ID of the role associated with the account
     * @param roleID ID of the role associated with the account
     */
    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
    
    

}
