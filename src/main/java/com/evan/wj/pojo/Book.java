package com.evan.wj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "book")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter @Setter int id;

    @ManyToOne//多对一单向
    @JoinColumn(name="cid")////注释本表中指向另一个表的外键
    @Getter @Setter private Category category;

    @Getter @Setter String cover;
    @Getter @Setter String title;
    @Getter @Setter String author;
    @Getter @Setter String date;
    @Getter @Setter String press;
    @Getter @Setter String abs;

}


