package LEVEL3;

public class Eto {

    public static void main(String[] args) {
	
	//seinenを引数にしてgetJikkanを呼び出し、結果を文字列型で受け取る
	//seinenを引数にしてgetJunishiを呼び出し、結果を文字列型で受け取る
        int seinen =2016;
		    System.out.println(seinen+"年の干支は"+getJikkan(seinen)+getJunishi(seinen)+"です。");
	}
	
	//十干をenum型で定義する
    private enum jikkan{
        庚,辛,壬,癸,甲,乙,丙,丁,戊,己
    }

	//yearをもとに十干を算出して文字列の形でreturnする
    private static String getJikkan(int year) {
		
        int rem1 = year%10;
		
        for (jikkan kan : jikkan.values()) {
            if (kan.ordinal() == rem1) {
                return kan.toString();  //toStringで型変換
			}
		}
	    return "";  //空の文字（String)を返す
	}
	
	//十二支をenum型で定義する
	private enum junishi{
	    申,酉,戌,亥,子,丑,寅,卯,辰,巳,午,未
	}

	//yearをもとに十二支を計算して文字列の形でreturnする
    private static String getJunishi(int year) {
		
        int rem2 = year%12;
		
		for (junishi shi : junishi.values()) {
            if (shi.ordinal() == rem2) {
                return shi.toString();
			}
		}
		return "";
	}
}
