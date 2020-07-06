package vendaimoveis;

public class Imovel {
    
    public String nome;
    public String desc;
    public String categ;
    public String tipo;
    public String venda;

    public Imovel() {
    }

    public Imovel(String nome, String desc, String categ, String tipo, String venda) {
        this.nome = nome;
        this.desc = desc;
        this.categ = categ;
        this.tipo = tipo;
        this.venda = venda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVenda() {
        return venda;
    }

    public void setVenda(String venda) {
        this.venda = venda;
    }

    @Override
    public String toString() {
        return "Imovel{" + "nome=" + nome + ", desc=" + desc + ", categ=" + categ + ", tipo=" + tipo + ", venda=" + venda + '}';
    }
    
}