# lista_mercado_Back-End
Repositório de API da lista do mercado feito em Java &amp;&amp; SpringBoot


# Sistema Lista de Mercado
## Requisitos

- Ser capaz de gerenciar várias listas de mercado ( e marcar seu status como concluída ou não)
- Ser capas de cadastrar produtos e consultá-los
- Ser capaz de incluir produtos na lista e especificar suas quantidades, bem como marcar se o item já foi comprado ou não
- Ser capaz de atribuir valores aos itens comprados para depois ter uma gestão dos custos da lista
- Ser capaz de adicionar quantidades (kg, unidades, litros, etc...)

## Casos de Uso - Produto
### Cadastrar Produtos
- Informar o nome de um determinado produto e o sistema o armazena no banco

### Consultar produtos
- Informar palavras chaves para consultar ou menos buscar produtos a partir da lista
### Alterar dados de produtos
- basicamente alterar o nome do produto e termos  sua efetivação no banco de dados

## Casos de Uso - Lista
### Criação de listas
- Criar uma nova lista inserindo a data e o local onde foi feita a compra ( nome do supermercado/feira, etc...)
### Apagar uma Lista
- Remover uma lista que foi criada por engano e remover todos os seus itens  que foram criados
### Inserção de itens na lista
- Criar um item associando a outra lista e a um produto, bem como deixar disponível a possibilidade de modificar quantidade e preço que foi pago
### Alteração de itens da lista 
- Alterar apenas quantidade , preço pago e status
### Remoção de itens da lista
- Poder remover um item que foi cadastrado na lista
### Fechamento da lista
- Concluir a lista como sendo completa e gerar seu custo total a partir dos itens comprados 

