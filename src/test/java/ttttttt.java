import org.cwsya.TLBook.config.ClientConfig;
import org.cwsya.TLBook.service.Impl.DataServiceImpl;
import org.cwsya.TLBook.util.ConfigUtil;
import org.cwsya.TLBook.util.HttpUtil;
import org.junit.Test;

import java.util.HashMap;

public class ttttttt {

    @Test
    public void ttttttttt(){
        HashMap<String, String> map = new HashMap<>();
        map.put("userName","admin");
        map.put("passWord","12345");
        String s = HttpUtil.httpPost("/admin/login", map).getJSONObject("data").getString(ClientConfig.TOKEN_NAME);
        System.out.println(s);
    }
    @Test
    public void fkjs(){
        new DataServiceImpl().getBook(1,null);
    }
}
