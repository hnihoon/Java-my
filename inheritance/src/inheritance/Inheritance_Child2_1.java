package inheritance;

public class Inheritance_Child2_1 extends Inheritance_Parent2{

	private String answer;		//답변

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String toString() {
		return "질문/답변 [글번호 =" + getNum() 
		+ ", 제목 = " + getTitle() 
		+ ", 답변 = " + getAnswer() + "]";
	}
	
}
