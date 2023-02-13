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
@Table(name = "tblkisi")
public class Kisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isimSoyisim;

//    @ManyToOne
//    @JoinTable(name = "TblMusteri",
//            joinColumns = @JoinColumn(name ="MusteriID"),
//            inverseJoinColumns =@JoinColumn(name = "kiranumarasi"))
    @OneToMany(mappedBy = "kisi")
    @ToString.Exclude
    private List<Kiralama> kiralama;
}
