class CD(codigo:Int,descricao:String,preco:Double,faixas:Int): Produto(codigo, descricao, preco)
{
    private var faixas:Int = faixas


    fun mostrar():String
    {
        return "\nCD -> Codigo: " + this.codigo + " - " + this.descricao + " | " + "Faixas: " + this.faixas +" | " + "R$ " + this.preco

    }


}
