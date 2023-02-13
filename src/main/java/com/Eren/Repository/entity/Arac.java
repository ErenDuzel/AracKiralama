package com.Eren.Repository.entity;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblarac")
public class Arac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int durum=0;
    private String marka;
    private String model;
//    @ManyToOne
//    @JoinTable(name = "Araclar",
//            joinColumns = @JoinColumn(name ="AracID"),
//            inverseJoinColumns =@JoinColumn(name = "kiranumarasi"))
    @OneToMany(mappedBy = "arac")
    @ToString.Exclude
    private List<Kiralama> kiralama;


}
