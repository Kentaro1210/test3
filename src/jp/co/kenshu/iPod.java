package jp.co.kenshu;

public class iPod extends Title implements Player{
	
    //コンストラクタでiPod使用開始メッセージを出力する
	iPod(){
	System.out.println("iPodの使用を開始します。");
    }

	//void→booleanに仕様変更
	public boolean useIpod(String music, String artist) {
		
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
	    System.out.println("ひかえめに再生します");
    }
	
	//pauseメソッドの実装
    public void pause() {
        System.out.println("かしこまりました、一時停止します");
	}
	
	//stopメソッドの実装
    public void stop() {
        System.out.println("再生を停止しました");
	}
}
