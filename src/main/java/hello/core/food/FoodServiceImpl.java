package hello.core.food;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import hello.core.member.MemberRepository;

public class FoodServiceImpl implements FoodService{
    private final FoodRepository foodRepository;

    @Autowired
    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public void register(KoreanFood food) {
        foodRepository.save(food);
    }

    @Override
    public Optional<KoreanFood> find(Long foodId) {
        return foodRepository.findById(foodId);
    }
    
}
