package inheritance_casting;

public class CastingTest2 {
	
// 넷플릭스
// 애니메이션, 영화, 드라마 클래스를 만들었습니다.
// 사용자가 선택한 영상이 애니메이션이라면 "자막 지원" 기능을 사용하고,
// 영화라면 "4D" 기능을 사용하고,
// 드라마라면 "굿즈" 기능을 사용합니다.

	public void check(Video video) {
		if(video instanceof Animation) {
			Animation animation = (Animation)video;
			animation.printSubtitle();
			
		} else if(video instanceof Film) {
			Film film = (Film)video;
			film.playFilm();
			
		} else if(video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.sellGoods();
		} 
	}
	
	public static void main(String[] args) {
		CastingTest2 ct = new CastingTest2();
		
		ct.check(new Animation());
		ct.check(new Film());
		ct.check(new Drama());
	}
}
