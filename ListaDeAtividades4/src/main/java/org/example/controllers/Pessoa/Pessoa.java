package org.example.listadeatividades4.Pessoa;

public class Pessoa {

        private static String nome;
        private static String genero;
        private static String dataDeNascimento;

        public Pessoa(String nome, String genero, String dataDeNascimento) {
            this.nome = nome;
            this.genero = genero;
            this.dataDeNascimento = dataDeNascimento;
        }

        public static String andar() {
            return "A pessoa está andando";
        }

        public static String falar() {
            return "A pessoa está falando";
        }

        public static String dormir() {
            return "A pessoa está dormindo";
        }

        public static String getNome() {return nome;}
        public static String getGenero() {return genero;}
        public static String getDataDeNascimento() {return dataDeNascimento;}
}
