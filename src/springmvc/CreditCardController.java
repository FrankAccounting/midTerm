package springmvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CreditCardController {

    @RequestMapping
    public String showForm()
    {
        return "cc";
    }



    @RequestMapping
    public String processForm(@RequestParam String ccNumber,
                              @RequestParam String ccName,
                              @RequestParam String exp,
                              @RequestParam String secCode,
                              Model model)
    {
       String msg = ccNumber;
       model.addAttribute("essage",msg);
    return "ccc";
    }
}
