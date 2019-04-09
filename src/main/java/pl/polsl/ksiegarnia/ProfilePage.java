package pl.polsl.ksiegarnia;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the profile-page.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("profile-page")
@HtmlImport("profile-page.html")
@PageTitle("Profile")
@Route("Profile")
public class ProfilePage extends PolymerTemplate<ProfilePage.ProfilePageModel> {

    @Id("vaadinAppLayout")
    private AppLayout vaadinAppLayout;
    @Id("backButton")
    private Button backButton;

    /**
     * Creates a new ProfilePage.
     */
    public ProfilePage() {
//        backButton.addAttachListener(event -> {
//            backButton.getUI().ifPresent(ui -> ui.navigate("Home"));
//        });
    }

    /**
     * This model binds properties between ProfilePage and profile-page.html
     */
    public interface ProfilePageModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
