package org.example.listadeatividades4.Felino;

public class Felino {

        private static String especie;
        private static String tamanho;
        private static String cor;

        public Felino(String especie, String tamanho, String cor) {
            this.especie = especie;
            this.tamanho = tamanho;
            this.cor = cor;
        }

        public static String dormir() {
            return "O animal está dormindo";
        }

        public static String comer() {
            return "O animal está comendo";
        }

        public static String alongar() {
            return "O animal está se alongando";
        }

        public static String getEspecie() {
            return especie;
        }

        public static String getTamanho() {
            return tamanho;
        }

        public static String getCor() {
            return cor;
        }
}
