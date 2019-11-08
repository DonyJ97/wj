package com.evan.wj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class User {
    @Id//主键标识
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    定义生成规则，JPA提供的四种标准用法为TABLE,SEQUENCE,IDENTITY,AUTO
//    TABLE：使用一个特定的数据库表格来保存主键。
//    SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
//    IDENTITY：主键由数据库自动生成（主要是自动增长型）
//    AUTO：主键由程序控制
    @Column(name = "id")
    @Getter @Setter
    int id;
    @Getter @Setter
    String username;
    @Getter @Setter
    String password;
}

