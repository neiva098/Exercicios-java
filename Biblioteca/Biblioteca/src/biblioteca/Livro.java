/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author cantarino
 */
public class Livro {
    private String isbn;
    private String titulo;
    private String nEdicao;
    private String copyright;
    private String imagem;
    private Editoras editora;
    private ArrayList<Autor> autores;
    private String preco;
    private int id;

    public Livro() {
        this.isbn = "";
        this.titulo = "";
        this.nEdicao = "";
        this.copyright = "";
        this.imagem = "";
        this.editora = new Editoras();
        autores = new ArrayList<>();
        this.id = 0;
        this.preco = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getnEdicao() {
        return nEdicao;
    }

    public void setnEdicao(String nEdicao) {
        this.nEdicao = nEdicao;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Editoras getEditora() {
        return editora;
    }

    public void setEditora(Editoras editora) {
        this.editora = editora;
    }

    public Autor[] getAutores() {
        Iterator it = autores.iterator();
        Autor a[] = new Autor[autores.size()];
        int i=0;
        while(it.hasNext()){
            Autor aux = (Autor) it.next();
            a[i] = aux;
            i++;
        }
        return a;
    }

    public void setAutor(Autor a) {
        autores.add(a);
    }    

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    
    
}
