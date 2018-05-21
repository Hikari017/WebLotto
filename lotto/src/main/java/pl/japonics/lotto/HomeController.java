package pl.japonics.lotto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


@Controller
public class HomeController {
    @GetMapping("/")
    public String getHello(ModelMap modelMap) {
        Set<Integer> integerSet = new TreeSet<>();
        Random random = new Random();
        while (integerSet.size() != 6) {
            integerSet.add(random.nextInt(49) + 1);
        }
        modelMap.put("number", integerSet);
        return "hello";

    }
}
