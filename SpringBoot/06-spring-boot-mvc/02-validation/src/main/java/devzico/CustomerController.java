package devzico;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String showform(Model model) {

        model.addAttribute("customerAtt", new Customer());
        return "customer-form";
    }
}
