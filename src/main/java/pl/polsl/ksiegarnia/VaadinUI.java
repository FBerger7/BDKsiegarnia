package pl.polsl.ksiegarnia;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.spring.annotation.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.server.VaadinRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SpringUI
public class VaadinUI extends UI {

    @Autowired
    private AuthorService service;

    private Author author;
    private Binder<Author> binder = new Binder<>(Author.class);

    private Grid<Author> grid = new Grid(Author.class);
    private TextField firstName = new TextField("First name");
    private TextField lastName = new TextField("Last name");
    private Button save = new Button("Save", e -> saveCustomer());

    @Override
    protected void init(VaadinRequest request) {
        updateGrid();
        grid.setColumns("firstName", "lastName");
        grid.addSelectionListener(e -> updateForm());

        binder.bindInstanceFields(this);

        VerticalLayout layout = new VerticalLayout(grid, firstName, lastName, save);
        setContent(layout);
    }

    private void updateGrid() {
        List<Author> customers = service.findAll();
        grid.setItems(customers);
        setFormVisible(false);
    }

    private void updateForm() {
        if (grid.asSingleSelect().isEmpty()) {
            setFormVisible(false);
        } else {
            author = grid.asSingleSelect().getValue();
            binder.setBean(author);
            setFormVisible(true);
        }
    }

    private void setFormVisible(boolean visible) {
        firstName.setVisible(visible);
        lastName.setVisible(visible);
        save.setVisible(visible);
    }

    private void saveCustomer() {
        service.update(author);
        updateGrid();
    }
}