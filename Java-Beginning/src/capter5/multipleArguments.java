package capter5;

public class multipleArguments {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		add(100, 20);
		add(200, 50);
	}
	
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}