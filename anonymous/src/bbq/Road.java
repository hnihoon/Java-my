package bbq;

public class Road {

	public static void main(String[] args) {
		BBQ jamsil = new BBQ("잠실점");
		jamsil.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] menus = getMenu();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(order)) {
						System.out.println(menus[i]+" 주문 성공!!");
					}
				}
				
			}
			
			@Override
			public String[] getMenu() {
				String[] menus = {"황금올리브 치킨", "야채 양념 치킨", "맛쵸킹 치킨"};
				return menus;
			}
		});
	}

}
