// 주사위의 눈의 수는 1 ~ 6인데 주사위를 10번 던져서 전체 합계는 얼마인지 구하기
// 1 나오면 500원, 2 나오면 700원, 3 나오면 1200원, 4 나오면 1800원, 5 나오면 2100, 6 나오면 3000원

package pack06;

public class RandomEx2 {

	public static void main(String[] args) {

		int dice = (int)(Math.random() * 6 + 1);
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			if (dice == 1) {
				count += 500;
			} else if (dice == 2) {
				count += 700;
			} else if (dice == 3) {
				count += 1200;
			} else if (dice == 4) {
				count += 1800;
			} else if (dice == 5) {
				count += 2100;
			} else if (dice == 6) {
				count += 3000;
			}
			System.out.print("★ 눈의 수 → " + dice + " ★" + "\n");
		}
		System.out.print("♥ 합계 → " + count + " ♥");
		
	}

}
