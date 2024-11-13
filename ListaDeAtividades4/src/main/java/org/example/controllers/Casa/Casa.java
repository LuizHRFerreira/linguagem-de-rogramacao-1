package org.example.listadeatividades4.Casa;

public class Casa {

        private static String tamanho;
        private static String cor;
        private static String funcionalidade;

        public Casa(String tamanho, String cor, String funcionalidade) {
            this.tamanho = tamanho;
            this.cor = cor;
            this.funcionalidade = funcionalidade;
        }

        public static String entrar() {
            return "Entrou da casa";
        }

        public static String sair() {
            return "Saiu da casa";
        }

        public static String tocarCampainha() {
            return "Tocou a campainha";
        }

        public static String getTamanho(){
            return tamanho;
        }

        public static String getCor(){
            return cor;
        }

        public static String getfuncionalidade(){
            return funcionalidade;
        }

}
