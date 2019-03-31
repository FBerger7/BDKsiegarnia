package pl.polsl.ksiegarnia;

import com.vaadin.annotations.HtmlImport;
import com.vaadin.annotations.Title;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class HomePageService extends homePage {

    @Autowired
    private MyUI myUI;

    @Autowired
    public HomePageService(MyUI myUI){
        this.myUI = myUI;
    }

    public MyUI getUI(){
        return myUI;
    }

}