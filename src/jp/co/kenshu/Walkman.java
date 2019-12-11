package jp.co.kenshu;

public class Walkman extends Title implements Player{

	//コンストラクタでWalkman使用開始メッセージを出力する
    Walkman(){
		System.out.println("Walkmanの使用を開始します。");
	}
	
    //void→booleanに仕様変更
	public boolean useWalkman(String music, String artist) {
		
	    //もし曲名もしくはアーティスト名がnullか0文字だったら 「再生に失敗しました」と出力して処理を終了する
	    if((music == null || music.equals ("")) || (artist == null || artist.equals (""))){
		    System.out.println("再生に失敗しました。");
		    return false;
		} else {
		
	    //曲名とアーティスト名をコンソールに出力する
	        System.out.println(artist + "の" + music + "を再生します。");
	        return true;
	    }
	}
	
    //startメソッドの実装
    public void start() {
	    System.out.println("爆音で再生します");
	}
	
    //pauseメソッドの実装
    public void pause() {
	    System.out.println("3分間待ってやる");
	}
	
	//stopメソッドの実装
    public void stop() {
	    System.out.println("停止しました");
    }
}

	
	
