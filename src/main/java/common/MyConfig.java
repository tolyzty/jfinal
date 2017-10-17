package common;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;
import controller.IndexController;

public class MyConfig extends JFinalConfig {

    public void configConstant(Constants constants){

    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/", IndexController.class);
    }

    public void configEngine(Engine engine){

    }

    public void configPlugin(Plugins plugins){

    }

    public void configInterceptor(Interceptors interceptors){

    }
    public void configHandler(Handlers handlers){

    }

    public static void main(String[] args){
        JFinal.start("src/main/webapp",8081,"/",5);
    }

}
