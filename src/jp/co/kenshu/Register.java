package jp.co.kenshu;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Register {
	public static void main(String args[]) {
		
		//ArrayListクラスを使ってKaiin型の動的配列「kaiinAll」を作成する。
		ArrayList<Kaiin> kaiinAll = new ArrayList<Kaiin>();
	
		//kaiinAddメソッドを呼び出して結果をKaiinAllに追加する
		kaiinAll.add(kaiinAdd(0001, "山田太郎"));
		kaiinAll.add(kaiinAdd(0002, "鈴木花子"));
		kaiinAll.add(kaiinAdd(0003, "佐藤琢磨"));
		
		
	    DecimalFormat dformat = new DecimalFormat("0000");
	
		//表示
	    //Register.java(22)拡張for文に書き換えてください。
		for(Kaiin kaiin : kaiinAll) {
		    System.out.println(
		    		
		    kaiin.getname() + "さんの会員IDは" 
		    + dformat.format(kaiin.getid())+ "です。"
		    +"登録：" + kaiin.getaddDate()
		    
		    );
	     }	
	}
	
	private static Kaiin kaiinAdd(int id, String name) {
		
		//Kaiinクラスのインスタンスを作成する
		Kaiin member = new Kaiin();
		
		//引数を使ってIDと名前をsetする。登録日時はDate関数を使う
		member.setid(id);
		member.setname(name);
		
		//現在日時の設定
		Calendar c1 = Calendar.getInstance();	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sdf.applyPattern("yyyy年MM月dd日");
		
		member.setaddDate(sdf.format(c1.getTime()));

		//データをセットしたインスタンスをreturnする
        return member;
	}
}
