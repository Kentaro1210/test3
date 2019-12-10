package jp.co.kenshu;

public class Kaiin {

	//会員ID、会員名、登録日時を変数定義
	private int id;
	private String name;
	private String addDate;
	
	
	//idのgetterとsetter 
    public int getid() {
        return id;
    }
    
    public void setid(int Id) {
        this.id = Id;
    }
    
    
    //nameのgetterとsetter 
    public String getname() {	
        return name;	
    }
    
    public void setname(String Name) {
        this.name = Name;
    }
    
    
  //addDateのgetterとsetter 
    public String getaddDate() {
        return addDate;
    }
    
    public void setaddDate(String AddDate) {
    	this.addDate = AddDate;
    }
	
}
