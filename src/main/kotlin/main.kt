fun main() {

    val livro = ArrayList<Livro>()
    val dvd = ArrayList<DVD>()
    val cd = ArrayList<CD>()

    do{

        print("\nMenu:\n" +
                "1 - Cadastrar Livros\n" +
                "2 - Cadastrar CD\n" +
                "3 - Cadastrar DVD\n" +
                "4 - Mostrar Livros\n" +
                "5 - Mostrar CD\n" +
                "6 - Mostrar DVD\n" +
                "0 - Sair\n"+
                "Escolha: ")
        var op:Int = Integer.valueOf(readLine())
        if(op==1)
        {
            println("\nCadastro de Livros")
            val cod:Int = livro.size + 1
            print("Descricao: ")
            val descricao:String = readLine()!!.toString()
            print("Preço: R$")
            val preco:Double = readLine()!!.toDouble()
            print("Editora: ")
            val editora:String = readLine()!!.toString()
            print("Numero de Paginas: ")
            val paginas:Int = readLine()!!.toInt()

            val cadLivro = Livro(cod,descricao,preco,editora,paginas)
            livro.add(cadLivro)

        }

        if(op==2)
        {
            println("\nCadastro de CDs")
            val cod:Int = cd.size +1
            print("Descrição: ")
            val descricao:String = readLine()!!.toString()
            print("Preço: R$")
            val preco:Double = readLine()!!.toDouble()
            print("Numero de faixas: ")
            val faixas:Int = readLine()!!.toInt()
            val cadCD = CD(cod,descricao,preco,faixas)
            cd.add(cadCD)
        }

        if(op==3)
        {
            println("\nCadastro de DVDs")
            val cod:Int = dvd.size + 1
            print("Descrição: ")
            val descricao:String = readLine()!!.toString()
            print("Preço: R$")
            val preco:Double = readLine()!!.toDouble()
            print("Duração: ")
            val duracao:Int = readLine()!!.toInt()
            val cadDVD = DVD(cod,descricao,preco,duracao)
            dvd.add(cadDVD)

        }

        if(op==4)
        {
            if(livro.size == 0)
            {
                print("Nenhum Livro cadastrado")
            }
            else{
                print("Consulta Livros")
                for(i in livro)
                {
                    print(i.mostrar())
                }
            }

        }

        if(op==5)
        {
            if(cd.size == 0)
            {
                print("Nenhum CD cadastrado")
            }
            else
            {
                print("Consulta CD")
                for(i in cd)
                {
                    print(i.mostrar())
                }
            }
        }

        if(op==6)
        {
            if(dvd.size == 0)
            {
                print("Nenhum DVD cadastrado")
            }
            else
            {
                print("Consulta DVD")
                for(i in dvd)
                {
                    print(i.mostrar())
                }
            }

        }

        if(op==0)
        {
            println("Obrigado!!")
            break
        }

    }while(op>0)


}




