package org.example.listadeatividades4.TimeFutebol;

public class TimeFutebol {

        private static String nome;
        private static String paisDeOrigem;
        private static String cores;

        public TimeFutebol(String nome, String paisDeOrigem, String cores) {
            this.nome = nome;
            this.paisDeOrigem = paisDeOrigem;
            this.cores = cores;
        }

        public static String jogar() {
            return "O time está jogando";
        }

        public static String treinar() {
            return "O time está em treinamento";
        }

        public static String contratar() { return "Jogador Contratado!!";}

        public static String getNome(){ return nome;}

        public static String getPaisDeOrigem(){ return paisDeOrigem;}

        public static String getCores(){return cores;}
}
