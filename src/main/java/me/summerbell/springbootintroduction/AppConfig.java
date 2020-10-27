package me.summerbell.springbootintroduction;

import me.summerbell.springbootintroduction.repository.MemberRepository;
import me.summerbell.springbootintroduction.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private final MemberRepository memberRepository;

    public AppConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
        private final DataSource dataSource;

        @PersistenceContext
        private  EntityManager em;

        public AppConfig(DataSource dataSource) {
            this.dataSource = dataSource;
        }
        */
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
        //return new MemberService(memberRepository())
    }

    /*@Bean
    public MemberRepository memberRepository(){
        return new JpaMemberRepository(em);
    }*/

}
