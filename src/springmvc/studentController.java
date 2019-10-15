package springmvc;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class studentController {
    public String showFormManual(){
        return "manual-form";
    }


@RequestMapping("/process-form-manual")
    public String processFormManual(HttpServletRequest request,
                                    Model model) {
        String firstname = request.getParameter(firstname);
        String lastname = request.getParameter(lastname);
        //Missing the rest of this, other files
}

    public String processFormAnno(@RequestParam String fname,
                                  @RequestParam String lname,
                                  Model model)
    {
        String theMessage = "hello + " + fname;

        model.addAttribute("message", theMessage);

        return "Confirm manual";

    }
}
