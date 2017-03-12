package ex1;
class Teacher {
	public String name;
	private String SID;
	private String phone;
	private String email;
	public String gender;
	public String birth;
	public String depart;
	public String title;
	
	public Teacher(String name,String phone,String email){
		this.name=name;
		this.phone=phone;
		this.email = email;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setSID(String SID){
		this.SID=SID;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public void setBirth(String birth){
		this.birth=birth;
	}
	public void setDepart(String depart){
		this.depart=depart;
	}	
	public void setTitle(String title){
		this.title=title;
	}
	public String getName(){
		return name;
	}
	public String getPhone(){
		return phone;
	}
	public String getEmail(){
		return email;
	}
	public void showAll(){
		System.out.println( this.getName());
		System.out.println(this.getPhone());
		System.out.println("¹q¤l«H½c:"+this.getEmail());		
		System.out.println("-------------------");
		System.out.println();

	}
}
