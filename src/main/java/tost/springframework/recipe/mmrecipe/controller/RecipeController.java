package tost.springframework.recipe.mmrecipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tost.springframework.recipe.mmrecipe.services.RecipeService;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/recipes"})
    public String getRecipePage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "recipes";
    }
}
