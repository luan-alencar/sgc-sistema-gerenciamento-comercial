package david.augusto.luan.sgc.service;

import david.augusto.luan.sgc.dominio.Usuario;
import david.augusto.luan.sgc.service.dto.UsuarioDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface EntityServiceGeneric<T> {

    List<T> findAll();

    T save(T entity);

    void delete(T entity);

    void deleteById(Long id);
}
