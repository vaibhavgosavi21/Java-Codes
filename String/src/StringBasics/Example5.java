package StringBasics;

public class Example5 {
	String Devicetype;
	String Brand;
	String modelname;
	
	public Example5(String devicetype, String brand, String modelname) {
		super();
		Devicetype = devicetype;
		Brand = brand;
		this.modelname = modelname;
	}

	public String getDevicetype() {
		return Devicetype;
	}

	public void setDevicetype(String devicetype) {
		Devicetype = devicetype;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	@Override
	public String toString() {
		return "Example5 [Devicetype=" + Devicetype + ", Brand=" + Brand + ", modelname=" + modelname
				+ ", getDevicetype()=" + getDevicetype() + ", getBrand()=" + getBrand() + ", getModelname()="
				+ getModelname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	

}
