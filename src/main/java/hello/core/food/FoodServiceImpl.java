package hello.core.food;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.core.member.MemberRepository;

@Service
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
