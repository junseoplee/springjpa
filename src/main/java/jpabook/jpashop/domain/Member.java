package jpabook.jpashop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

  @Id @GeneratedValue
  private Long id;

  private String name;
  private Address adderss;

  private List<Order> orders = new ArrayList<>();
}
