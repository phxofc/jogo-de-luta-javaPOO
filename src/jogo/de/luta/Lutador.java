package jogo.de.luta;
public class Lutador {
    
    //atributos
    
    private String nome,nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias,derrotas,empates;
    private int id;
    
    
    
    
    //metodos publicos
    public void apresentar(){   
        System.out.println("---------APRESENTAÇÃO---------");
        System.out.println("ID: "+this.getId());
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("idade: "+this.getIdade());
        System.out.println("altura: "+this.getAltura());
        System.out.println("peso: "+this.getPeso());
        System.out.println("categoria: "+this.getCategoria());
        System.out.println("vitorias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("----------FIM DA APRESENTAÇÃO--------");
    }
    public void status(){   
         System.out.println("---------STATUS---------");
        System.out.println("Lutador: "+this.getNome());
        System.out.println("categoria: "+this.getCategoria());
        System.out.println("vitorias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("----------FIM DO STATUS--------");
    }
    public void ganharLuta(){ 
        this.setVitorias(this.getVitorias() +1);
    }
    public void perderLuta(){ 
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){     
        this.setEmpates(this.getEmpates()+1);
    }
 
    //metodos especiais

    public Lutador(int id,String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
       this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
       //gettes e setter
    public int getId() {
        return id;
    }

 
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

   private void setCategoria() {
        
        if(this.peso<52.2){
            this.categoria = "Invalido";
            
        }else if (this.peso <=70.2){
            this.categoria ="leve";
        }else if (this.peso <=83.9){
            this.categoria = "medio";
        }else if (this.peso <=120.2){
            this.categoria ="pesado";
        }else{
            this.categoria= "invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
   
    
    
    
}
