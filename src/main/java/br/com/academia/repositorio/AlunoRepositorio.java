package br.com.academia.repositorio;

import br.com.academia.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{
}
