package hello.core.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hello.core.member.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FoodController {
    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService){
        this.foodService = foodService;
    }

    @GetMapping(value = "/foods/new")
    public String createForm() {
        return "foods/createFoodForm";
    }
    
    @PostMapping(value = "/foods/new")
    public String create(KoreanFood form) {
        KoreanFood koreanFood = new KoreanFood();
        koreanFood.setName(form.getName());
        koreanFood.setCalorie(form.getCalorie());

        foodService.register(koreanFood);

        return "redirect:/";
    }
}
