package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SimpleFormController {
    @RequestMapping("/showForm")
    public String showForm() {
        return "simple-form";
    }

    @RequestMapping("/processForm")
    public String doSomeThing(HttpServletRequest request, Model model) { //add here

        String theName = request.getParameter("studentname");
        theName = theName.toUpperCase();
        String theMessage = "Hello " + theName + "!!!";
        model.addAttribute("msg", theMessage);
        return "simple-form-resault";
    }


    @RequestMapping("/shoutHelloAgain")
    public String shoutWithAnnotation(
            @RequestParam("studentName") String theName, Model model) {
        String message = "Hello again, " + theName.toUpperCase() + "!!!";
        return "simple-form-result";
    }
}
