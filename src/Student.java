public class Student {
	int id;
	String name;
	
	//메소드 오버로딩 (같은 메소드에서)
	Student() { System.out.println("학생 생성"); }
	Student(int id, String name) {
		insertRecord(id, name);
		
	}
	
	void insertRecord(int id, String name) {
		this.id = id;
		this.name = name;
		
		
		
	}
	
	void printInfo() {
		System.out.println("ID : " + this.id);
		System.out.println("name: " + this.name);
		
	}
}
