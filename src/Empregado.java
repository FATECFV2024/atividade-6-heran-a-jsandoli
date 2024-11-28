public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;
    
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    //Metodos de acesso

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public double calcularIrpf(){
        double aux;
        if (salario < 1800) {
            aux = 0.1 * salario;
        } else {
            aux = 0.27 * salario;
        }
        return(aux);
    }

    public double calcularInss(){
        return(0.11 * salario);
    }

    public void printDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Endereco: " + endereco);
        
    }
    
}
