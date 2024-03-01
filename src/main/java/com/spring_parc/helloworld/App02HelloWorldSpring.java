package com.spring_parc.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("address1"));
        System.out.println();
        System.out.println();
        System.out.println("주소를 하드코딩으로 추가한 Bean: " + context.getBean("personKim"));
        System.out.println("객체간의 관계를 이용한 Bean: " + context.getBean("personLee"));
        System.out.println("파라미터를 이용한 Bean: " + context.getBean("personPark"));
        System.out.println("@Qualifier를 이용한 Bean 출력: " + context.getBean("personSong"));
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        //STUDY Address Bean을 3개 선언해주었기 때문에 어떤 Address클래스를 불러와야하는지 찾지 못 함
        System.out.println("Class를 통해 주소 출력: " + context.getBean(Address.class));
        System.out.println("Class를 통해 person객체 출력: " + context.getBean(Person.class));
        //STUDY @Primary 어노테이션을 사용하여 기본객체를 지정해주어서 오류를 처리
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
