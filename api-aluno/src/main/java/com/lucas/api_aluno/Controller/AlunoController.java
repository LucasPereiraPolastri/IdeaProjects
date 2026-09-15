package com.lucas.api_aluno.Controller;

import com.lucas.api_aluno.DTO.AlunoRequest;
import com.lucas.api_aluno.DTO.AlunoResponse;
import com.lucas.api_aluno.Model.Aluno;
import com.lucas.api_aluno.Service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/alunos")
    public class AlunoController {

        private final AlunoService service;

        public AlunoController(AlunoService service){
            this.service = service;
        }

        @GetMapping
        public List<AlunoResponse> listarAlunos(){
            return service.listarAlunos();
        }

        @GetMapping("/{id}")
        public AlunoResponse obterAlunoPorId(@PathVariable int id){
            return service.obterAlunoPorId(id);
        }

        @PostMapping("/cadastrar")
        public AlunoResponse cadastrarAluno(@Valid @RequestBody  AlunoRequest request){
           return service.cadastrarAluno(request);
        }
    }




