package controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class IndexController extends Controller {

    public void index(){
        setAttr("msg","hello world");
        setSessionAttr("abc","123456");
        renderTemplate("index.html");
    }

    @ActionKey("/login")
    public void indexLogin(){
        setAttr("msg","login");
        Map<String,Object> reMap = new HashMap<String,Object>();
        reMap.put("name","tolyzty");
        reMap.put("phone","17899999999");
        setAttrs(reMap);
        render("login.html");
    }

    public void form(){
        Integer id = getParaToInt(0);
        if(id!=null&&id>0){

            setAttr("blog","wwwwwwwwwww");
        }
        render("form.jsp");
    }
}
