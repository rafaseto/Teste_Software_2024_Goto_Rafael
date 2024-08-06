# Atividade 1
## Testes Unitários e o Stack Overflow
## Rafael Takeguma Goto

### Busca no Stack Overflow
	Para o propósito desta atividade, foi necessário buscar e selecionar uma pergunta no Stack Overflow, relacionada a testes de unidade. Dessa maneira, foi realizada uma busca na barra de pesquisa do website com a seguinte string de busca: [unit-testing].

	A fim de atender o critério pré-estabelecido, de 400 votos mínimos, para a seleção da pergunta, foi utilizado o filtro “Highest score” para visualizar as perguntas em ordem decrescente com relação ao número de votos. Desse modo, foi possível encontrar uma pergunta relacionada a execução de testes de unidade por meio de linha de comando usando Maven. A pergunta também possui uma resposta certa, ou seja, atende aos dois critérios pré-estabelecidos.

### Pergunta Escolhida
    A pergunta escolhida para a realização desta atividade envolve execução de testes com maven, ferramenta de gerenciamento de projetos Java. Realizada por BillMan, a pergunta possui 718 votos e uma resposta correta.

    Esta pergunta foi selecionada por atender aos critérios pré-estabelecidos e por tratar diretamente com testes unitários de métodos de testes definidos em classes, de modo que é possível pôr em prática conceitos vistos em aula, no que tange testes unitários.

    Cadastrada em 2009, essa pergunta busca o procedimento que deve ser realizado para executar um método de teste em específico com o comando mvn, sendo o comando para realizar todos os métodos de uma classe previamente conhecido: mvn test -Dtest=classname.

### Reprodução do Problema
    Para reproduzir e descrever o problema em questão, foi utilizado o AWS Cloud9, IDE em nuvem da AWS. De modo a ilustrar a situação em que existem vários métodos de teste, foram criadas duas classes com extensão java: Main e MyTest.

    O arquivo Main.java é uma classe que define métodos básicos para as operações aritméticas de adição, subtração e multiplicação. Esta é a classe que foi testada por meio de testes unitários, definidos em MyTest.java.

    Para testar os métodos definidos na classe Main, cada um deles possui um teste unitário respectivo, implementado no arquivo MyTest.java. Os métodos de teste definidos na classe MyTest tem a função de verificar se as unidades da classe Main funcionam conforme o esperado.
    
    Todos os métodos definidos em MyTest possuem a anotação @Test para denotar que são métodos de teste. Ademais, todos os métodos de teste possuem o comando assertEquals, que verifica se o resultado obtido é coerente com o resultado esperado.

    Com o intuito de seguir o layout de diretórios padrão recomendado no site oficial do Apache Maven, a estrutura de diretórios e arquivos do projeto está organizada da seguinte maneira
    - src
        - main
            - java
            - com 
            - example
        - test
            - java
            - com
            - example

    Para configurar o JUnit no projeto Maven, foi adicionada a dependência de JUnit no arquivo pom.xml. 

    Para reproduzir o comando de executar todos os testes de uma classe, foi necessário fazer a instalação do Maven, por meio de sudo apt install maven.

    Utilizou-se o comando mvn –version para se certificar que o maven foi de fato instalado com sucesso. A versão utilizada nesta atividade é a Apache Maven 3.6.3.	

    Uma vez concluída a configuração do ambiente de desenvolvimento, foi possível reproduzir o comando que o usuário informou ter conhecimento, na pergunta cadastrada no Stack Overflow. 
    
    Segundo o usuário, o comando mvn test -Dtest=nome_da_classe executa todos os métodos de teste definidos em uma classe. Utilizando este comando, no total foram realizados três testes, com zero falhas e zero erros.

### Solução
    O problema enfrentado pelo usuário, no entanto, é que ele gostaria de fazer um procedimento na linha de comando, similar ao de executar todos os testes, porém para apenas um teste em específico.

    A resposta certa escolhida pelo Stack Overflow, traz uma solução para o problema conforme requisitado pelo usuário que realizou a pergunta. Com 959 votos, a resposta em questão, explica como utilizar o comando mvn para executar um teste específico de uma determinada classe, por meio da linha de comando.

    De acordo com essa resposta, é possível adicionar o nome do teste que se deseja executar com #nome_do_teste no final do comando que foi utilizado até então, mvn test -Dtest=nome_da_classe. Desse modo, apenas o teste especificado será executado.

    Para aplicar a resposta escolhida no ambiente configurado, foi escolhido o método testMultiply() da classe MyTest. Pode-se observar que, diferentemente da execução anterior, que englobava todos os testes, a execução de apenas um dos métodos de teste deixou de gerar três execuções bem-sucedidas, e passou a gerar apenas uma.

### Outras respostas
    Esta seção é destinada a discussão das demais respostas que não foram classificadas como corretas pelo Stack Overflow. Além da resposta que foi reproduzida, a pergunta em questão recebeu outras 13 respostas.

    Esta segunda resposta traz uma solução idêntica a primeira, todavia foi respondida no ano de 2020, enquanto a correta foi cadastrada em 2011. Além de resolver o problema em questão, o usuário que escreveu a resposta, também trouxe soluções para casos similares.

    A próxima resposta traz uma solução com um framework diferente do JUnit, o TestNG. Esta resposta foi cadastrada no mesmo dia da pergunta, contudo não foi classificada como correta. Um possível motivo que impediu que essa resposta fosse a escolhida, é o fato de que foi necessário criar um grupo que agrupasse os testes, de modo que não seria a solução mais simples e direta.

    A próxima solução é similar à escolhida, com uma mudança sutil na sintaxe do comando. De acordo com essa resposta, o comando para solucionar o exemplo da classe MyTest seria mvn “-DTest=MyTest#testMultiply test”. A possível causa que torna essa resposta pior do que a escolhida, é porque a sintaxe utilizada não é a forma padrão de executar testes com o Maven.

### Vídeo Tutorial
O vídeo tutorial elaborado para esta atividade pode ser acessado por meio do seguinte link: https://drive.google.com/file/d/1KBgNF1IpdqOupgg15Cz0JJQ2o-oZTpPn/view?usp=sharing 





