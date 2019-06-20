package processoselecao;

import java.util.*;
import java.util.ArrayList;

public class Vaga {
        String nomeEmpresa;
        String faixaSalarial;
        String cargo;
        int qtdVagas;
        int qtdCandidatos;
        
        //getters e setters
        
        public void setNomeEmpresa(String nE){
            this.nomeEmpresa = nE;
        }
        public String getNomeEmpresa(){
            return this.nomeEmpresa;
        }
        public void setFaixaSalarial(String fSalario){
            this.faixaSalarial=fSalario;
        }
        public String getFaixaSalarial(){
            return this.faixaSalarial;
        }
        public void setCargo(String c){
            this.cargo=c;
        }
        public String getCargo(){
            return this.cargo;
        }
        public void setQtdVagas(int qVagas){
            this.qtdVagas=qVagas;
        }
        public int getQtdVagas(){
            return this.qtdVagas;
        }
        public void setQtdCandidatos(int qtdCand){
            this.qtdCandidatos=qtdCand;
        }
        public int getQtdCandidatos(){
            return this.qtdCandidatos;
        }
        
        //Métodos
        


        ArrayList<Candidato> candidato = new ArrayList<Candidato>();

        public void addCandidato(String nome, int idade, String nacionalidade, String sexo, String cpf, String numeroPassaporte, String numeroReservista){
            Candidato candidato = new Candidato(nome,idade,nacionalidade,sexo,cpf,numeroPassaporte,numeroReservista);
            candidato.add(candidato); 
            qtdCandidatos++;
            }
   
        
        public void exibeCandidatos (){
            for (Candidato c : candidato){
              System.out.println("Nome: "+c.getNome);
              
            }
        }

    }