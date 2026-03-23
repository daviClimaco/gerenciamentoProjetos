package daviClimaco.gerenciamentoProjetos.controller;

import daviClimaco.gerenciamentoProjetos.entity.Projeto;
import daviClimaco.gerenciamentoProjetos.services.ProjetoServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("projetos")
public class ProjetoController {

    private ProjetoServices projetoServices;

    public ProjetoController(ProjetoServices projetoServices) {
        this.projetoServices = projetoServices;
    }

    @PostMapping
    public void salvar(@RequestBody Projeto projeto){
        projetoServices.salvar(projeto);
    }

    @GetMapping
    public List<Projeto> buscarTodos(){
        return projetoServices.buscarTodos();
    }

    @GetMapping("{id}")
    public Projeto buscarPorId(@PathVariable Long id){
        return projetoServices.buscarPorId(id);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id){
        projetoServices.deletar(id);
    }
}