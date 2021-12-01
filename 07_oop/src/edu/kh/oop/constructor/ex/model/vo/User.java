package edu.kh.oop.constructor.ex.model.vo;

public class User {
	/* Ŭ���� ����
	 * 
	 * public class Ŭ������{
	 *  �ʵ�
	 *  ������
	 *  �޼ҵ�
	 * }
	 * 
	 * */
	
	private String userId; 		// ����� ID
	private String userPwd; 	// ����� ��й�ȣ
	private String userName; 	// ����� �̸�
	private int age; 			// ����� ����
	private char gender;		// ����� ����
	
	
	// ������
	/* 
	 * - new �����ڸ� ���� ��ü ���� ��
	 *   ������ ��ü�� ���� �ʱ�ȭ �ϰ�, ������ ����� ���� �ϴ� ���� ����.
	 * 
	 * - ������ �ۼ� �� ���� ����
	 * 1) �����ڸ��� �ݵ�� Ŭ������� �����ؾ� �Ѵ�.
	 * 2) ��ȯ���� �������� �ʴ´�.
	 * 3) �Ű����� �ִ� ������ �ۼ� ��
	 *    �⺻ �����ڰ� �����Ϸ��� ���� �ڵ����� �������� �����Ƿ�
	 *    �⺻ �����ڸ� �ݵ�� �ۼ��ؾ��Ѵ�.
	 *    
	 *    -> Ŭ���� ���� �����ڰ� �ƹ��͵� �ۼ��Ǿ� ���� ������ 
	 *       �����Ϸ��� �⺻ �����ڸ� �ڵ����� �߰���������,
	 *       
	 *       �����ڰ� �ϳ��� �ۼ��� ���
	 *       �����Ϸ��� �⺻ �����ڸ� �ڵ� �߰������� �ʴ´�.
	 * */
	
	// �⺻ ������
	// [����������] Ŭ������(){ }
	// *** �⺻ �����ڰ� �ۼ����� ���� ���
	//     �����Ϸ��� ���ؼ� �ڵ����� �⺻ �����ڰ� �߰��ȴ�!
	public User() {
		System.out.println("User() �⺻ �����ڿ� ���ؼ� User ��ü�� ������.");
	}
	
	
	// �Ű����� �ִ� ������ 
	// * �Ű�����(parameter) : �޼ҵ� ȣ�� �� ���޵Ǵ� ���� ������ ����(�Ű�ü ����)
	// ������ ���� + setter ����
	// -> ��ü ���� �� �Ű������� ���� ���� ���� �̿��ؼ� �ʵ� ���� �ʱ�ȭ �ϴ� ������
	public User(String userId, String userPwd, String userName,
				int age, char gender) {
		
		/* this() ������
		 * - ���� Ŭ���� ���� �ִ� �ٸ� �����ڸ� ȣ���� �� ���
		 * - ������ ���ο����� �ۼ��� �� �ְ�, �ݵ�� ù ��° �ٿ� �ۼ� �Ǿ�� �Ѵ�.
		 * 
		 * this() ������ ��� ����
		 * - �ݺ��Ǵ� ������ ������ �ҽ� �ڵ� �ߺ��� �ذ��ϱ� ���Ͽ�
		 *  == �ڵ��� ���뼺 ����
		 * */
		this(userId, userPwd);
		
		//this.userId = userId;
		//this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	// ���̵�, ��й�ȣ�� �ʱ�ȭ�ϴ� ������
	// (�޼ҵ���� ����, �Ű����� ������ �ٸ��Ƿ� �����ε� ����)
	public User(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	// ���̵�, �̸��� �ʱ�ȭ �ϴ� ������
	// -> �����ε� �� ���� ����
	//   �Ű������� ������ �ٲٰ� �� ���
	//   �Ű��������� �߿��Ѱ� �ƴ϶�, �ڷ����� �����Ѵ�!
	//   -> �����ε� �������ǿ��� ���ϴ� �Ű������� ������ 
	//      �ڷ����� ������ �ǹ���!!!
	/*public User(String userName, String userId) {
		
	}*/
	
	
	// �̸�, ����
	// (�Ű����� ������ ���������� Ÿ���� �ٸ��Ƿ� �����ε� ����)
	public User(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}
	
	// ����, �̸�
	// (�Ű������� ����, Ÿ���� ���������� ������ �ٸ��Ƿ� �����ε� ����)
	public User(int age, String userName) {
		this.userName = userName;
		this.age = age;
	}
	
	
	
	
	// �����ε�(OverLoading, ����)
	// �� Ŭ���� ���� ������ �̸��� �޼ҵ带 ���� �� �ۼ��ϴ� ���
	// -> ���� -> �޼ҵ�� �ϳ� == ���� ��� �ϳ�
	//    �����ε� ���� ��  -> �޼ҵ�� �ϳ� == ���� ��� ���� ��
	
	// �����ε� ���� ����
	// 1. �޼ҵ���� ���ƾ� �Ѵ�.
	// 2. �Ű������� Ÿ��, ����, ���� �� �ϳ��� �޶�� �Ѵ�.
	
	
	
	// getter/setter
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// alt + shift + s -> r  : getter/setter �ڵ� �ϼ� ���
	
	
	// ��ü�� �ʵ� ������ �ϳ��� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String toString() {
		
		String result = userId + "/" + userPwd + "/" +
						userName + "/" + age + "/" + gender;
		
		return result;
	}
	
	
	
	
	
	
	
	
	
}
