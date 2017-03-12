package ex1;
public class exStaff { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staffs[]  = new Staff[3];
		staffs[0] = new Staff("姓名:愛玩非高高的小屁孩","ID:1774312","電話:0742658743","部門:噴射飛版公司的老玩家",172 ,65);
		staffs[1] = new Staff("姓名:愛玩非高高的小女孩","ID:2775435","電話:0399684843","部門:噴射飛版公司的女玩家",182 ,65);
		staffs[2] = new Staff("姓名:愛玩非高高的小男孩","ID:3778941","電話:0162733943","部門:噴射飛版公司的大股東",202 ,80);

		for(int i = 0;i<3;i++){
			staffs[i].showAll();
		}
		Student stus[]  = new Student[3];
		 stus[0] = new Student("姓名:阿明的私生子","ID:99","性別:我是男生","幼稚園小班");
		 stus[1] = new Student("姓名:阿明的大兒子","ID:98","性別:我是男生","就讀小班的過渡時期");
		 stus[2] = new Student("姓名:阿明的小兒子","ID:97","性別:我是男生","喝奶時期");
		 for(int i = 0;i<3;i++){
				stus[i].showAll();
			}
		 Teacher teachers[]  = new Teacher[3];
		 teachers[0] = new  Teacher("姓名:煮菜師傅","電話:0236689547","pd71@gmail.com");
		 teachers[1] = new  Teacher("姓名:章魚燒師傅","電話:0332296798","pd72@gmail.com");
		 teachers[2] = new  Teacher("姓名:小籠包師傅","電話:0972431598","pd73@gmail.com");
		 for(int i = 0;i<3;i++){
			 teachers[i].showAll();
			}
	}

}
