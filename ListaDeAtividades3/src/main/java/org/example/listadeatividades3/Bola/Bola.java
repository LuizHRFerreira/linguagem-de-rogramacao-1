package org.example.listadeatividades3.Bola;

public class Bola {

        private static String formato;
        private static String esporte;
        private static String cor;

        public Bola(String formato, String esporte, String cor) {
            this.formato = formato;
            this.esporte = esporte;
            this.cor = cor;
        }

        public static String chutar() {
            return "Chutou a bola";
        }

        public static String arremessar() {
            return "Arremessou a bola";
        }

        public static String pegar() {
            return "Pegou a bola";
        }

        public static String getFormato() {
            return formato;
        }

        public static String getEsporte() {
            return esporte;
        }

        public static String getCor() {
            return cor;
        }

    }