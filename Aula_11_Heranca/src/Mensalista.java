public class Mensalista extends Empregado {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //Construtor
    public Mensalista (String nome, String endereço, double salario, String cargo){
        super(nome, endereço, salario);
        this.cargo = cargo;
    }
    public void calcularSalario (){
        if(cargo.equals ("Junior")){ //equals para comparar texto
            salario = 2.500;
        }else if (cargo.equals ("Pleno")){
            salario = 3500;
        }else {
            salario = 5500;
        }
    }
}
