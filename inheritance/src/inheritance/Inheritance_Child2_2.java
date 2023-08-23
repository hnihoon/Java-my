package inheritance;

public class Inheritance_Child2_2 extends Inheritance_Parent2{


		private String fileName;	//파일이름

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		
		public String toString() {
			return "자료실[번호 = " + getNum()
			+", 제목 = " + getTitle()
			+", 첨부파일 = " + this.fileName + "]";
				
		}
}
