package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Disciplina;
import br.com.alunoonline.api.repository.DiscplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    DiscplinaRepository disciplinaRepository;

    public void criarDisciplina(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> listarDiscplinaDoProf(Long professorId) {
        return disciplinaRepository.findByProfessorId(professorId);
    }

    public Optional<Disciplina> buscarDisciplinaPorId(Long id) {
        return disciplinaRepository.findById(id);
    }

    public void deletarDisciplina(Long id) {
        disciplinaRepository.deleteById(id);
    }


    public void atualizarDisciplinaporId(Long id, Disciplina disciplina) {
        Optional<Disciplina> disciplinaBancoDeDados = buscarDisciplinaPorId(id);

        if(disciplinaBancoDeDados.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        Disciplina disciplinaEditar = disciplinaBancoDeDados.get();

        disciplinaEditar.setNome(disciplina.getNome());
        disciplinaEditar.setCargaHoraria(disciplina.getCargaHoraria());
        disciplinaEditar.setProfessor(disciplina.getProfessor());

        disciplinaRepository.save(disciplinaEditar);
    }
}

