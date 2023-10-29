package ch.bbw.ja.cluedo.Control;

import ch.bbw.ja.cluedo.model.DataService;
import ch.bbw.ja.cluedo.model.Person;
import ch.bbw.ja.cluedo.model.Room;
import ch.bbw.ja.cluedo.model.Weapon;
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

    @GetMapping("/")
    public String showView(Model model) {
        List<Person> people = dataService.getPeople();
        List<Weapon> weapons = dataService.getWeapons();
        List<Room> room = dataService.getRoom();
        model.addAttribute("dataList", people);
        model.addAttribute("weaponList", weapons);
        model.addAttribute("roomList", room);
        return "CluedoView.html";
    }
}
