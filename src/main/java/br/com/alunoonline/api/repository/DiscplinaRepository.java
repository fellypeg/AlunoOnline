package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.List;

@Repository
public interface DiscplinaRepository extends JpaRepository<Disciplina, Long> {
   List<Disciplina> findByProfessorId(Long professorId);
}

