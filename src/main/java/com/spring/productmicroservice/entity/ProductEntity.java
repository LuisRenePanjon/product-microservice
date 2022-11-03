package com.spring.productmicroservice.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter
@ToString
@NoArgsConstructor
@Document(value = "product")
public class ProductEntity {

    @Id
    private String id;
    private String productName;
    private String productDescription;
    private Double unitPrice;


}
