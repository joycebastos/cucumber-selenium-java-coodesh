# language: pt
Funcionalidade: Acessar a tela inicial da página Beta da Coodesh
  Eu como usuario do coodesh
  Quero acessar a tela inicial
  Para  para testar vários aspectos da página Beta da Coodesh

  Cenario: Validar se a página está carregando corretamente a home page
    Quando acessar a página beta da coodesh
    Então devo visualizar a logo da coodesh
    E devo visualizar a mensagem "Conectamos developers validados às empresas"
    E devo visualizar os menus "Ver Vagas", "Blog" e "Login"

  Cenario: Acessar a página Ver vagas
    Dado que estou na página inicial da coodesh
    Quando clicar no menu Ver Vagas
    Então devo ser redirecionada para a tela de vagas da codesh

  Cenario: Acessar a página Blog
    Dado que estou na página inicial da coodesh
    Quando clicar no menu Blog
    Então devo ser redirecionada para a tela do blog da codesh

  Cenario: Acessar a página Login
    Dado que estou na página inicial da coodesh
    Quando clicar no botao login
    Então devo ser redirecionada para a tela de login da codesh