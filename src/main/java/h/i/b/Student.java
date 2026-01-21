package h.i.b;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//Entity yeek annotation h jiska kaam h jo ye class ke naam h uska same 2 name pe database me table baan jata h
public class Student {
	@Id
	private int s_id;
	private String S_name;
	private String City;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
}
