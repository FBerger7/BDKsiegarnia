package pl.polsl.ksiegarnia;

import com.github.appreciated.material.MaterialTheme;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.accordion.AccordionPanel;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.*;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.theme.material.Material;
import com.vaadin.server.Page;
import com.vaadin.server.Resource;
import com.vaadin.server.Responsive;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.JavaScript;

/**
 * A Designer generated component for the default-page.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("default-page")
@HtmlImport("frontend://default-page.html")
@HtmlImport("frontend://styles/shared-styles.html")
@Route("Home")
@Theme(value = Material.class, variant = Material.DARK)
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
@PageTitle("Home")
public class DefaultPage extends PolymerTemplate<DefaultPage.DefaultPageModel> {

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
    @Id("vaadinHorizontalLayout1")
    private HorizontalLayout vaadinHorizontalLayout1;
    @Id("topPanel")
    private HorizontalLayout topPanel;
    @Id("windowLayout")
    private AppLayout windowLayout;
    @Id("label")
    private Label label;
    @Id("leftPanelInside")
    private VerticalLayout leftPanelInside;
    @Id("leftPanel")
    private VerticalLayout leftPanel;

    /**
     * Creates a new DefaultPage.
     */
    public DefaultPage() {
        Resource logoResource = new ThemeResource("images/logo.png");
        Image homeLogo = new Image("HOME", logoResource);
        Icon homeImage = new Icon(VaadinIcon.BOOK);
        homeImage.setSize("100px");
        topPanel.getElement().setAttribute("theme", "spacing padding");
        leftPanel.getElement().setAttribute("theme", "spacing padding");
        leftPanelInside.getElement().setAttribute("theme", "spacing");
        leftPanel.setWidth("20%");
        //topPanel.getStyle().set("background-color", "red");
        //topPanel.setBranding(new H3("App Company"));
       // homeButton.setIcon((Component)homeLogo.getIcon());
       // searchButton.addClickListener(event -> {
           // JavaScript.getCurrent().execute("alert('Hello')");        });
        homeButton.addClickListener(event -> {
            homeButton.getUI().ifPresent(ui -> ui.navigate("Profile"));
        });
    }

    /**
     * This model binds properties between DefaultPage and default-page.html
     */
    public interface DefaultPageModel extends TemplateModel {
        // Add setters and getters for template properties here.
//        public TextField getVaadinTextField();
//
//        public Button getSearchButton();
//
//        public Button getProfileButton();
//
//        public Button getCartButton();
//
//        public Button getHomeButton();
//
//        public HorizontalLayout getVaadinHorizontalLayout1();
//
//        public VerticalLayout getLeftPanel();
//
//        public HorizontalLayout getTopPanel();
//
//        public AppLayout getWindowLayout();
    }

}
