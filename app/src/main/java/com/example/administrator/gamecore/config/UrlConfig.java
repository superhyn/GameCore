package com.example.administrator.gamecore.config;

/*       
* 类描述：   
* 创建人：Administrator glf  
* 创建时间：2016/8/1 17:57   
*/
public class UrlConfig {

    public static String getTopVpUrl(){
        return "http://www.g-cores.com/api/originals/home_slideshow?auth_exclusive=dpkynzs2q0wm9o5gi1r83fcabthl4eu";
    }

    public static String getStationUrl(String page){
        return "http://www.g-cores.com/api/categories/9/originals?page="+page+"&auth_exclusive=dpkynzs2q0wm9o5gi1r83fcabthl4eu";
    }
    public static String getVideoUrl(String page){
        return "http://www.g-cores.com/api/categories/8/originals?page="+page+"&auth_exclusive=dpkynzs2q0wm9o5gi1r83fcabthl4eu";
    }

    public static String getHomeUrl(String page){
        return "http://www.g-cores.com/api/originals/home?page="+page+"&auth_exclusive=dpkynzs2q0wm9o5gi1r83fcabthl4eu";
    }

    public static String getNewsUrl(String page){
        return "http://www.g-cores.com/api/categories/2/originals?page="+page+"&auth_exclusive=dpkynzs2q0wm9o5gi1r83fcabthl4eu";
    }

    public static String getItemUrl(String itemId){
        return "http://www.g-cores.com/api/originals/"+itemId+"/html_content?auth_exclusive=dpkynzs2q0wm9o5gi1r83fcabthl4eu";
    }

    public static String HOME_BASE_URL="http://www.g-cores.com/api/originals/";
    public static String HOME_END_KEY = "dpkynzs2q0wm9o5gi1r83fcabthl4eu";
}
