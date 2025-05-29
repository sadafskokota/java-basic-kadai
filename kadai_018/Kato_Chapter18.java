package kadai_018;

abstract public class Kato_Chapter18 {

	//フィールド
	String familyName="加藤";
	String givenName;
	String address="住所は東京都中野区〇×です";
	
	public void commonIntroduce() {
    	System.out.println("名前は"+familyName+givenName+"です");
    	System.out.println(address);

    }
	
	
    // 紹介の実行
    abstract public void eachIntroduce();
    
    
    //出力
    public void execIntroduce(){
    	commonIntroduce();    
		 eachIntroduce();
    }
    
}