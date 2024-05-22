public class FolhaPGTO {

    public static void main (String args[]){
        Mensalista men1, men2;
        Horista hora1, hora2;
    
        men1 = new Mensalista("Vanessa", "Rua Paraibuna","Junior");
        men1.calcularSalario();
        men1.calcularINSS();
        men1.calcularIRPF();
        men1.imprimir();
       
        men2 = new Mensalista("Ana", "Rua Feliz", "Pleno");
        men2.calcularSalario();
        men2.calcularINSS();
        men2.calcularIRPF();
        men2.imprimir();

        hora1 = new Horista("Carlos", "Rua: Central", 20, 50);
        hora1.calcularSalario();
        hora1.imprimir ();
       
        hora2 = new Horista("Cristina", "Rua: das Flores", 100, 50);
        hora2.calcularSalario();
        hora2.imprimir();
    }
        
}
