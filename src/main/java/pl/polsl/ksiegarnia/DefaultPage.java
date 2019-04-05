package pl.polsl.ksiegarnia;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the default-page.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("default-page")
@HtmlImport("default-page.html")
@Route("Home")
public class DefaultPage extends PolymerTemplate<DefaultPage.DefaultPageModel> {

    @Id("vaadinHorizontalLayout")
    private HorizontalLayout vaadinHorizontalLayout;
    @Id("ironIcon")
    private Element ironIcon;
    @Id("vaadinTextField")
    private TextField vaadinTextField;
    @Id("searchButton")
    private Button searchButton;
    @Id("profileButton")
    private Button profileButton;
    @Id("cartButton")
    private Button cartButton;
    @Id("homeButton")
    private Button homeButton;

    /**
     * Creates a new DefaultPage.
     */
    public DefaultPage() {
        // You can initialise any data required for the connected UI components here.
        searchButton.addClickListener(event -> {
            vaadinHorizontalLayout.add(new Label("HALOOOO"));
        });
        homeButton.addClickListener(event -> {
            homeButton.getUI().ifPresent(ui -> ui.navigate("Home"));
        });
    }

    /**
     * This model binds properties between DefaultPage and default-page.html
     */
    public interface DefaultPageModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
