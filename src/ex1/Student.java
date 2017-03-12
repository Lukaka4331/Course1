package ex1;
class Student {
	private String name,id,gender,dept;
	public Student(String name1,String id1,String gender1,String dept1){
		name = name1;
		id = id1;
		gender = gender1;
		dept = dept1;
	}
	public Student(){
		
	}
	public void setName(String name2){
		name = name2;
	}
	public void setId(String id2){
		id = id2;
	}
	public void setGender(String gender2){
		gender = gender2;
	}
	public void setDept(String dept2){
		dept = dept2;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public String getGender(){
		return gender;
	}
	public String getDept(){
		return dept;
	}
	public void showAll(){
		System.out.println(this.getName());
		System.out.println(this.getId());
		System.out.println(this.getGender());
		System.out.println("dept : "+this.getDept());
		System.out.println("-------------------");
		System.out.println();

	}
}
