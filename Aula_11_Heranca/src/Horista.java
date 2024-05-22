public class Horista extends Empregado {
   private double horas;
   private double vl_horas;

   public Horista (String nome, String endereco, double horas, double vl_horas){
        super (nome, endereco);
        this.horas = horas;
        this.vl_horas = vl_horas;
   }

   public Horista (double horas){
        this.horas = horas;
   }
    public void set_horas (double horas){
       this.horas = horas;
    }
    public double get_horas(){
       return horas;
    }
    public void calcularSalario(){
       salario = horas * vl_horas;
    }
}
