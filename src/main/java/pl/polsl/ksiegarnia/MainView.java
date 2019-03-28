package pl.polsl.ksiegarnia;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import java.util.ArrayList;
import java.util.List;

@Route("")
@PWA(name = "Ksiegarnia internetowa", shortName = "Ksiegarnia")
public class MainView extends VerticalLayout {

    final List customerList = new ArrayList();
   // private Grid<Customer> grid = new Grid<ArrayList>("Ksiazki", customerList);
    public MainView(){
        Button button = new Button("Click me!", event -> Notification.show("Clicked!"));
        add(button);
       // grid.setColumns("firstName", "lastName", "status");

        //grid.addRow("Harry", "Potter", "jakisStatus");
       // add(grid);

        setSizeFull();
    }

    public void showData(){
        //customerList.add()
    }
}
