package br.com.fiap.spring_mvc.entity;

public enum Categoria {
    TERROR("Terror"),
    COMEDIA("Romance"),
    ACAO("Comédia"),
    ROMANCE("Ficção"),
    SUSPENSE("Suspense"),
    FANTASIA("Fantasia"),
    BIOGRAFIA("Biografia"),
    TECNOLOGIA ("Tecnologia");

    private String descricao;

    Categoria (String descricao){
        this.descricao=descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
