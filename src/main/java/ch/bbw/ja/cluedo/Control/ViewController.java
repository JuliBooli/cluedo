package ch.bbw.ja.cluedo.Control;

import ch.bbw.ja.cluedo.datamodel.DataService;
import ch.bbw.ja.cluedo.datamodel.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {
    private final DataService dataService;
    @Autowired
    public ViewController(DataService dataService){
        this.dataService = dataService;
    }

    @GetMapping("/start")
    public String showView(Model model) {
        List<Person> people = dataService.getPeople();
        model.addAttribute("dataList", people);
        return "CluedoView.html";
    }
}
