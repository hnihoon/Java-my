package overload;

public class Overload_super2 {

	private int seq;
	private String subject;
	private String writer;
	
	public Overload_super2(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	public Overload_super2(int seq) {
//		방법1
//		this(seq, "제목없음","익명");  
		
//		방법2
		this.seq = seq;
		this.subject = "제목없음";
		this.writer = "익명";
	}
	
	public Overload_super2(int seq, String subject) {
//		방법1
		this(seq,subject,"익명");
		
//		방법2
//		this.seq = seq;
//		this.subject = subject;
//		this.writer = "익명";
	}

	@Override
	public String toString() {
		return "Overload_super2 [seq=" + seq + ", subject=" + subject + ", writer=" + writer + "]";
	}
	
	
}
