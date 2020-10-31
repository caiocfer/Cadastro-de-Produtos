class DVD (codigo:Int,descricao:String,preco:Double,duracao:Int):Produto(codigo,descricao,preco){
    private var duracao:Int = duracao

    fun mostrar():String
    {
        return "\nDVD -> Codigo: " + this.codigo + " - " + this.descricao + " | " + this.duracao + " minutos | " + "R$ " + this.preco

    }



}