package student_control_system;

public class Student {
    private int matricula;
    private String nome;
    private int idade;
    private double notaFinal;

    public Student(int matricula){
        this.matricula = matricula;
    }
    //getters 
    public int getMatricula(){
        return this.matricula;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getNotaFinal(){
        return this.notaFinal;
    }
    //setters
    public void setNome(String nome){
        if (nome == null || nome.isEmpty()){
            System.out.println("O nome não pode ser vazio");
        } 
        else{
            this.nome = nome;
        }
        
    }
    public void setIdade(int idade){
        if (idade < 0 || idade > 120){
            System.out.println("O idade deve ser entre 0 e 120");
        }
        else{
            this.idade = idade;
        }
        
    }
    public void setNotaFinal(double notaFinal){
        if (notaFinal < 0 || notaFinal > 10)
            System.out.println("a nota invalida");
        else{
            this.notaFinal = notaFinal;
        }   
    }

    public void status(){
        System.out.printf("matricula: %d \nnome: %s \nidade: %d \nnota final: %.1f", matricula, nome, idade, notaFinal);
    }
}
