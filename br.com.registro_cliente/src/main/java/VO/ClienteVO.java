package VO;

import java.util.Date;
import validacao.Valid;

public class ClienteVO {
        Valid valid = new Valid();

        private Integer cod;
        private String nome;
        private String numero;
        private String email;
        private String cep;
        private Date nasci;
        

        public Integer getCod() {
                return this.cod;
        }

        public void setCod(Integer cod) {
                this.cod = cod;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }
        
        public String getEmail() {
                return this.email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getCep() {
                return cep;
        }
        public void setCep(String cep) {
                this.cep = cep;
        }
        public Date getNasci() {
                return this.nasci;
        }

        public void setNasci(Date nasci) {
                this.nasci = nasci;
        }
}