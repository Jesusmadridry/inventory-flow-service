package inv.persist;


import inv.persist.common.CommonEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import model.Flow;

@Entity
@EqualsAndHashCode(callSuper=false)
@ToString(callSuper = true)
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryFlow extends CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productId;

    @Enumerated(EnumType.STRING)
    private Flow flow;
}
