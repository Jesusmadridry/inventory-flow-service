package com.inventory.persist;


import com.inventory.persist.common.CommonEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import com.inventory.model.Flow;
import org.hibernate.envers.Audited;


@Entity
@EqualsAndHashCode(callSuper=false)
@ToString(callSuper = true)
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class InventoryFlow extends CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productCode;
    private Long quantity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 5)
    private Flow flow;

}
