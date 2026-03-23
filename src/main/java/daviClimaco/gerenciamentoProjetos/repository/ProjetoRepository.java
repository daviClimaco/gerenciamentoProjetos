package daviClimaco.gerenciamentoProjetos.repository;

import daviClimaco.gerenciamentoProjetos.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}