<%@ page language = "java" contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<!DOCTYPE html>

<html>

<head>

	<meta  charset = "UTF-8"/>

	<link rel = "stylesheet" href = "css/style_main.css">
	<link rel = "stylesheet" href = "css/style_input.css">

	<title>宛先情報入力画面</title>

</head>

<body>

	<jsp:include page="header.jsp" />

	<h1>宛先情報入力画面</h1>

	<s:if test = "familyNameErrorMessageList != null && familyNameErrorMessageList.size() > 0">

		<div class = "message">
			<s:iterator value = "familyNameErrorMessageList">
				<p><s:property /></p>
			</s:iterator>
		</div>

	</s:if>

	<s:if test = "firstNameErrorMessageList != null && firstNameErrorMessageList.size() > 0">

		<div class = "message">
			<s:iterator value = "firstNameErrorMessageList">
				<p><s:property /></p>
			</s:iterator>
		</div>

	</s:if>

	<s:if test = "familyNameKanaErrorMessageList != null && familyNameKanaErrorMessageList.size() > 0">

		<div class = "message">
			<s:iterator value = "familyNameKanaErrorMessageList">
				<p><s:property /></p>
			</s:iterator>
		</div>

	</s:if>

	<s:if test = "firstNameKanaErrorMessageList != null && firstNameKanaErrorMessageList.size() > 0">

		<div class = "message">
			<s:iterator value = "firstNameKanaErrorMessageList">
				<p><s:property /></p>
			</s:iterator>
		</div>

	</s:if>

	<s:if test = "userAddressErrorMessageList != null && userAddressErrorMessageList.size() > 0">

		<div class = "message">
			<s:iterator value = "userAddressErrorMessageList">
				<p><s:property /></p>
			</s:iterator>
		</div>

	</s:if>

	<s:if test = "telNumberErrorMessageList != null && telNumberErrorMessageList.size() > 0">

		<div class = "message">
			<s:iterator value = "telNumberErrorMessageList">
				<p><s:property /></p>
			</s:iterator>
		</div>

	</s:if>

	<s:if test = "emailErrorMessageList != null && emailErrorMessageList.size() > 0">

		<div class = "message">
			<s:iterator value = "emailErrorMessageList">
				<p><s:property /></p>
			</s:iterator>
		</div>

	</s:if>

	<form action = "CreateDestinationConfirmAction" method = "post">
		<table>
			<tr>
				<th><label>姓</label></th>
				<td><input type = "text" name = "familyName" value = '<s:property value = "familyName" />' placeholder = "姓" /></td>
			</tr>

			<tr>
				<th><label>名</label></th>
				<td><input type = "text" name = "firstName" value = '<s:property value = "firstName" />' placeholder = "名" /></td>
			</tr>

			<tr>
				<th><label>姓ふりがな</label></th>
				<td><input type = "text" name = "familyNameKana" value = '<s:property value = "familyNameKana" />' placeholder = "姓ふりがな" /></td>
			</tr>

			<tr>
				<th><label>名ふりがな</label></th>
				<td><input type = "text" name = "firstNameKana" value = '<s:property value = "firstNameKana" />' placeholder = "名ふりがな" /></td>
			</tr>

			<tr>
				<th><label>住所</label></th>
				<td><input type = "text" name = "userAddress" value = '<s:property value = "userAddress" />' placeholder = "住所" /></td>
			</tr>

			<tr>
			    <th><label>電話番号</label></th>
			    <td><input type = "text" name = "telNumber" value = '<s:property value = "telNumber" />' placeholder = "電話番号" /></td>
			</tr>

			<tr>
				<th><label>メールアドレス</label></th>
				<td><input type = "text" name = "email" value = '<s:property value = "email" />' placeholder = "メールアドレス" /></td>
			</tr>
		</table>

		<div id = "buttonArea">
			<input type ="submit" value = "確認" class = "button" />
		</div>

	</form>

</body>

</html>
