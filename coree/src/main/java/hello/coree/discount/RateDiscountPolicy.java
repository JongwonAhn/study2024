package hello.coree.discount;

import hello.coree.member.Grade;
import hello.coree.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPolicy = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPolicy / 100;
        }
            return 0;
    }
}
