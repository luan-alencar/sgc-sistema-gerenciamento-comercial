package david.augusto.luan.sgc.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "TB_USUARIO")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {

    private static final long serialVersionUID = -3591529614279292916L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USUARIO")
    @SequenceGenerator(name = "SQ_USUARIO", sequenceName = "SQ_USUARIO", allocationSize = 1, initialValue = 1)
    private Long id;

    @Column(name = "PRIMEIRO_NOME")
    public String primeiroNome;

    @Column(name = "SEGUNDO_NOME")
    public String ultimoNome;

    @Column(name = "NOME")
    public String nome;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;

    @Column(name = "CHAVE_ACESSO")
    private String chaveUnica;

    @Column(name = "IS_ADMIN")
    private Boolean isAdmin;
}

