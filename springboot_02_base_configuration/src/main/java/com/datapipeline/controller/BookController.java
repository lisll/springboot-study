package com.datapipeline.controller;

import com.datapipeline.utils.MyDatasource;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

  // 读取配置文件中的单值
  @Value("${country}")
  private String country;

  @Value("${server.port}")
  private int port;
  // 读取配置文件中的数组
  @Value("${enterprise.subject[1]}")
  private String subject;

  @Value("${likes[1]}")
  private String likes;

  @Value("${users[1].age}")
  private int age;

  @Value("${user1[2].name}")
  private String name;

  @Value("${path2}")
  private String path;

  @Autowired private Environment env;

  @Autowired private MyDatasource datasource;

  @GetMapping
  public String getId() {
    System.out.println("springboot is running");
    System.out.println("country->" + country);
    System.out.println("port->" + port);
    System.out.println();
    System.out.println("subject->" + subject);
    System.out.println("likes->" + likes);
    System.out.println("users[1].age->" + age);
    System.out.println("users1[2].name->" + name);
    System.out.println("datadir->" + path);
    System.out.println("===================");
    System.out.println(env.getProperty("server.port"));
    System.out.println(env.getProperty("enterprise.subject[0]"));
    System.out.println(datasource);
    return "springboot is running";
  }
}
