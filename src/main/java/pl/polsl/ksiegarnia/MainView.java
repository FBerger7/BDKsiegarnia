package pl.polsl.ksiegarnia;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route("")
@PWA(name = "Ksiegarnia internetowa", shortName = "Ksiegarnia")
public class MainView extends VerticalLayout {
    public MainView(){
        Button button = new Button("Click me!", event -> Notification.show("Clicked!"));
        add(button);
    }
}
