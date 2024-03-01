package com.spring_parc.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "lee";
    }
    @Bean
    public int age(){
        return 15;
    }
    @Bean(name = "address1")
    @Primary
    public Address address(){
        var address = new Address("Seoul", "GangNam");
        return address;
    }

    //STUDY 객체를 생성하며 값을 입력하기 때문에 입력한 값이 사용됨
    @Bean(name = "personKim")
    public Person person(){
        var person = new Person("Kim", 20, new Address("Busan", "SeoGu"));
        return person;
    }

    //STUDY 메서드를 통해 호출하므로 객체에 선언되어있는 값이 그대로 사용됨
    @Bean(name = "personLee")
    @Primary
    public Person personMethodCall(){
        var person = new Person(name(), age(), address());
        return person;
    }

    //STUDY 매개변수를 통해 입력받은 값을 사용
    @Bean(name = "personPark")
    public Person personParameterCall(String name, int age, Address address3){
        var person = new Person(name, age, address3);
        return person;
    }

    @Bean(name = "personSong")
    public Person personQualifier(String name, int age, @Qualifier("address3qualifier") Address address){
        var person = new Person(name, age, address);
        return person;
    }

    @Bean(name = "address2")
    public Address address2(){
        return new Address("Baker Street", "London");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("Motinagar", "Hyderabad");
    }
}
