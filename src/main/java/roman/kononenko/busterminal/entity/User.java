package roman.kononenko.busterminal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String password;

    private String sex;

    private String email;

    private boolean privilege;

    @OneToOne
    private Cart cart;

    @ManyToMany(mappedBy = "users")
    private List<BusTerminal> busTerminals = new ArrayList<>();

}
