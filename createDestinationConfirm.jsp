<%@ page language = "java" contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<!DOCTYPE html>

<html>

<head>

	<meta charset = "UTF-8"/>

	<link rel = "stylesheet" href = "css/style_main.css">
	<link rel = "stylesheet" href = "css/style_confirm.css">

	<title>宛先情報入力確認画面</title>

</head>

<body>

	<jsp:include page="header.jsp" />

	<h1>宛先情報入力確認画面</h1>

	<form method = "post">

		<table>
			<tr>
				<th scope = "row"><label>姓</label></th>
				<td>
					<s:property value = "familyName"/>
					<s:hidden name = "familyName" value = "%{familyName}"/>
				</td>
			</tr>

			<tr>
				<th scope = "row"><label>名</label></th>
				<td><s:property value = "firstName"/><s:hidden name = "firstName" value = "%{firstName}"/></td>
			</tr>

			<tr>
				<th scope = "row"><label>姓ふりがな</label></th>
				<td><s:property value = "familyNameKana"/><s:hidden name = "familyNameKana" value = "%{familyNameKana}"/></td>

			</tr>

			<tr>
				<th scope = "row"><label>名ふりがな</label></th>
				<td><s:property value = "firstNameKana"/><s:hidden name = "firstNameKana" value = "%{firstNameKana}"/></td>
			</tr>

			<tr>
				<th scope = "row"><label>住所</label></th>
				<td><s:property value = "userAddress"/><s:hidden name = "userAddress" value = "%{userAddress}"/></td>
			</tr>

			<tr>
				<th scope = "row"><label>電話番号</label></th>
				<td><s:property value = "telNumber"/><s:hidden name = "telNumber" value = "%{telNumber}"/></td>
			</tr>

			<tr>
				<th scope = "row"><label>メールアドレス</label></th>
				<td><s:property value = "email"/><s:hidden name = "email" value = "%{email}"/></td>
			</tr>
		</table>

		<div id = "buttonArea">
			<div id = "topButton"><input id = "topButton" type = "button" value = "登録" onclick = "formSubmit(this, 'CreateDestinationCompleteAction')" /></div>
			<div id = "bottomButton"><input id = "bottomButton" type = "button" value = "戻る" onclick = "formSubmit(this, 'CreateDestinationAction')" /></div>
		</div>

	</form>

</body>

</html>
