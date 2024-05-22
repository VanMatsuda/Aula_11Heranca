public class Mensalista extends Empregado {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //Construtor
    public Mensalista (String nome, String endereço, String cargo){
        super(nome, endereço);
        this.cargo = cargo;
    }
    public void calcularSalario (){
        if(cargo.equals ("Junior")){ //equals para comparar texto
            salario = 2500;
        }else if (cargo.equals ("Pleno")){
            salario = 3500;
        }else if (cargo.equals ("Senior")){
            salario = 5500;
        }
    }
}
