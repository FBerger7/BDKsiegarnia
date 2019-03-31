package pl.polsl.ksiegarnia;

import com.vaadin.annotations.HtmlImport;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import pl.polsl.ksiegarnia.HomePageCompanion.MyCompanionClassModel;

@Tag("homePage")
@HtmlImport("G:\\Studia\\SEM6\\BD\\ksiegarnia\\src\\main\\resources\\pl\\polsl\\ksiegarnia\\homePage.html")
@Route("Home")
public class HomePageCompanion extends
        PolymerTemplate<MyCompanionClassModel> {

    public interface MyCompanionClassModel extends TemplateModel {

    }
}
