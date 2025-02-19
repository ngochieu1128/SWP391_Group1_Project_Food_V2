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
    <link rel="stylesheet" href="./assert/css/manageVoucher.css">
    <link rel="stylesheet" href="./assert/font/fontawesome-free-6.1.1-web/css/all.css">
    <title>Manage voucher</title>
</head>

<body>
    <!-- Wrapper contains all website's components -->
    <div class="container-fluid wrapper">
        <!-- 1. Navigation -->
        <jsp:include page="navigation.jsp"></jsp:include>
        
         <!-- Manage product container -->
        <div class="container-fluid table-container">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12">
                        <h6 class="table-header">MANAGE VOUCHER</h6>
                        <div class="table-control-btn-group">
                            <form class="sort-form" action="">
                                <div class="total-quantity-control">
                                    <h6 class="sort-form-label">Total quantity:</h6>
                                    <button class="btn-primary total-quantity">
                                        150
                                    </button>
                                </div>
                            </form>
                            <div class="btn-group-search-add">
                                <button class="btn-primary btn-add">
                                    <i class="fa-solid fa-plus"></i>
                                    <a href="">Add voucher</a>
                                </button>
                                <div class="search-group">
                                    <input type="text" placeholder="ABC123">
                                    <button class="btn-main btn-search">
                                        <i class="fa-solid fa-magnifying-glass"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12">
                        <table class="table table-striped text-center align-middle">
                            <thead class="table-heading">
                                <tr>
                                    <th class="table-heading-text" scope="col">No.</th>
                                    <th class="table-heading-text" scope="col">Voucher-Code</th>
                                    <th class="table-heading-text" scope="col">Name</th>
                                    <th class="table-heading-text" scope="col">Discount percent</th>
                                    <th class="table-heading-text" scope="col">Status</th>
                                    <th class="table-heading-text" scope="col">Option</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td class="table-order">1</td>
                                    <td class="table-code">ABC123</td>
                                    <td class="table-name"><a href="">Buy the first time</a></td>
                                    
                                    <td class="table-sale">
                                        20
                                    </td>
                                    <td class="table-status">
                                        AVAILABLE
                                    </td>
                                    <td class="table-btn">
                                        <a class="table-btn-edit" href="updateProduct.html"><i
                                                class="fa-solid fa-pen-to-square"></i></a>
                                        <a href="#" onclick="return showMessageDelete();"><i
                                                class="fa-solid fa-trash"></i></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="table-order">1</td>
                                    <td class="table-code">ABC123</td>
                                    <td class="table-name"><a href="">Buy the first time</a></td>
                                    
                                    <td class="table-sale">
                                        20
                                    </td>
                                    <td class="table-status">
                                        AVAILABLE
                                    </td>
                                    <td class="table-btn">
                                        <a class="table-btn-edit" href="updateProduct.html"><i
                                                class="fa-solid fa-pen-to-square"></i></a>
                                        <a href="#" onclick="return showMessageDelete();"><i
                                                class="fa-solid fa-trash"></i></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="table-order">1</td>
                                    <td class="table-code">ABC123</td>
                                    <td class="table-name"><a href="">Buy the first time</a></td>
                                    
                                    <td class="table-sale">
                                        20
                                    </td>
                                    <td class="table-status">
                                        AVAILABLE
                                    </td>
                                    <td class="table-btn">
                                        <a class="table-btn-edit" href="updateProduct.html"><i
                                                class="fa-solid fa-pen-to-square"></i></a>
                                        <a href="#" onclick="return showMessageDelete();"><i
                                                class="fa-solid fa-trash"></i></a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        
        <!-- 5. Footer  -->
        <jsp:include page="footer.jsp"></jsp:include>
    </div>
    <script src="./bootstap/bootstrap.js"></script>
    <script src="jquery/Jquery.js"></script>
    <script src="jquery/manageVoucher.js"></script>
</body>

</html>