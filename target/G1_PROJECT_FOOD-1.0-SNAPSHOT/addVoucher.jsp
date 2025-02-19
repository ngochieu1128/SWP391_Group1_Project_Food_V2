<%-- 
    Document   : navigation
    Created on : Feb 12, 2023, 2:14:42 AM
    Author     : PC
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./bootstap/css/bootstrap.min.css">
    <link rel="stylesheet" href="./bootstap/js/bootstrap.js">
    <link rel="stylesheet" href="./assert/css/base.css">
    <link rel="stylesheet" href="./assert/css/home.css">
    <link rel="stylesheet" href="./assert/css/cart.css">
    <link rel="stylesheet" href="./assert/font/fontawesome-free-6.1.1-web/css/all.css">
    <title>Add-voucher</title>
</head>

<body>
    <!-- Wrapper contains all website's components -->
    <div class="container-fluid wrapper">
        <!-- 1. Navigation -->
        <jsp:include page="navigation.jsp"></jsp:include>
        
        <!-- Form update product -->
        <div class="container-fluid container-fluid-form">
            <div class="wrapper-form">
                <form id="myForm">
                    <div class="form-heading-group">
                        <i class="fa-solid fa-plus"></i>
                        <h2 class="form-heading">ADD VOUCHER</h2>
                    </div>

                    <div class="form-control-group">
                        <h4 class="form-text-label">Voucher's code:</h4>
                        <input type="text" id="voucherID" name="voucherID" placeholder="ABC123">
                        <div class="alert-warning" id="txtVoucherIDMessage"></div>
                    </div>

                    <div class="form-control-group">
                        <h4 class="form-text-label">Voucher's description:</h4>
                        <input type="text" id="voucherDescription" name="voucherDescription"
                            placeholder="Combo học sinh viên viên">
                        <div class="alert-warning" id="txtVoucherDescriptionMessage"></div>
                    </div>

                    <div class="form-control-group">
                        <h4 class="form-text-label">Voucher's discount percent:</h4>
                        <input type="number" id="voucherPercent" name="voucherPercent" placeholder="50">
                        <div class="alert-warning" id="txtVoucherPercentMessage"></div>
                    </div>

                    <div class="form-control-group">
                        <h4 class="form-text-label">Voucher's status:</h4>
                        <select id="voucherStatus" name="voucherStatus">
                            <option value="AVAILABLE">AVAILABLE</option>
                            <option value="UNAVAILABLE">UNAVAILABLE</option>
                        </select>
                    </div>

                    <div class="form-btn-group">
                        <button type="Submit" name="submit" class="btn-primary">Add voucher</button>
                        <h6 class="form-btn-separator">&nbsp;OR&nbsp;</h6>
                        <button type="button" name="submit" class="btn-main">Cancel</button>
                    </div>
                </form>
            </div>
        </div>


        <!-- 5. Footer  -->
        <jsp:include page="footer.jsp"></jsp:include>
    </div>

    <script src="./bootstap/bootstrap.js"></script>
    <script src="jquery/Jquery.js"></script>
    <script src="jquery/updateProduct.js"></script>
</body>

</html>