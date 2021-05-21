package MidExam;

abstract class work{
	
	int years;
	
	public work() {};
	
	public work(int years) {
		this.years = years;
	}
	
	abstract void work();
	
	int salery() {
		int sal = (years*500)+3000;
		return sal;
	}
}

public class WorkingMom extends work{

	int num_of_children;
	
	public WorkingMom(int years) {
		super.years = years;
	}
	
	void work() {
		System.out.println(super.years+"년 째 일하고 있습니다.");
	}
	int salery() {
		int sal = (years*500)+3000;
		return sal;
	}
	public static void main(String[] args) {
		WorkingMom w = new WorkingMom(10);
		w.work();
		System.out.println(w.salery());
	}

}
