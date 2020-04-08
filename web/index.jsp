<%--
  Created by IntelliJ IDEA.
  User: holoi
  Date: 4/8/20
  Time: 08:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
    <style>
      .form {
        border: 1px solid blue;
        padding: 20px 20px 20px 20px;
        font-size: 20px;
      }
      .input {
        height: 40px;
        width: 200px;
        border-radius: 10px;
        margin-left: 40px;
      }
      .input1 {
        height: 40px;
        width: 200px;
        border-radius: 10px;
        margin-left: 123px;
        margin-top: 10px;
      }
      .input2 {
        height: 40px;
        width: 200px;
        border-radius: 10px;
        margin-left: 61px;
        margin-top: 10px;
      }
      .submit {
        height: 30px;
        width: 130px;
        background-color: darkgray;
        margin-left: 208px;
        border-radius: 10px;
        margin-top: 10px;
        color: white;
      }
    </style>
  </head>
  <body>
  <form class="form" action="${pageContext.request.contextPath}/display-discount" method="post">
    <h1 style="text-align: center; color: blue;font-size: 30px; margin-top: 20px">Product Discount Calculator</h1>
    <label>Product Description:</label>
    <label>
      <input class="input" type="text" name="Product_Description" placeholder="Description"/><br/>
    </label>
    <label>List Price:</label>
    <label>
      <input class="input1" type="text" name="List_Price" placeholder="Price" /><br/>
    </label>
    <label>Discount Percent:</label>
    <label>
      <input class="input2" type="text" name="Discount_Percent" placeholder="Percent" /><span>(%)</span><br/>
    </label>
    <label for="submit"></label><input type="submit" class="submit" id="submit" value="Calculate_Discount"/>
  </form>
  </body>
</html>
