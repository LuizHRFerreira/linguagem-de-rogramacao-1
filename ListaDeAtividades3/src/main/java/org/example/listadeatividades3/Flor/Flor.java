package org.example.listadeatividades3.Flor;

public class Flor {

        private static String especie;
        private static String cor;
        private static String preco;

        public Flor(String especie, String cor, String preco) {
            this.especie = especie;
            this.cor = cor;
            this.preco = preco;
        }

        public static String nascer() {
            return "A flor nasceu!!";
        }

        public static String crescer() {
            return "A flor cresceu!!";
        }

        public static String cheirar() {
            return "Você gostou muito do cheiro dessa flor!!";
        }

        public static String getEspecie() { return especie; }
        public static String getCor() { return cor; }
        public static String getPreco() { return preco; }

    }

