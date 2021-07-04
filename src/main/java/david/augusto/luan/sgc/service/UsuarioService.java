package david.augusto.luan.sgc.service;

import david.augusto.luan.sgc.service.dto.DominioFixoDTO;
import david.augusto.luan.sgc.service.dto.UsuarioDTO;
import david.augusto.luan.sgc.service.exceptions.RegraNegocioException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface UsuarioService extends ServiceGenericEntity<UsuarioDTO> {

    @Override
    List<UsuarioDTO> buscarTodos();

    List<DominioFixoDTO> obterPorCpf(String cpf);

    @Override
    UsuarioDTO salvar(UsuarioDTO entity);

    @Override
    void delete(UsuarioDTO entity);

    @Override
    UsuarioDTO buscarPorId(Integer id) throws RegraNegocioException;
}