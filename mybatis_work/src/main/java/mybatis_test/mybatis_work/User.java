package mybatis_test.mybatis_work;

import java.util.List;

public class User {
	public int id;
	public String userName;
	public String tel;
	public List<Integer> products;
	
	public List<Integer> getProducts() {
		return products;
	}
	
	public void setProducts(List<Integer> products) {
		this.products = products;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
}

