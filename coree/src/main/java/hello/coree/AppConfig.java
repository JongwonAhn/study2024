package hello.coree;

import hello.coree.discount.DiscountPolicy;
import hello.coree.discount.FixDiscountPolicy;
import hello.coree.discount.RateDiscountPolicy;
import hello.coree.member.MemberRepository;
import hello.coree.member.MemberService;
import hello.coree.member.MemberServiceImpl;
import hello.coree.member.MemoryMemberRepository;
import hello.coree.order.OrderService;
import hello.coree.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 @Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }

}
