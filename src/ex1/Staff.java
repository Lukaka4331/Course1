package ex1;
 class Staff {	
     String name;
     String id;
     String phone;
     String department;
     int height;
     int weight;
 public Staff( String name1 , String id1 , String phone1 , String department1 ,
 int height1 , int weight1 ){
	    name=name1;
	    id=id1;
	    phone=phone1;
	    department=department1;
	    height=height1;
	    weight=weight1; }
public void setName(String name2){ 	 
	name=name2;
}
public void setId(String id2){
	id=id2;
} 
public void setPhone(String phone2){     
	phone=phone2;
}
public void setDepartment(String department2){     
	department =department2; 
}
public void setHeight(int height2){
	height=height2;
}
public void setWeight(int weight2){
	 weight=weight2;
}
public  String getName(){
	return name;
}
public  String getId(){
	return id;
}
public  String getPhone(){
	return phone;
}
public  String getDepartment(){
	return department;
}
public  int getHeight(){
	return height;
}
public  int getWeight(){
	return weight;
}
public void showAll(){
	System.out.println(this.getName());
	System.out.println(this.getId());
	System.out.println(this.getPhone());
	System.out.println(this.getDepartment());
	System.out.println("身高:"+this.getHeight());
	System.out.println("體重:"+this.getWeight());
	System.out.println("---------------------------------");

}
}
