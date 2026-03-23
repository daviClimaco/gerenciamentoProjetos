package daviClimaco.gerenciamentoProjetos.services;

import daviClimaco.gerenciamentoProjetos.entity.Projeto;
import daviClimaco.gerenciamentoProjetos.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoServices {

    private ProjetoRepository projetoRepository;

    public ProjetoServices(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public void salvar(Projeto projeto){
        projetoRepository.save(projeto);
    }

    public void deletar(Long id){
        projetoRepository.deleteById(id);
    }

    public Projeto buscarPorId(Long id){
        return projetoRepository.findById(id).orElse(null);
    }

    public List<Projeto> buscarTodos(){
        return projetoRepository.findAll();
    }
}