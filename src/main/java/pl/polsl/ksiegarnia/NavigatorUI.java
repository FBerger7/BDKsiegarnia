package pl.polsl.ksiegarnia;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.navigator.Navigator;

public class NavigatorUI extends UI {
    Navigator navigator;
    protected static final String MAINVIEW = "main";

    @Override
    protected void init(VaadinRequest request) {
        getPage().setTitle("Navigation Example");

        // Create a navigator to control the views
        //navigator = new Navigator(this,this);

        // Create and register the views
        navigator.addView("home", new MyUI());
       //navigator.addView(MAINVIEW, new MainView());
    }
}
