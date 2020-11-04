package tost.springframework.recipe.mmrecipe.controller;


import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){

        System.out.println("Testing reload functionality  s");
        return "index";
    }
}
