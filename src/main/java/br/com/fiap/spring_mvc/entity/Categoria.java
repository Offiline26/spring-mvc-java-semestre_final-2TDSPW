package br.com.fiap.spring_mvc.entity;

public enum Categoria {
    TERROR("Terror"),
    ROMANCE("Romance"),
    COMEDIA("Cómedia"),
    FICCAO("FIcção"),
    SUSPENSE("Suspense"),
    FANTASIA("Fantasia"),
    BIOGRAFIA("Biografia"),
    TECNOLOGIA("Tecologia"),
    ;

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }
        public String getDescricao(){
        return descricao;
    }
}
