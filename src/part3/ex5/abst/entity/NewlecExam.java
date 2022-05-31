package part3.ex5.abst.entity;

public class NewlecExam extends Exam {
	private int com;
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public NewlecExam() {
		this(0,0,0,0);
	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
		// TODO Auto-generated constructor stub
	}
	
	public int total() {
//		return this.getKor() + this.getEng() + this.getMath() + com;
		return super.total() + com;
	}

	@Override
	public double avg() {
		// TODO Auto-generated method stub
		return total() / 4.0;
	}
	
	
	
}
