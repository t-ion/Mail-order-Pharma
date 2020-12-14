<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html>
<head>
	<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Mail Order Pharmacy</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="images/favicon.png" rel="icon">
  <link href="images/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="vendor/aos/aos.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="style/style.css" rel="stylesheet">
</head>
<body>
  <!-- ======= Header ======= -->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <h3><a href="#hero">Mail Order Pharmacy</a></h3>
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="welcome">Home</a></li>
          <li><a href="welcome#subscribe">Subscribe</a></li>
          <li><a href="welcome#services">Supported drugs</a></li>
          <li><a href="welcome#view-subscribed-drugs">Subscribed medicines</a></li>
          <li><a href="welcome#due-for-refill">Due for refill</a></li>
          <li><a href="welcome#ad-hoc-requests">Request now</a></li>
          <li><a href="">Logout</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- End Header -->
  <br><br>
  <section id="services">
  <div class="container bcontent">
			<h2>Refill Dues for ${name}</h2>
			<hr />
			<c:forEach items="${refillDues}" var="refillDue">
				<div class="card" style="width: 500px;">
					<div class="row no-gutters">
						<div class="col-sm-7">
							<div class="card-body">
								<h5 class="card-title"><b>Refill Drugs</b></h5>
								<p class="card-text"><b>Member ID</b>: ${refillDue.memberId }</p>
								<p class="card-text"><b>Subscription ID</b>: ${refillDue.subscriptionId }</p>
								<p class="card-text"><b>Refill ID</b>: ${refillDue.id }</p>
								<p class="card-text"><b>Refill Quantity</b>: ${refillDue.refillQuantity }</p>
								<p class="card-text"><b>Refill Time</b>: ${refillDue.refillTime }</p>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
  </section>
    <!-- ======= Footer ======= -->
  <footer id="footer" class="mt-auto fixed-bottom">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>

    <div class="container">
      <div class="credits">
        Thank you! We are here for your needs.
      </div>
    </div>
  </footer><!-- End Footer -->
</body>
</html>