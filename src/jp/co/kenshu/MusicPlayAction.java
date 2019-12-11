package jp.co.kenshu;

public class MusicPlayAction {

    public static void main(String[] args) {
	
	    //WalkManクラスのインスタンスを作成する
	    Walkman walkman = new Walkman();
		
	    //曲名とアーティスト名を引数にしてWalkｍanを使用してみる
	    if(walkman.useWalkman("海の幽霊", "")) {
	   
	    walkman.start();
	    walkman.pause();
	    walkman.stop();
	    }
	    
        System.out.println(); //1行開ける
	
	    //iPodクラスのインスタンスを作成する
	    iPod ipod = new iPod(); 
		
	    //曲名とアーティスト名を引数にしてiPodを使用してみる
        if(ipod.useIpod("ブルーバード", "いきものがかり")) {
        
        ipod.start();
        ipod.pause();
        ipod.stop();
        }
	}

}
