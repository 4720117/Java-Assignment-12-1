
/**
 * 演習問題
 * 
 * @author (4720117 佐藤誠弥)
 * @version (2022/07/08)
 */
public class DNA {
    public String str = "";
    
    public String getPair(){
        String r="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='A') r+="T";
            else if(str.charAt(i)=='T') r+="A";
            else if(str.charAt(i)=='C') r+="G";
            else if(str.charAt(i)=='G') r+="C";
        }
        return r;
    }

}
