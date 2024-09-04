package Aula31.ExemploAbstrato;

    public abstract class Figura {
        private String nomeFigura;

        public String getNomeFigura(){
            return nomeFigura;
        }

        public void setNomeFigura(String nomeFigura){
            this.nomeFigura = nomeFigura;
        }

        public abstract double calcularArea();

        public abstract double calcularPerimetro();

        @Override
        public String toString(){
            String retorno = "Nome:"+nomeFigura;
            retorno+="\nÁrea: "+calcularArea();
            retorno+="\nPerimetro: "+calcularPerimetro();
            return retorno;
        }

        public abstract double calculaArea();

        public abstract double calculaPerimetro();
    }


