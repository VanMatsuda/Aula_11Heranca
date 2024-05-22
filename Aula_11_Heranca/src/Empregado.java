public class Empregado {
    protected String nome;
    protected String endereço;
    protected double salario;
    
    public Empregado(String nome, String endereço) {
       this.nome = nome;
       this.endereço = endereço;
       
    }

    public Empregado (){

    } 

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIRPF(){
        double aux = 0;
        if (salario >= 2112.01 && salario <= 2826.66){
            aux = 0.075 * salario;
        } else if (salario >= 2826.67 && salario <= 3751.05) {
            aux = 0.15 * salario;
        } else if (salario >= 3751.06  && salario <= 4664.68) {
            aux = 0.225 * salario;
        } else if (salario > 4664.68) {
            aux = 0.275 * salario;
        }
        return (aux);
    }

   public double calcularINSS(){
        double aux = 0;
        if (salario <= 1412){
            aux = salario * 0.075;
        }else if (salario > 1412 && salario < 2667){
            aux = salario * 0.09;
        }else if (salario > 2667 && salario > 4000){
            aux = salario * 0.12;
        }else if (salario > 4000){
            aux = salario * 0.14;
        }
        return aux;
   }    
   
}
