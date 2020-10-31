class Livro(codigo: Int,
            descricao: String,
            preco: Double,
            editora:String,
            paginas:Int) : Produto(codigo, descricao, preco) {

    private var editora:String = editora
    private var paginas:Int = paginas

    fun mostrar():String{
        return "\nLivro -> Codigo: " + this.codigo + " - " + this.descricao + "| Editora: " + this.editora + " | Paginas: " + this.paginas + " | R$" + this.preco
    }




}