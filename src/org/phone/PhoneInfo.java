package org.phone;

public class PhoneInfo {
//phoneName(),phoneMieiNum(),Camera(),storage(),osName()
	public void phoneName() {
		System.out.println("Phone NAme is: Iphone");
	}
	public void phoneMieiNum() {
		System.out.println("Mieie num is: abcd128");
	}
	public void Camera() {
		System.out.println("Camera is present");
	}
	public void storage() {
		System.out.println("Storage is present");
	}
	public void osName() {
		System.out.println("os Name is IOS");
	}
	public static void main(String[] args) {
		PhoneInfo p =new PhoneInfo();
		p.Camera();
		p.osName();
		p.phoneMieiNum();
		p.phoneName();
	}
}
