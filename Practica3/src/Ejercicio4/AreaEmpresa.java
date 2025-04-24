package Ejercicio4;

public class AreaEmpresa {
	private String id;
	private int num;
	
	public AreaEmpresa() {
		
	}
	
	public AreaEmpresa(String unID, int unNum) {
		id = unID;
		num = unNum;
	}
	
	public void setID(String unID) {
		id = unID;
	}
	
	public String getID() {
		return id;
	}
	
	public void setNum(int unNum) {
		num = unNum;
	}
	
	public int getNum() {
		return num;
	}
}