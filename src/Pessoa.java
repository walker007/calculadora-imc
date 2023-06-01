public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double imc;

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getImc(){
        return this.imc;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void calculaImc(){
        double imc = this.getPeso() / Math.pow(this.getAltura(),2);

        this.setImc(imc);
    }

    public String classificaIMC(){
        if (this.getImc() < 16){
            return "Magreza Grau III - Vai comer";
        }

        if(this.getImc() >= 16 && this.getImc() <= 16.9){
            return "Magreza Grau II";
        }

        if(this.getImc() >=17 && this.getImc() <=18.4){
         return "Magreza Grau I";
        }

        if(this.getImc() >= 18.5 && this.getImc() <=24.9){
            return "Peso Ideal - Parabéns";
        }

        if(this.getImc() >= 25 && this.getImc() <=29.9){
            return "Sobrepeso - Cuidado";
        }

        if(this.getImc() >=30 && this.getImc() <=34.9){
            return "Obesidade Grau I - Está ficando perigoso";
        }

        if(this.getImc() >= 35 && this.getImc() <= 40){
            return "Obesidade Grau II - Vai Fazer uma dieta";
        }

        return "Obesidade Grau III - Parabéns Alcançou a Thais Carla";
    }

    public String toString() {
        return "Pessoa{" +
                "nome: "+this.getNome()+"," +
                " idade: "+this.getIdade()+"," +
                " altura: "+this.getAltura()+"," +
                " peso: "+this.getPeso()+"," +
                " imc: "+this.getImc()+
                "}";
    }
}
