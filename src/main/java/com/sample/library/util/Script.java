package com.sample.library.util;

public class Script {
	
	public static String href(String alertMessage, String locationPath) {
		StringBuilder sb = new StringBuilder();
		sb.append("<script>");
		sb.append("alert('" + alertMessage + "');");
		sb.append("location.href = '" + locationPath + "';"); // 특정 이동경로로 요청
		sb.append("</script>");
		return sb.toString();
	}
	
	public static String back(String alertMessage) {
		StringBuilder sb = new StringBuilder();
		sb.append("<script>");
		sb.append("alert('" + alertMessage + "');");
		sb.append("history.back();"); // 뒤로가기
		sb.append("</script>");
		return sb.toString();
	}
}
