package ex1;
public class exStaff { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staffs[]  = new Staff[3];
		staffs[0] = new Staff("�m�W:�R���D�������p����","ID:1774312","�q��:0742658743","����:�Q�g�������q���Ѫ��a",172 ,65);
		staffs[1] = new Staff("�m�W:�R���D�������p�k��","ID:2775435","�q��:0399684843","����:�Q�g�������q���k���a",182 ,65);
		staffs[2] = new Staff("�m�W:�R���D�������p�k��","ID:3778941","�q��:0162733943","����:�Q�g�������q���j�ѪF",202 ,80);

		for(int i = 0;i<3;i++){
			staffs[i].showAll();
		}
		Student stus[]  = new Student[3];
		 stus[0] = new Student("�m�W:�������p�ͤl","ID:99","�ʧO:�ڬO�k��","���X��p�Z");
		 stus[1] = new Student("�m�W:�������j��l","ID:98","�ʧO:�ڬO�k��","�NŪ�p�Z���L��ɴ�");
		 stus[2] = new Student("�m�W:�������p��l","ID:97","�ʧO:�ڬO�k��","�ܥ��ɴ�");
		 for(int i = 0;i<3;i++){
				stus[i].showAll();
			}
		 Teacher teachers[]  = new Teacher[3];
		 teachers[0] = new  Teacher("�m�W:�N��v��","�q��:0236689547","pd71@gmail.com");
		 teachers[1] = new  Teacher("�m�W:�����N�v��","�q��:0332296798","pd72@gmail.com");
		 teachers[2] = new  Teacher("�m�W:�pŢ�]�v��","�q��:0972431598","pd73@gmail.com");
		 for(int i = 0;i<3;i++){
			 teachers[i].showAll();
			}
	}

}
