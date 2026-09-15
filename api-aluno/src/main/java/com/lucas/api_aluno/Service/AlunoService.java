package com.lucas.api_aluno.Service;


import com.lucas.api_aluno.DTO.AlunoRequest;
import com.lucas.api_aluno.DTO.AlunoResponse;
import com.lucas.api_aluno.Model.Aluno;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


    @Service
    public class AlunoService {
        private final List<Aluno> alunos;

        private int id = 1;

        public AlunoService() {
            alunos = new ArrayList<>();
        }

        public List<AlunoResponse> listarAlunos(){

            List<AlunoResponse> alunosResponse = new ArrayList<>();

            for (Aluno a : alunos){
                alunosResponse.add(
                        new AlunoResponse(
                                a.getId(),
                                a.getNome(),
                                a.getEmail(),
                                a.getDataNascimento(),
                                a.getMedia()));
            }
            return alunosResponse;
        }

        public AlunoResponse obterAlunoPorId(int id){

            for (Aluno a : alunos){
                if (a.getId() == id){
                    return new AlunoResponse(id, a.getNome(), a.getEmail(),
                            a.getDataNascimento(), a.getMedia());
                }
            }
            return null;
        }

        public AlunoResponse cadastrarAluno(AlunoRequest request){

            alunos.add(new Aluno( id, request.getNome(), request.getEmail(), request.getSenha(),
                    request.getDataNascimento(), request.getMedia()));

            id++;

            Aluno alunoCadastrado = alunos.getLast();

            return new AlunoResponse(alunoCadastrado.getId(),
                                     alunoCadastrado.getNome(),
                                     alunoCadastrado.getEmail(),
                                     alunoCadastrado.getDataNascimento(),
                                     alunoCadastrado.getMedia());

        }

        public AlunoResponse atualizarAluno(int id, AlunoRequest request){
            for (Aluno a : alunos){
                if(a.getId() == id){
                        a.setNome(request.getNome());
                        a.setEmail(request.getEmail());
                        a.setDataNascimento(request.getDataNascimento());
                        a.setSenha(request.getSenha());
                        a.setMedia(request.getMedia());

                        return new AlunoResponse(a.getId(), a.getNome(), a.getEmail(), a.getSenha(), a.getDataNascimento(), a.getMedia());
                }


            }
        }

    }

