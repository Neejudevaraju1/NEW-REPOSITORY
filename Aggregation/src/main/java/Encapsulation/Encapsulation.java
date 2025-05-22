package Encapsulation;

public class Encapsulation {
private int Accntno;
private int AccntBalance;
public void SetDetails(int accntno,int accntbalance) {
	this.AccntBalance=accntbalance;
	this.Accntno=accntno;
}
public int getAccntBalane() {
	return AccntBalance;

}
public int getAccntno() {
	return Accntno;
}
}
