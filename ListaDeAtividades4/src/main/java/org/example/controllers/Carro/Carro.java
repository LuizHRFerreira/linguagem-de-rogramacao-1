package org.example.listadeatividades4.Carro;

public class Carro {

        private static String modelo;
        private static String fabricante;
        private static String cor;

        public Carro(String modelo, String fabricante, String cor) {
            this.modelo = modelo;
            this.fabricante = fabricante;
            this.cor = cor;
        }

        public static String ligar() {
            return "Carro ligado";
        }

        public static String desligar() {
            return "Carro desligado";
        }

        public static String acelerar() {
            return "O carro está acelerando";
        }

        public static String getModelo() {
            return modelo;
        }

        public static String getfabricante() {
            return fabricante;
        }

        public static String getCor() {
            return cor;
          }


}
