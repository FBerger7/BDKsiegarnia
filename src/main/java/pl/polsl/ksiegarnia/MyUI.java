package pl.polsl.ksiegarnia;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.flow.router.Route;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebServlet;

public class MyUI extends UI implements View {
    private HomePageService homePage = new HomePageService(this);

    @WebServlet(value = "/*",  asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = MyUI.class)
    public static class Servlet extends VaadinServlet{
    }

    @Override
    protected void init(VaadinRequest vaadinRequest){
        final homePage design  = new homePage();
        setContent(design);
        //HorizontalLayout main = new HorizontalLayout(homePage);
        //main.setSizeFull();
    }


}
