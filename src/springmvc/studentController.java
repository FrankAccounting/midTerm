package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
        public class studentController {
            @RequestMapping("/show-form-bindings")
            public String ShowFormBindings(Model model){
                Student theStudent = new Student();
                model.addAttribute("steve",theStudent);
                return "binding-form";

            }
            @RequestMapping("/process-form-binding")
            public String processFormBinding(@ModelAttribute("steve") Student s){
                System.out.println(s.getFirstName());
                System.out.println(s.getLastName());
                return "confirm-binding";

            }


}
